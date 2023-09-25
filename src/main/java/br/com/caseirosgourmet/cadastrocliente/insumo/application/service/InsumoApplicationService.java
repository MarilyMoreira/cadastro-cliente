package br.com.caseirosgourmet.cadastrocliente.insumo.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.caseirosgourmet.cadastrocliente.insumo.application.api.InsumoAlteracaoRequest;
import br.com.caseirosgourmet.cadastrocliente.insumo.application.api.InsumoDetalhadoResponse;
import br.com.caseirosgourmet.cadastrocliente.insumo.application.api.InsumoListResponse;
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
		return InsumoResponse.builder().idInsumo(insumo.getIdInsumo()).build();
	}

	@Override
	public List<InsumoListResponse> buscaTodosInsumos() {
		log.info("[inicia] InsumoApplicationService - buscaTodosInsumos");
		List<Insumo> insumos = insumoRepository.buscaTodosInsumos();
		log.info("[finaliza] InsumoApplicationService - buscaTodosInsumos");
		return InsumoListResponse.converte(insumos);
	}

	@Override
	public InsumoDetalhadoResponse buscaInsumoAtravesId(UUID idInsumo) {
		log.info("[inicia] InsumoApplicationService - buscaInsumoAtravesId");
		Insumo insumo = insumoRepository.buscaInsumoAtravesId(idInsumo);
		log.info("[finaliza] InsumoApplicationService - buscaInsumoAtravesId");
		return new InsumoDetalhadoResponse(insumo);
	}

	@Override
	public void deletaInsumoAtravesId(UUID idInsumo) {
		log.info("[inicia] InsumoApplicationService - deletaInsumoAtravesId");
		Insumo insumo = insumoRepository.buscaInsumoAtravesId(idInsumo);
		insumoRepository.deletaInsumo(insumo);
		log.info("[finaliza] InsumoApplicationService - deletaInsumoAtravesId");

	}

	@Override
	public void patchAlteraInsumo(UUID idInsumo, @Valid InsumoAlteracaoRequest insumoAlteracaoRequest) {
		log.info("[inicia] InsumoApplicationService - patchAlteraInsumo");
		Insumo insumo = insumoRepository.buscaInsumoAtravesId(idInsumo);
		insumo.altera(insumoAlteracaoRequest);
		insumoRepository.salva(insumo);
		log.info("[finaliza] InsumoApplicationService - patchAlteraInsumo");
		
		
	}
}
