package br.com.caseirosgourmet.cadastrocliente.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Getter
@Embeddable
public class Endereço {
	
	private String logradouro;
	private String numero;
	private String bairro;
	private String complemento;
	private String referencia;
	

}
