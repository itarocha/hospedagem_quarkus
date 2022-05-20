package br.com.itarocha.chb.domain.hospedagem;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
public class MicroLeitoHospedagens {
	private Long leitoId;
	private Integer leitoNumero;
	private Long quartoId;
	private Integer quartoNumero;
	private List<LinhaHospedagem> hospedagens = new ArrayList<>();
}
