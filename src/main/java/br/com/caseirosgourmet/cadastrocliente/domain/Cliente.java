package br.com.caseirosgourmet.cadastrocliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.caseirosgourmet.cadastrocliente.application.api.ClienteAlteracaoRequest;
import br.com.caseirosgourmet.cadastrocliente.application.api.ClienteRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String celular;
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	@Embedded
	private Endereço endereco;	
	@NotNull
	private LocalDate dataDeNascimento;
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

	public Cliente(ClienteRequest clienteRequest) {
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.celular = clienteRequest.getCelular();
		this.sexo = clienteRequest.getSexo();
		this.endereco = clienteRequest.getEndereco();
		this.dataDeNascimento = clienteRequest.getDataDeNascimento();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

	public void altera(ClienteAlteracaoRequest clienteRequest) {
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.celular = clienteRequest.getCelular();
		this.sexo = clienteRequest.getSexo();
		this.endereco = clienteRequest.getEndereco();
		this.dataDeNascimento = clienteRequest.getDataDeNascimento();
		this.dataHoraDaUltimaAlteracao = LocalDateTime.now();
	}

}
