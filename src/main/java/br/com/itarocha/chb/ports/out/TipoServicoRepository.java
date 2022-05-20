package br.com.itarocha.chb.ports.out;

import br.com.itarocha.chb.domain.ItemDictionary;
import br.com.itarocha.chb.domain.TipoServico;

import java.util.List;
import java.util.Optional;

public interface TipoServicoRepository {

    TipoServico save(TipoServico model);

    Optional<TipoServico> findById(Long id);

    void delete(TipoServico model);

    List<TipoServico> findAllOrderByDescricao();

    List<TipoServico> findAllAtivosOrderByDescricao();

    List<ItemDictionary> findAllToSelectVO();
}
