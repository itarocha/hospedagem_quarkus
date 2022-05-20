package br.com.itarocha.chb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TipoLeito implements Serializable{
	private static final long serialVersionUID = -732012434360084121L;

	private Long id;

	@NotNull(message="Descrição é obrigatória")
	@Size(min = 3, max = 32, message="Descrição da Destinação da Hospedagem deve ter entre 3 e 32 caracteres")
	private String descricao;

	@NotNull(message="Quantidade de Camas precisa ser informada")
	@Min(value=1, message="Quantidade de Leitos deve ser no mínimo 1" )
	@Max(value=2, message="Quantidade de Leitos deve ser no máximo 2" )
	private Integer quantidadeCamas;
}
