package br.com.itarocha.chb.ports.out;

import br.com.itarocha.chb.domain.ItemDictionary;
import br.com.itarocha.chb.domain.TipoHospede;

import java.util.List;
import java.util.Optional;

public interface TipoHospedeRepository {

    TipoHospede save(TipoHospede model);

    Optional<TipoHospede> findById(Long id);

    void delete(TipoHospede model);

    List<TipoHospede> findAllOrderByDescricao();

    List<ItemDictionary> findAllToSelectVO();
}
