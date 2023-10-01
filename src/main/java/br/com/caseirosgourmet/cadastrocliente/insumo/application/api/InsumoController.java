package br.com.caseirosgourmet.cadastrocliente.insumo.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.caseirosgourmet.cadastrocliente.insumo.application.service.GerenciaInsumoService;
import br.com.caseirosgourmet.cadastrocliente.insumo.application.service.InsumoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class InsumoController implements InsumoAPI {
	private final InsumoService insumoService;
	private final GerenciaInsumoService gerenciaInsumoService;

	@Override
	public InsumoResponse postInsumo(@Valid InsumoRequest insumoRequest) {
		log.info("[inicia] InsumoController - postInsumo");
		InsumoResponse insumoCriado = insumoService.criaInsumo(insumoRequest);
		log.info("[finaliza] InsumoController - postInsumo");
		return insumoCriado;
	}

	@Override
	public List<InsumoListResponse> getTodosInsumos() {
		log.info("[inicia] InsumoController - getTodosInsumos");
		List<InsumoListResponse> insumo = insumoService.buscaTodosInsumos();
		log.info("[finaliza] InsumoController - getTodosInsumos");
		return insumo;
	}

	@Override
	public InsumoDetalhadoResponse getInsumoAtravesId(UUID idInsumo) {
		log.info("[inicia] InsumoController - getInsumoAtravesId");
		log.info("[idInsumo] {}", idInsumo);
		InsumoDetalhadoResponse insumoDetalhado = insumoService.buscaInsumoAtravesId(idInsumo);
		log.info("[finaliza] InsumoController - getInsumoAtravesId");
		return insumoDetalhado;
	}

	@Override
	public void deletaInsumoAtravesId(UUID idInsumo) {
		log.info("[inicia] InsumoController - deletaInsumo");	
		log.info("[idInsumo] {}", idInsumo);
		insumoService.deletaInsumoAtravesId(idInsumo);
		log.info("[finaliza] InsumoController - deletaInsumo");		
	}

	@Override
	public void patchAlteraInsumo(UUID idInsumo, @Valid InsumoAlteracaoRequest insumoAlteracaoRequest) {
		log.info("[inicia] InsumoController - patchAlteraInsumo");	
		log.info("[idInsumo] {}", idInsumo);
		insumoService.patchAlteraInsumo(idInsumo, insumoAlteracaoRequest);
		log.info("[finaliza] InsumoController - patchAlteraInsumo");			
	}

	@Override
	public void gerenciaInsumo(UUID idInsumo, @Valid GerenciadorRequest gerenciadorRequest) {
		log.info("[inicia] InsumoController - gerenciaInsumo");	
		log.info("[idInsumo] {}", idInsumo);
		insumoService.patchGerenciaInsumo(idInsumo, gerenciadorRequest);
		log.info("[finaliza] InsumoController - gerenciaInsumo");
	}

	@Override
	public List<GerenciaInsumoListResponse> getGerenciaTodosInsumos() {
		log.info("[inicia] InsumoController - getGerenciaTodosInsumos");
		List<GerenciaInsumoListResponse> gerenciaInsumo = gerenciaInsumoService.gerenciaTodosInsumos();
		log.info("[finaliza] InsumoController - getGerenciaTodosInsumos");
		return gerenciaInsumo;
	}
}
