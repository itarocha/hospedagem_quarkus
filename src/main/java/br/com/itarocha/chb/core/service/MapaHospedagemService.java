package br.com.itarocha.chb.core.service;

import br.com.itarocha.chb.domain.*;
import br.com.itarocha.chb.domain.hospedagem.*;
import br.com.itarocha.chb.domain.strategy.ClasseCelulaStrategy;
import br.com.itarocha.chb.ports.in.MapaHospedagemUseCase;
import br.com.itarocha.chb.ports.in.QuartoUseCase;
import br.com.itarocha.chb.ports.out.HospedeMapaRepository;
import br.com.itarocha.chb.ports.out.LeitoRepository;
import br.com.itarocha.chb.utils.LocalDateUtils;
import lombok.RequiredArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static br.com.itarocha.chb.utils.LocalDateUtils.buildRangeDias;
import static java.time.temporal.ChronoUnit.DAYS;

@ApplicationScoped
@RequiredArgsConstructor
public class MapaHospedagemService implements MapaHospedagemUseCase {

    private final QuartoUseCase quartoService;
    private final LeitoRepository leitoRepository;
    private final HospedeMapaRepository hospedeMapaRepository;
    private final ClasseCelulaStrategy classeCelulaStrategy;

    private static final int QTD_DIAS = 7;

    public MapaRetorno buildMapaRetorno(LocalDate dataBase) {
        LocalDate dIni = LocalDateUtils.primeiroDiaDaSemana(dataBase);
        LocalDate dFim = dIni.plusDays(QTD_DIAS - 1);
        List<LocalDate> rangeDias = buildRangeDias(dIni, QTD_DIAS);

        LocalDateTime startDate = LocalDateTime.now();
        List<HospedeMapa> listaHospedeMapa = hospedeMapaRepository.buildListaHospedeMapa(dIni, dFim);
        LocalDateTime endDate = LocalDateTime.now();
        long diff = ChronoUnit.MILLIS.between(startDate, endDate);
        System.out.println("Diferença de tempo em millisegundos: " + diff);

        listaHospedeMapa.sort(Comparator.comparing(HospedeMapa::getPessoaNome));

        List<LinhaHospedagem> listaLinhaHospedagem = listaHospedeMapa.stream()
                .map(hm -> {
                    // CLASSE css: Indica status da primeira e da última situação no leito
                    ClasseInicioEnum classeIni = classeCelulaStrategy.resolveClasseIni(hm);
                    ClasseFimEnum classeFim = classeCelulaStrategy.resolveClasseFim(hm);

                    // ARRAY de dias na semana em que 0 = vazio; 1 = preenchido
                    int iIni = Math.toIntExact(DAYS.between(dIni, hm.getDataIniNoPeriodo() ));
                    int iFim = Math.toIntExact(DAYS.between(dIni, hm.getDataFimNoPeriodo() ));

                    int[] array_dias = IntStream.range(0,QTD_DIAS).map(s -> 0).toArray();
                    Arrays.fill(array_dias, iIni, iFim+1, 1);

                    //IntStream.rangeClosed(iIni, iFim).forEach(n -> _dias[n] = 1);
                    Integer[] dias = Arrays.stream(array_dias).boxed().toArray(Integer[]::new);

                    return LinhaHospedagem
                            .builder()
                            .leitoId(hm.getLeitoId())
                            .quartoId(hm.getQuartoId())
                            .leitoNumero(hm.getLeitoNumero())
                            .quartoNumero(hm.getQuartoNumero())
                            .identificador(hm.getIdentificador())
                            .hpdId(hm.getHospedagemId())
                            .status(hm.getStatusHospedagem().toString())
                            .nome(hm.getPessoaNome())
                            .telefone(hm.getPessoaTelefone())
                            .clsIni(classeIni.getDescricao())
                            .clsFim(classeFim.getDescricao())
                            .idxIni(iIni)
                            .idxFim(iFim)
                            .width((iFim - iIni + 1)*100)
                            .dias(dias)
                            .build();
        }).collect(Collectors.toList());

        Map<Long, List<LinhaHospedagem>> mapaLeitoHospedagem = buildMapaLeitoHospedagem(listaLinhaHospedagem);
        List<MicroLeitoHospedagens> microLeitoHospedagens = buildListaMicroLeitos(mapaLeitoHospedagem);
        List<CidadeHospedagens> cidadesHospedagem = buildPorCidade(listaHospedeMapa);
        Quadro quadro = buildQuadro(listaLinhaHospedagem);

        return MapaRetorno.builder()
                .dataIni(dIni)
                .dataFim(dFim)
                .linhas(microLeitoHospedagens)
                .hospedes(listaHospedeMapa)
                .cidades(cidadesHospedagem)
                .dias(rangeDias)
                .quadro(quadro)
                .build();
    }

    private Map<Long, List<LinhaHospedagem>> buildMapaLeitoHospedagem(List<LinhaHospedagem> listaLinhaHospedagem) {
        return listaLinhaHospedagem.stream().collect(Collectors
                .groupingBy(LinhaHospedagem::getLeitoId,
                        Collectors.mapping(Function.identity(), Collectors.toList())
                ));
    }

    private List<CidadeHospedagens> buildPorCidade(List<HospedeMapa> hospedes){
        return hospedes.stream()
                .collect(Collectors.groupingBy(HospedeMapa::getPessoaCidadeUfOrigem,
                    Collectors.mapping(HospedeMapa::getIdentificador, Collectors.toList())
                )).entrySet()
                .stream()
                .map(e -> CidadeHospedagens.builder()
                        .nome(e.getKey())
                        .ids(e.getValue())
                        .build())
                .collect(Collectors.toList());
    }

    private Quadro buildQuadro(List<LinhaHospedagem> listaLinhaHospedagem){
        // Busca quartos e leitos do banco
        List<QuartoResumido> listagemQuartos = quartoService.findQuartosResumidos();

        var lstLeitos = listagemQuartos.stream()
                .map(QuartoResumido::getLeitos)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        List<Integer> lstNumeros = lstLeitos.stream()
                .map(LeitoResumido::getNumero)
                .collect(Collectors.toList());

        Integer minimum = Collections.min(lstNumeros);
        Integer maximum = Collections.max(lstNumeros);

        // Cria um agrupamento de quartos <quartoNum, leitos.minimum, leitos.maximum>
        List<QuartoLeitos> listQuartosLeitos = listagemQuartos
                .stream()
                .map(q -> QuartoLeitos.builder()
                            .id(q.getId())
                            .numero(q.getNumero())
                            .minimum(minimum)
                            .maximum(maximum)
                            .build())
                .collect(Collectors.toList());

        List<QuadroQuarto> quartos = listagemQuartos.stream()
                .map(q -> QuadroQuarto.builder()
                    .id(q.getId())
                    .numero(q.getNumero())
                    .leitos(buildlistaQuadroLeito(q.getId(), minimum, maximum, lstLeitos, listaLinhaHospedagem))
                    .build())
                .collect(Collectors.toList());

        return new Quadro(quartos);
    }

    private List<QuadroLeito> buildlistaQuadroLeito(Long quartoId,
                                                    Integer minimum,
                                                    Integer maximum,
                                                    List<LeitoResumido> lstLeitos,
                                                    List<LinhaHospedagem> listaLinhaHospedagem
                                                    ) {
        return IntStream.rangeClosed(minimum, maximum)
                .mapToObj(num -> {
                        List<LinhaHospedagem> lista = listaLinhaHospedagem.stream()
                                .filter(lh -> lh.getQuartoId().equals(quartoId) && lh.getLeitoNumero().equals(num))
                                .collect(Collectors.toList());

                        int[] _dias = IntStream.range(0,QTD_DIAS).map(s -> 0).toArray();
                        lista.stream().forEach(lh -> {
                            Integer ini = lh.getIdxIni();
                            Integer fim = lh.getIdxFim();
                            Arrays.fill(_dias, ini, fim+1, 1);
                        });
                        return QuadroLeito.builder()
                                .id(getLeitoId(quartoId, num, lstLeitos))
                                .numero(num)
                                .dias(_dias)
                                .build();
                    }
                )
                .collect(Collectors.toList());
    }

    private Long getLeitoId(Long quartoId, int num, List<LeitoResumido> lstLeitos) {
        return lstLeitos.stream()
                .filter(l -> num == l.getNumero() && quartoId.equals(l.getQuartoId()))
                .findFirst()
                .map(LeitoResumido::getId)
                .orElseGet(() -> 0L);
    }

    private List<MicroLeitoHospedagens> buildListaMicroLeitos(Map<Long, List<LinhaHospedagem>> mapaLinhaHospedagem) {
        Map<Long, MicroLeito> mapaMicroLeitos = buildListaLeitos();

        List<MicroLeitoHospedagens> listaMicroLeitos = mapaMicroLeitos
                .entrySet()
                .stream()
                .map( m ->  MicroLeitoHospedagens.builder()
                        .leitoId(m.getValue().getLeitoId())
                        .leitoNumero(m.getValue().getLeitoNumero())
                        .quartoId(m.getValue().getQuartoId())
                        .quartoNumero(m.getValue().getQuartoNumero())
                        .hospedagens(  mapaLinhaHospedagem.containsKey(m.getKey()) ?
                                mapaLinhaHospedagem.get(m.getKey()) :
                                new ArrayList())
                        .build()
                ).collect(Collectors.toList());

        Collections.sort(listaMicroLeitos, Comparator.comparing(MicroLeitoHospedagens::getQuartoNumero)
                                                        .thenComparing(MicroLeitoHospedagens::getLeitoNumero));
        return listaMicroLeitos;
    }

    private Map<Long, MicroLeito> buildListaLeitos() {
        List<MicroLeito> listaLeitos = leitoRepository.getListaCabecalhosLeitos();

        Map<Long, MicroLeito> mapLeitos = listaLeitos
                .stream()
                .collect(Collectors.toMap(
                        MicroLeito::getLeitoId,
                        leito -> MicroLeito.builder()
                                .leitoId(leito.getLeitoId())
                                .leitoNumero(leito.getLeitoNumero() )
                                .quartoId(leito.getQuartoId())
                                .quartoNumero(leito.getQuartoNumero())
                                .build()));
        mapLeitos.put(99999L, MicroLeito.builder()
                .leitoId(9999L)
                .leitoNumero(9999)
                .quartoId(9999L)
                .quartoNumero(9999)
                .build());
        return mapLeitos;
    }
}