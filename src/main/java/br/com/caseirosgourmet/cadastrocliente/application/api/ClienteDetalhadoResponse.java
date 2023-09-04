package br.com.caseirosgourmet.cadastrocliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.caseirosgourmet.cadastrocliente.domain.Cliente;
import br.com.caseirosgourmet.cadastrocliente.domain.Endereço;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String celular;
	private Endereço endereco;
	private LocalDate dataDeNascimento;
	private LocalDateTime dataHoraDoCadastro;

	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.celular = cliente.getCelular();
		this.endereco = cliente.getEndereco();
		this.dataDeNascimento = cliente.getDataDeNascimento();
		this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
	}
}
