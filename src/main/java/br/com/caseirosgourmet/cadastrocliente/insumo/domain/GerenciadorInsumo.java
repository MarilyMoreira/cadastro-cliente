package br.com.caseirosgourmet.cadastrocliente.insumo.domain;

import java.time.LocalDate;

import br.com.caseirosgourmet.cadastrocliente.insumo.application.api.GerenciadorRequest;
import jakarta.persistence.Embeddable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GerenciadorInsumo {
	@NotNull
	private Integer quantidade;
	@NotNull
	private Integer quantidadePorEmbalagem;
	@NotNull
	private Double valorTotal;
	private LocalDate validade;
	private String ondeComprou;
	private String marca;
	
	public GerenciadorInsumo(@Valid GerenciadorRequest gerenciadorRequest) {
		this.quantidade = gerenciadorRequest.getQuantidade();
		this.quantidadePorEmbalagem = gerenciadorRequest.getQuantidadePorEmbalagem();
		this.valorTotal = gerenciadorRequest.getValorTotal();
		this.validade = gerenciadorRequest.getValidade();
		this.ondeComprou = gerenciadorRequest.getOndeComprou();
		this.marca = gerenciadorRequest.getMarca();
	}
}


