package br.com.itarocha.chb.domain.hospedagem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Quadro {
	@Builder.Default
	public List<QuadroQuarto> quartos;
	
//	public void setLeitoIdPorNumero(Long quartoId, Integer leitoNumero, Long leitoId) {
//		this.quartos.stream()
//			.filter(q -> q.getId().equals(quartoId))
//			.findFirst()
//			.ifPresent(q -> {
//				q.setLeitoIdPorNumero(leitoNumero, leitoId);
//			});
//	}

}
