package br.com.caseirosgourmet.cadastrocliente.insumo.application.service;

import br.com.caseirosgourmet.cadastrocliente.insumo.application.api.InsumoRequest;
import br.com.caseirosgourmet.cadastrocliente.insumo.application.api.InsumoResponse;
import jakarta.validation.Valid;

public interface InsumoService {
	InsumoResponse criaInsumo(@Valid InsumoRequest insumoRequest);

}
