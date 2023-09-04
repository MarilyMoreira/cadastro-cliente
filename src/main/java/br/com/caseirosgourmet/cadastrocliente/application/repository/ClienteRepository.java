package br.com.caseirosgourmet.cadastrocliente.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.caseirosgourmet.cadastrocliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
	Cliente buscaClienteAtravesId(UUID idCliente);
}
