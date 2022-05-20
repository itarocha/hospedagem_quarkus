package br.com.itarocha.chb.domain.enums;

public enum EstadoCivilEnum {

	S("Solteiro(a)"),
	C("Casado(a)"),
	P("Separado(a)"),
	A("Amasiado(a)"),
	D("Divorciado(a)"),
	U("União Estável"),
	V("Viúvo(a)");
	
	private String descricao;
	
	EstadoCivilEnum(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
}
