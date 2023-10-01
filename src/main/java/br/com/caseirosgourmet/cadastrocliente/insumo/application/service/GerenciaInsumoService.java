package br.com.caseirosgourmet.cadastrocliente.insumo.application.service;

import java.util.List;

import br.com.caseirosgourmet.cadastrocliente.insumo.application.api.GerenciaInsumoListResponse;

public interface GerenciaInsumoService {
	List<GerenciaInsumoListResponse> gerenciaTodosInsumos();
}
