package br.com.itarocha.chb.domain;

import br.com.itarocha.chb.domain.enums.LogicoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hospede implements Serializable{
	
	private Long id;

	private Hospedagem hospedagem;
	
	@NotNull(message="Pessoa precisa ser informada")
	private Pessoa pessoa;
	
	@NotNull(message="Tipo de Hóspede precisa ser informado")
	private TipoHospede tipoHospede;

	@Builder.Default
	private LogicoEnum baixado = LogicoEnum.N;;

	@Builder.Default
	private List<HospedeLeito> leitos = new ArrayList<>();
}
/*
.id
.pessoa
.tipoHospede
.baixado
.leitos
 */