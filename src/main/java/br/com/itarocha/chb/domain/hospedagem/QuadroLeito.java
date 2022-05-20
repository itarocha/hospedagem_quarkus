package br.com.itarocha.chb.domain.hospedagem;


import lombok.Builder;
import lombok.Data;

import java.util.Arrays;

@Builder
@Data
public class QuadroLeito {
	public Long id;
	public Integer numero;
	private int[] dias;

	/*
	public QuadroLeito(Long id, Integer numero, int numeroDias) {
		this.id = id;
		this.numero = numero;
		this.dias = new Integer[numeroDias];
		Arrays.fill(dias, 0);
	}
	*/

//	public QuadroLeito(Long id, Integer numero, int[] dias) {
//		this.id = id;
//		this.numero = numero;
//		this.dias = dias; //.clone();
//	}
//
//	public Long getId(){
//		return this.id;
//	}
//
//	public Integer getNumero(){
//		return this.numero;
//	}
//
//	public int[] getDias() {
//		return dias;
//	}
//
//	public void setDias(int[] dias) {
//		this.dias = dias;
//	}
//
	public void marcarRangeDias(Integer idxIni, Integer idxFim) {
		Arrays.fill(this.dias, idxIni, idxFim, 1);
	}
}
