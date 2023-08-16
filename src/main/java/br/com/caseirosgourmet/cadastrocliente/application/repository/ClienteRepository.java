package br.com.caseirosgourmet.cadastrocliente.application.repository;

import br.com.caseirosgourmet.cadastrocliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
}
