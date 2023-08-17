package br.com.caseirosgourmet.cadastrocliente.application.repository;

import java.util.List;

import br.com.caseirosgourmet.cadastrocliente.application.api.ClienteListResponse;
import br.com.caseirosgourmet.cadastrocliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
}
