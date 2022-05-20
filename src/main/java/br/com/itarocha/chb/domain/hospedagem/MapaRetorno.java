package br.com.itarocha.chb.domain.hospedagem;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@JsonPropertyOrder({"dataIni", "dataFim", "dias", "cidades", "quadro", "linhas", "leitos", "hospedes"})
public class MapaRetorno {
	private LocalDate dataIni;
	private LocalDate dataFim;
	private List<LocalDate> dias = new ArrayList();
	private List<CidadeHospedagens> cidades = new ArrayList();
	private Quadro quadro;
	//TODO: Breve será chamado de leitos
	private List<MicroLeitoHospedagens> linhas = new ArrayList();
	private List<MicroLeito> leitos = new ArrayList();
	private List<HospedeMapa> hospedes = new ArrayList();
}
