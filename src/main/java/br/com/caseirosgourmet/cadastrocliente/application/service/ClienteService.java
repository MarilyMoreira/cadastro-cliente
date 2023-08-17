package br.com.caseirosgourmet.cadastrocliente.application.service;

import java.util.List;

import br.com.caseirosgourmet.cadastrocliente.application.api.ClienteListResponse;
import br.com.caseirosgourmet.cadastrocliente.application.api.ClienteRequest;
import br.com.caseirosgourmet.cadastrocliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
}
