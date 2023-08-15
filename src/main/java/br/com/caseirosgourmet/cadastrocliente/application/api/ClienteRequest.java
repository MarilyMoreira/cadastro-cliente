package br.com.caseirosgourmet.cadastrocliente.application.api;

import java.time.LocalDate;

import br.com.caseirosgourmet.cadastrocliente.domain.Endereço;
import br.com.caseirosgourmet.cadastrocliente.domain.Sexo;
import jakarta.persistence.Embedded;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class ClienteRequest {
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String celular;
	private Sexo sexo;
	@Embedded
	private Endereço endereço;	
	@NotNull
	private LocalDate dataDeNascimento;
}
