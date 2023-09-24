package br.com.caseirosgourmet.cadastrocliente.insumo.application.repository;

import java.util.List;

import br.com.caseirosgourmet.cadastrocliente.insumo.domain.Insumo;

public interface InsumoRepository {
	Insumo salva(Insumo insumo);
	List<Insumo> buscaTodosInsumos();
}
