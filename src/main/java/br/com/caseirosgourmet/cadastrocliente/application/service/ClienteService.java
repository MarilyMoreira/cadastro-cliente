package br.com.caseirosgourmet.cadastrocliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.caseirosgourmet.cadastrocliente.application.api.ClienteDetalhadoResponse;
import br.com.caseirosgourmet.cadastrocliente.application.api.ClienteListResponse;
import br.com.caseirosgourmet.cadastrocliente.application.api.ClienteRequest;
import br.com.caseirosgourmet.cadastrocliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
}
