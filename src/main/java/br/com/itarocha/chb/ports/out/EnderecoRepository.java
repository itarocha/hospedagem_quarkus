package br.com.itarocha.chb.ports.out;

import br.com.itarocha.chb.domain.Endereco;

public interface EnderecoRepository {
    Endereco save(Endereco endereco);
}
