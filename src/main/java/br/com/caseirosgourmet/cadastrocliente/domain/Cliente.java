package br.com.caseirosgourmet.cadastrocliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
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
	private UUID idcliente;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String celular;
	private Endereço endereço;	
	@NotNull
	private LocalDate dataDeNascimento;
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	private Cliente(@NotBlank String nomeCompleto, @NotBlank String celular, Endereço endereço,
			@NotNull LocalDate dataDeNascimento) {
		this.idcliente = UUID.randomUUID();
		this.nomeCompleto = nomeCompleto;
		this.celular = celular;
		this.endereço = endereço;
		this.dataDeNascimento = dataDeNascimento;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

}
