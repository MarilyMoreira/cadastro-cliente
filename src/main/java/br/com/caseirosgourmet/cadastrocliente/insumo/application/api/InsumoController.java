package br.com.caseirosgourmet.cadastrocliente.insumo.application.api;

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
}
