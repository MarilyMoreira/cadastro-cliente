package br.com.caseirosgourmet.cadastrocliente.application.api;

import java.util.List;
import java.util.UUID;

import br.com.caseirosgourmet.cadastrocliente.domain.Cliente;

public class ClienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String celular;
	
	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		return null;
	}
}
