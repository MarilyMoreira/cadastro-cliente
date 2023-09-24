package br.com.caseirosgourmet.cadastrocliente.insumo.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.caseirosgourmet.cadastrocliente.insumo.domain.Insumo;

public interface InsumoRepository {
	Insumo salva(Insumo insumo);
	List<Insumo> buscaTodosInsumos();
	Insumo buscaInsumoAtravesId(UUID idInsumo);
	void deletaInsumo(Insumo insumo);
}
