package br.com.itarocha.chb.ports.out;

import br.com.itarocha.chb.domain.Leito;
import br.com.itarocha.chb.domain.LeitoDTO;
import br.com.itarocha.chb.domain.enums.LogicoEnum;
import br.com.itarocha.chb.domain.hospedagem.MicroLeito;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface LeitoRepository {
//    Leito save(Leito model);
//    Optional<Leito> findById(Long id);
//    void delete(Leito model);
//    void deleteById(Long id);
//    List<Leito> findByQuartoId(Long id);
//    void deleteWhereQuartoId(Long quartoId);
//    List<Leito> findAllWhereDisponivel(LogicoEnum disponivel);
//    Collection<Leito> existeOutroLeitoComEsseNumero(Long leitoId, Long quartoId, Integer leitoNumero);
//    Collection<Leito> existeOutroLeitoComEsseNumero(Long quartoId, Integer leitoNumero);
    List<MicroLeito> getListaCabecalhosLeitos();
}
