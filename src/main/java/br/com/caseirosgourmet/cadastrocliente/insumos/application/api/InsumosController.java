package br.com.caseirosgourmet.cadastrocliente.insumos.application.api;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class InsumosController implements InsumosAPI {

	@Override
	public InsumosResponse postInsumos(@Valid InsumosRequest insumosRequest) {
		log.info("[inicia] InsumosController - postInsumos");
		log.info("[finaliza] InsumosController - postInsumos");
		return null;
	}
}
