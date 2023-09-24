package br.com.caseirosgourmet.cadastrocliente.insumo.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.caseirosgourmet.cadastrocliente.handler.APIException;
import br.com.caseirosgourmet.cadastrocliente.insumo.application.repository.InsumoRepository;
import br.com.caseirosgourmet.cadastrocliente.insumo.domain.Insumo;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class InsumoInfraRepository implements InsumoRepository {
	private final InsumoSpringDataJPARepository insumoSpringDataJPARepository;

	@Override
	public Insumo salva(Insumo insumo) {
		log.info("[inicia] InsumoInfraRepository - salva");
		insumoSpringDataJPARepository.save(insumo);
		log.info("[finaliza] InsumoInfraRepository - salva");
		return insumo;
	}

	@Override
	public List<Insumo> buscaTodosInsumos() {
		log.info("[inicia] InsumoInfraRepository - buscaTodosInsumos");
		List<Insumo> todosInsumos = insumoSpringDataJPARepository.findAll();
		log.info("[finaliza] InsumoInfraRepository - buscaTodosInsumos");
		return todosInsumos;
	}

	@Override
	public Insumo buscaInsumoAtravesId(UUID idInsumo) {
		log.info("[inicia] InsumoInfraRepository - buscaInsumoAtravesId");
		Insumo insumo = insumoSpringDataJPARepository.findById(idInsumo)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Insumo não encontrado!"));
		log.info("[finaliza] InsumoInfraRepository - buscaInsumoAtravesId");
		return insumo;
	}

}
