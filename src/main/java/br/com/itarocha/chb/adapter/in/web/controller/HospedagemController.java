package br.com.itarocha.chb.adapter.in.web.controller;

import br.com.itarocha.chb.adapter.in.web.dto.*;
//import br.com.itarocha.chb.ports.in.HospedagemUseCase;
import br.com.itarocha.chb.domain.hospedagem.MapaQuadro;
import br.com.itarocha.chb.domain.hospedagem.MapaRetorno;
import br.com.itarocha.chb.ports.in.MapaHospedagemUseCase;
//import br.com.itarocha.chb.ports.in.PlanilhaGeralUseCase;
//import br.com.itarocha.chb.ports.in.RelatorioGeralUseCase;
//import br.com.itarocha.chb.util.validacoes.ValidatorUtil;
import lombok.RequiredArgsConstructor;
/*
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
*/

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/app/hospedagem")
@RequiredArgsConstructor
public class HospedagemController {

	//private final HospedagemUseCase hospedagemService;
	//private final RelatorioGeralUseCase relatorioService;
	private final MapaHospedagemUseCase mapaHospedagemService;
	//private final MapaHospedesUseCase mapaHospedesService;
	//private final MapaQuadroUseCase mapaQuadroService;
	//private final ValidatorUtil validationUtils;
	//private final PlanilhaGeralUseCase planilhaGeralService;

//	@POST
//	public ResponseEntity<Hospedagem> gravar(@RequestBody HospedagemNew model) {
//		validationUtils.validate(model);
//
//		try {
//		    return ResponseEntity.ok(hospedagemService.create(model));
//		} catch (Exception e) {
//			return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
	@POST
	@Path("/mapa")
	public MapaRetorno mapa(MapaHospedagemRequest model)
	{
		return mapaHospedagemService.buildMapaRetorno(model.getData());
	}

//	@PostMapping("/planilha_geral")
//	public ResponseEntity<RelatorioAtendimentos> planilhaGeral(@RequestBody PeriodoRequest model)
//	{
//		validationUtils.validate(model);
//		return ResponseEntity.ok(relatorioService.buildPlanilha(model.getDataIni(), model.getDataFim()));
//	}
	
//	//https://grokonez.com/spring-framework/spring-boot/excel-file-download-from-springboot-restapi-apache-poi-mysql
//	@PostMapping("/planilha_geral_arquivo")
//	//ResponseEntity<ByteArrayResource>
//	public ResponseEntity<?>planilhaGeralExcel(@RequestBody PeriodoRequest model) throws IOException {
//		validationUtils.validate(model);
//
//		RelatorioAtendimentos retorno = null;
//		try {
//			retorno = relatorioService.buildPlanilha(model.getDataIni(), model.getDataFim());
//		} catch(Exception e) {
//			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//
//		ByteArrayInputStream in = planilhaGeralService.toExcel(retorno);
//
//		HttpHeaders headers = new HttpHeaders();
//
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm");
//		String dateTimeFormatted = LocalDateTime.now().format(formatter);
//
//		headers.add(HttpHeaders.CONTENT_DISPOSITION, String.format("attachment; filename=PlanilhaGeral-%s.xlsx",dateTimeFormatted));
//		//headers.setContentType(new MediaType("application", "force-download"));
//		headers.add("Cache-Control", "no-cache, no-store, must-revalidate"); //OPT
//	    headers.add("Pragma", "no-cache"); // OPT
//	    headers.add("Expires", "0"); // OPT
//
//		return ResponseEntity
//				.ok()
//				.contentType(MediaType.APPLICATION_OCTET_STREAM)
//				.headers(headers)
//				.body(new InputStreamResource(in));
//	}
//
//	@PostMapping("/leitos_ocupados")
//	public ResponseEntity<List<OcupacaoLeito>> leitosOcupados(@RequestBody HospedagemPeriodoRequest model)
//	{
//		return ResponseEntity.ok(hospedagemService.getLeitosOcupadosNoPeriodo(model.getHospedagemId(), model.getDataIni(), model.getDataFim()));
//	}
//
//	@PostMapping("/mapa/alterar_hospede")
//	public ResponseEntity alterarHospede(@RequestBody AlteracaoHospedeRequest model)
//	{
//		hospedagemService.alterarTipoHospede(model.getHospedeId(), model.getTipoHospedeId());
//		return ResponseEntity.ok().build();
//	}
//
//	@PostMapping("/mapa/encerramento")
//	public ResponseEntity encerramento(@RequestBody OperacoesRequest model)
//	{
//		hospedagemService.encerrarHospedagem(model.hospedagemId, model.data);
//		return ResponseEntity.ok().build();
//	}
//
//	@PostMapping("/mapa/renovacao")
//	public ResponseEntity renovacao(@RequestBody OperacoesRequest model)
//	{
//		hospedagemService.renovarHospedagem(model.hospedagemId, model.data);
//		return ResponseEntity.ok().build();
//	}
//
//	@PostMapping("/remover_hospede")
//	public ResponseEntity removerHospede(@RequestBody RemoverHospedeRequest model)
//	{
//		hospedagemService.removerHospede(model.getHospedagemId(), model.getHospedeId());
//		return ResponseEntity.ok().build();
//	}
//
//	@PostMapping(value="/mapa/baixar")
//	public ResponseEntity baixar(@RequestBody BaixaRequest model)
//	{
//		hospedagemService.baixarHospede(model.getHospedeId(), model.getData());
//		return ResponseEntity.ok().build();
//	}
//
//	@PostMapping("/mapa/transferir")
//	public ResponseEntity transferir(@RequestBody TransferenciaRequest model)
//	{
//		hospedagemService.transferirHospede(model.getHospedeId(), model.getLeitoId(), model.getData());
//		return ResponseEntity.ok().build();
//	}
//
//	@PostMapping("/mapa/adicionar")
//	public ResponseEntity adicionarHospede(@RequestBody AdicionarHospedeRequest model)
//	{
//		hospedagemService.adicionarHospede(	model.getHospedagemId(),
//											model.getPessoaId(),
//											model.getTipoHospedeId(),
//											model.getLeitoId(),
//											model.getData());
//		return ResponseEntity.ok().build();
//	}
//
//	@PostMapping("/mapa/hospedagem_info")
//	public ResponseEntity<Hospedagem> getHospedagemInfo(@RequestBody HospdeagemInfoRequest model)
//	{
//		return ResponseEntity.ok(hospedagemService.getHospedagemPorHospedeLeitoId(model.getHospedagemId()));
//	}
//
//	@DeleteMapping("{id}")
//	public ResponseEntity excluir(@PathVariable("id") Long id) {
//		hospedagemService.excluirHospedagem(id);
//		return ResponseEntity.noContent().build();
//	}

/*
	@PostMapping("/mapa/teste")
	//@PreAuthorize("hasAnyRole('USER','ADMIN','ROOT')")
	public ResponseEntity<List<HospedeMapa>> mapaTeste(@RequestBody PeriodoRequest model)
	{
		return ResponseEntity.ok(mapaHospedagemService.buildListaHospedeMapa(model.getDataIni(), model.getDataFim()));
	}
*/


}
