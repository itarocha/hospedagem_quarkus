package br.com.itarocha.chb.ports.out;

import br.com.itarocha.chb.domain.ItemDictionary;
import br.com.itarocha.chb.domain.SituacaoLeito;

import java.util.List;
import java.util.Optional;

public interface SituacaoLeitoRepository {

    SituacaoLeito save(SituacaoLeito model);

    Optional<SituacaoLeito> findById(Long id);

    void delete(SituacaoLeito model);

    List<SituacaoLeito> findAllOrderByDescricao();

    List<ItemDictionary> findAllToSelectVO();
}
