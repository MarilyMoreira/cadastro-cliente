package br.com.caseirosgourmet.cadastrocliente.insumo.application.api;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GerenciadorRequest {
	@NotNull
	private Integer quantidade;
	@NotNull
	private Integer quantidadePorEmbalagem;
	@NotNull
	private Double valorTotal;
	private LocalDate validade;
	private String ondeComprou;
	private String marca;
}
