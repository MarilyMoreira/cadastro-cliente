package br.com.caseirosgourmet.cadastrocliente.insumo.application.api;

import br.com.caseirosgourmet.cadastrocliente.insumo.domain.Categoria;
import br.com.caseirosgourmet.cadastrocliente.insumo.domain.TipoInsumo;
import br.com.caseirosgourmet.cadastrocliente.insumo.domain.UnidadeDeMedida;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class InsumoRequest {
	@NotBlank
	private String nomeInsumo;
	@NotBlank
	@Enumerated(EnumType.STRING)
	private Categoria categoria;
	@NotBlank
	@Enumerated(EnumType.STRING)
	private TipoInsumo tipoInsumo;	
	@NotBlank
	private int quantidadeMinimaEmEstoque;
	@NotBlank
	@Enumerated(EnumType.STRING)
	private UnidadeDeMedida unidadeDeMedida;
}
