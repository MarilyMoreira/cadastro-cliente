package br.com.caseirosgourmet.cadastrocliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class CadastroClienteApplication {
	
	@GetMapping
	public String getHomeTeste( ) {
		return "Cadastro Cliente - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(CadastroClienteApplication.class, args);
	}

}
