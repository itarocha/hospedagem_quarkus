package br.com.itarocha.chb.domain;

import br.com.itarocha.chb.domain.enums.LogicoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuartoResumido {

	private Long id;
	
	@NotNull(message="Número precisa ser informado")
	private Integer numero;
	
	@NotNull(message="Descrição é obrigatória")
	@Size(max = 255, message="Descrição não pode ter mais que 255 caracteres")
	private String descricao;

    //private Set<DestinacaoHospedagem> destinacoes = new HashSet<>();
	
	private List<LeitoResumido> leitos;

	@Builder.Default
	//@Enumerated(EnumType.STRING)
	private LogicoEnum ativo = LogicoEnum.S;
}
