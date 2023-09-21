package br.com.caseirosgourmet.cadastrocliente.insumo.application.service;

import org.springframework.stereotype.Service;

import br.com.caseirosgourmet.cadastrocliente.insumo.application.api.InsumoRequest;
import br.com.caseirosgourmet.cadastrocliente.insumo.application.api.InsumoResponse;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class InsumoApplicationService implements InsumoService {

	@Override
	public InsumoResponse criaInsumo(@Valid InsumoRequest insumoRequest) {
		log.info("[inicia] InsumoApplicationService - criaInsumo");
		log.info("[finaliza] InsumoApplicationService - criaInsumo");
		return null;
	}

}
