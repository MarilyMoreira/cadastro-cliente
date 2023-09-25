package br.com.caseirosgourmet.cadastrocliente.insumo.application.service;

import java.util.List;
import java.util.UUID;

import br.com.caseirosgourmet.cadastrocliente.insumo.application.api.InsumoAlteracaoRequest;
import br.com.caseirosgourmet.cadastrocliente.insumo.application.api.InsumoDetalhadoResponse;
import br.com.caseirosgourmet.cadastrocliente.insumo.application.api.InsumoListResponse;
import br.com.caseirosgourmet.cadastrocliente.insumo.application.api.InsumoRequest;
import br.com.caseirosgourmet.cadastrocliente.insumo.application.api.InsumoResponse;
import jakarta.validation.Valid;

public interface InsumoService {
	InsumoResponse criaInsumo(@Valid InsumoRequest insumoRequest);
	List<InsumoListResponse> buscaTodosInsumos();
	InsumoDetalhadoResponse buscaInsumoAtravesId(UUID idInsumo);
	void deletaInsumoAtravesId(UUID idInsumo);
	void patchAlteraInsumo(UUID idInsumo, @Valid InsumoAlteracaoRequest insumoAlteracaoRequest);
}
