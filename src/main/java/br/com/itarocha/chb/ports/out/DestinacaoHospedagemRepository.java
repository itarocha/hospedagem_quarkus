package br.com.itarocha.chb.ports.out;

import br.com.itarocha.chb.domain.DestinacaoHospedagem;
import br.com.itarocha.chb.domain.ItemDictionary;

import java.util.List;
import java.util.Optional;

public interface DestinacaoHospedagemRepository {

    DestinacaoHospedagem save(DestinacaoHospedagem model);

    Optional<DestinacaoHospedagem> findById(Long id);

    void delete(DestinacaoHospedagem model);

    List<DestinacaoHospedagem> findAllOrderByDescricao();

    List<ItemDictionary> findAllToSelectVO();
}
