package br.com.itarocha.chb.ports.out;

import br.com.itarocha.chb.domain.Encaminhador;
import br.com.itarocha.chb.domain.ItemDictionary;

import java.util.List;
import java.util.Optional;

public interface EncaminhadorRepository {

    Encaminhador save(Encaminhador model);

    Optional<Encaminhador> findById(Long id);

    void delete(Encaminhador model);

    void deleteById(Long id);

    List<Encaminhador> findAllByEntidadeId(Long entidadeId);

    List<ItemDictionary> findAllByEntidadeIdToSelectVO(Long entidadeId);

}
