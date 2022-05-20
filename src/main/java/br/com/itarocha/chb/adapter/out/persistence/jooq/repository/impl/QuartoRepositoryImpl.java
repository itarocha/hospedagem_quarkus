package br.com.itarocha.chb.adapter.out.persistence.jooq.repository.impl;

//import br.com.itarocha.betesda.adapter.out.persistence.jpa.entity.QuartoEntity;
//import br.com.itarocha.betesda.adapter.out.persistence.jpa.repository.QuartoJpaRepository;
//import br.com.itarocha.betesda.adapter.out.persistence.mapper.QuartoMapper;
//import br.com.itarocha.betesda.core.exceptions.IntegridadeException;
//import br.com.itarocha.betesda.core.ports.out.QuartoRepository;
//import br.com.itarocha.betesda.domain.Quarto;
import br.com.itarocha.chb.domain.Leito;
import br.com.itarocha.chb.domain.LeitoResumido;
import br.com.itarocha.chb.domain.Quarto;
import br.com.itarocha.chb.domain.QuartoResumido;
import br.com.itarocha.chb.domain.enums.LogicoEnum;
import br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.records.LeitoRecord;
import br.com.itarocha.chb.adapter.out.persistence.jooq.data.tables.records.QuartoRecord;
import br.com.itarocha.chb.ports.out.QuartoRepository;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static br.com.itarocha.chb.adapter.out.persistence.jooq.data.Tables.LEITO;
import static br.com.itarocha.chb.adapter.out.persistence.jooq.data.Tables.QUARTO;

@ApplicationScoped
@RequiredArgsConstructor
public class QuartoRepositoryImpl implements QuartoRepository {

    private final DSLContext create;

    //private final QuartoJooqRepository repository;
    //private final QuartoMapper mapper;

//    @Override
//    public Quarto save(Quarto model) {
//        try {
//            return mapper.toModel(repository.save(mapper.toEntity(model)));
//        } catch ( DataIntegrityViolationException e) {
//            throw new IntegridadeException("Falha de integridade ao tentar gravar Quarto"
//                    , e.getMostSpecificCause().getMessage());
//        }
//    }
//
//    @Override
//    public Optional<Quarto> findById(Long id) {
//        Optional<QuartoEntity> opt = repository.findById(id);
//        return opt.isPresent() ? Optional.of(mapper.toModel(opt.get())) : Optional.ofNullable(null);
//    }
//
//    @Override
//    public void delete(Quarto model) {
//        try {
//            repository.delete(mapper.toEntity(model));
//        } catch ( DataIntegrityViolationException e) {
//            throw new IntegridadeException("Falha de integridade ao tentar excluir Quarto"
//                    , e.getMostSpecificCause().getMessage());
//        }
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        try {
//            repository.deleteById(id);
//        } catch ( DataIntegrityViolationException e) {
//            throw new IntegridadeException("Falha de integridade ao tentar excluir Quarto"
//                    , e.getMostSpecificCause().getMessage());
//        }
//    }


    public List<QuartoResumido> findQuartosResumidosOrderByQuartoNumero(){
        Map<QuartoRecord, List<LeitoRecord>> result =
                create.select(QUARTO.asterisk(), LEITO.asterisk())
                        .from(QUARTO)
                        .leftJoin(LEITO)
                        .onKey()
                        .fetchGroups(QuartoRecord.class, LeitoRecord.class);

        List<QuartoResumido> lista =
                result.entrySet().stream().map(c -> {
                    List<LeitoResumido> leitos = c.getValue()
                            .stream()
                            .map(leito -> LeitoResumido.builder()
                                    .id(leito.getId())
                                    .quartoId(c.getKey().getId())
                                    .numero(leito.getNumero())
                                    //.situacao(leito.getSituacaoLeitoId().)
                                    //.tipoLeito()
                                    .build()
                            ).collect(Collectors.toList());

                    return QuartoResumido.builder()
                            .id(c.getKey().getId())
                            .numero(c.getKey().getNumero())
                            .descricao(c.getKey().getDescricao())
                            .ativo(LogicoEnum.valueOf(c.getKey().getAtivo()))
                            .leitos(leitos)
                            .build();
                }).collect(Collectors.toList());
        return lista;
    }

    public List<Quarto> findAllOrderByQuartoNumero(){

//        List<ParentRecord, List<ChildRecord>> result =
//                create.select(PARENT.asterisk(), CHILD.asterisk())
//                        .from(PARENT)
//                        .leftJoin(CHILD).onKey()
//                        .where(myCondition)
//                        .collect(groupingBy(
//                                r -> r.into(PARENT), filtering(
//                                        r -> r.get(CHILD.ID) != null, mapping(
//                                                r -> r.into(CHILD), toList()
//                                        )
//                                )
//                        ));

        Map<QuartoRecord, List<LeitoRecord>> result =
        create.select(QUARTO.asterisk(), LEITO.asterisk())
                .from(QUARTO)
                .leftJoin(LEITO)
                .onKey()
                .orderBy(QUARTO.NUMERO)
                .fetchGroups(QuartoRecord.class, LeitoRecord.class);

        List<Quarto> lista =
        result.entrySet().stream().map(c -> {
            //c.getKey() -> QuartoRecord
            //c.getValue() -> List<LeitoRecord>
            List<Leito> leitos = c.getValue()
                    .stream()
                    .map(leito -> Leito.builder()
                        .id(leito.getId())
                        .numero(leito.getNumero())
                        //.situacao(leito.getSituacaoLeitoId().)
                        //.tipoLeito()
                        .build()
            ).collect(Collectors.toList());

            return Quarto.builder()
                    .id(c.getKey().getId())
                    .numero(c.getKey().getNumero())
                    .descricao(c.getKey().getDescricao())
                    .ativo(LogicoEnum.valueOf(c.getKey().getAtivo()))
                    .leitos(leitos)
                    .build();
        }).collect(Collectors.toList());
        //System.out.println(lista);

//        result.forEach((q, l) -> {
//            List<Leito> leitos = new ArrayList();
//            l.forEach(leito -> {
//                leitos.add(Leito.builder()
//                                .id(leito.getId())
//                                .numero(leito.getNumero())
//                                //.situacao(leito.getSituacaoLeitoId().)
//                                //.tipoLeito()
//                        .build());
//            });
//
//            Quarto newQ = Quarto.builder()
//                    .id(q.getId())
//                    .numero(q.getNumero())
//                    .descricao(q.getDescricao())
//                    .ativo(LogicoEnum.valueOf(q.getAtivo()))
//                    .leitos(leitos)
//                    .build();
//            lista.add(newQ);
//            //return newQ;
//        });

        return lista;

//        return create.select()
//                .from(QUARTO)
//                .orderBy(QUARTO.NUMERO)
//                .fetchInto(Quarto.class);
    }

//    @Override
//    public List<Quarto> findAllOrderByQuartoNumero(){
//        return repository.findAllOrderByQuartoNumero()
//                .stream()
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public List<Quarto> existeOutroQuartoComEsseNumero(Long quartoId, Integer quartoNumero){
//        return repository.existeOutroQuartoComEsseNumero(quartoId, quartoNumero)
//                .stream()
//                .map(mapper::toModel)
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public List<Quarto> existeOutroQuartoComEsseNumero(Integer numero){
//        return repository.existeOutroQuartoComEsseNumero(numero)
//                .stream()
//                .map(mapper::toModel)
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public List<Quarto> findByDestinacaoHospedagemId(Long quartoId){
//        return repository.findByDestinacaoHospedagemId(quartoId)
//                .stream()
//                .map(mapper::toModel)
//                .collect(Collectors.toList());
//    }
}
