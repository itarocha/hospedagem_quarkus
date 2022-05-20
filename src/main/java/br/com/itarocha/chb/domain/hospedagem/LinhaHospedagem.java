package br.com.itarocha.chb.domain.hospedagem;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties({"hospedagem"}) 
public class LinhaHospedagem {
	private Long hpdId;
	private Long leitoId;
	private Long quartoId;
	private Integer leitoNumero;
	private Integer quartoNumero;
	private String identificador;
	private String nome;
	private String telefone;
	private String status;
	private Integer idxIni;
	private Integer idxFim;
	private Integer width;
	private String clsIni;
	private String clsFim;
	private Integer[] dias;
}
