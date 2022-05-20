package br.com.itarocha.chb.ports.out;

import br.com.itarocha.chb.domain.Hospede;

import java.util.Optional;

public interface HospedeRepository {

	Hospede save(Hospede model);

	Optional<Hospede> findById(Long id);

	void delete(Hospede model);

	void deleteById(Long id);

	/*
	List<HospedeLeito> findUltimoByHospedagemId(Long hospedagemId);
	
	List<HospedeLeito> findUltimoByHospedeId(Long hospedeId);

	List<HospedeLeito> findByLeitoNoPeriodo(Long leitoId, LocalDate dataIni, LocalDate dataFim);

	Long countHospedesNaoBaixadosByHospedagemId(Long hospedagemId);

	LocalDate ultimaDataEntradaByHospedagemId(Long hospedagemId);
	
	LocalDate ultimaDataEntradaByHospedagemId(Long hospedagemId, Long hospedeId);
	
	List<BigInteger> leitosNoPeriodo(LocalDate dataIni, LocalDate dataFim);
	
	List<BigInteger> leitosNoPeriodoPorHospedagem(Long hospedagemId, LocalDate dataIni, LocalDate dataFim);

	LeitoDTO findLeitoByHospedeLeitoId(Long hospedeLeitoId);

	List<Long> hospedagensNoPeriodo(Long leitoId, LocalDate dataIni, LocalDate dataFim);

	boolean leitoLivreNoPeriodo(Long leitoId, LocalDate dataIni, LocalDate dataFim);

	List<Long> hospedagensDePessoaNoPeriodo(Long pessoaId, LocalDate dataIni, LocalDate dataFim);

	Integer countOfHospedagensParciaisDePessoaNoPeriodo(Long pessoaId, LocalDate dataIni, LocalDate dataFim);

	void updateDataSaida(Long id, LocalDate dataRenovacao);

	 */
}
