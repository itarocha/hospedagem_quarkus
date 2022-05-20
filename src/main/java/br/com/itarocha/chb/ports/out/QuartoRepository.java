package br.com.itarocha.chb.ports.out;

import br.com.itarocha.chb.domain.Quarto;
import br.com.itarocha.chb.domain.QuartoResumido;

import java.util.List;
import java.util.Optional;

public interface QuartoRepository {

//    Quarto save(Quarto model);

//    Optional<Quarto> findById(Long id);

//    void delete(Quarto model);

//    void deleteById(Long id);

    List<Quarto> findAllOrderByQuartoNumero();

    List<QuartoResumido> findQuartosResumidosOrderByQuartoNumero();
//
//    List<Quarto> existeOutroQuartoComEsseNumero(Long quartoId, Integer quartoNumero);
//
//    List<Quarto> existeOutroQuartoComEsseNumero(Integer numero);
//
//    List<Quarto> findByDestinacaoHospedagemId(Long quartoId);

}
