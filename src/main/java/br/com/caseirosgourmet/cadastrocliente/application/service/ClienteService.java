package br.com.caseirosgourmet.cadastrocliente.application.service;

import br.com.caseirosgourmet.cadastrocliente.application.api.ClienteRequest;
import br.com.caseirosgourmet.cadastrocliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
