package br.com.caseirosgourmet.cadastrocliente.insumo.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.caseirosgourmet.cadastrocliente.insumo.application.service.InsumoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class InsumoController implements InsumoAPI {
	private final InsumoService insumoService;

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
}
