package br.com.itarocha.chb.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AcomodacaoNew {
	private Long id;
	private Long quartoId;
	private Integer quartoNumero;
	private Long leitoId;
	private Integer leitoNumero;
}
