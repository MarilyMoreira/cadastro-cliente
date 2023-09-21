package br.com.caseirosgourmet.cadastrocliente.insumo.application.service;

import org.springframework.stereotype.Service;

import br.com.caseirosgourmet.cadastrocliente.insumo.application.api.InsumoRequest;
import br.com.caseirosgourmet.cadastrocliente.insumo.application.api.InsumoResponse;
import br.com.caseirosgourmet.cadastrocliente.insumo.application.repository.InsumoRepository;
import br.com.caseirosgourmet.cadastrocliente.insumo.domain.Insumo;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class InsumoApplicationService implements InsumoService {
	private final InsumoRepository insumoRepository;

	@Override
	public InsumoResponse criaInsumo(@Valid InsumoRequest insumoRequest) {
		log.info("[inicia] InsumoApplicationService - criaInsumo");
		Insumo insumo = insumoRepository.salva(new Insumo(insumoRequest));
		log.info("[finaliza] InsumoApplicationService - criaInsumo");
		return InsumoResponse.builder()
				.idInsumo(insumo.getIdInsumo())
				.build();
	}

}
