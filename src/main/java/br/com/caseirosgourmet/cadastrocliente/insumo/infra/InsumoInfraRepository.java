package br.com.caseirosgourmet.cadastrocliente.insumo.infra;

import org.springframework.stereotype.Repository;

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

}
