package br.com.itarocha.chb.domain.hospedagem;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

//TODO Veja se é melhor utilizar HospedagensPorCidade
@Builder
@Getter
public class CidadeHospedagens {
	private String nome;
	private List<String> ids = new ArrayList<>();
}