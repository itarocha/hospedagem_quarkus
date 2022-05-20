package br.com.itarocha.chb.ports.out;

import br.com.itarocha.chb.domain.ItemDictionary;
import br.com.itarocha.chb.domain.TipoLeito;

import java.util.List;
import java.util.Optional;

public interface TipoLeitoRepository {

    TipoLeito save(TipoLeito model);

    Optional<TipoLeito> findById(Long id);

    void delete(TipoLeito model);

    List<TipoLeito> findAllOrderByDescricao();

    List<ItemDictionary> findAllToSelectVO();
}
