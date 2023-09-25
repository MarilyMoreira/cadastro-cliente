package br.com.caseirosgourmet.cadastrocliente.insumo.application.api;

import br.com.caseirosgourmet.cadastrocliente.insumo.domain.Categoria;
import br.com.caseirosgourmet.cadastrocliente.insumo.domain.TipoInsumo;
import br.com.caseirosgourmet.cadastrocliente.insumo.domain.UnidadeDeMedida;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class InsumoAlteracaoRequest {
	@NotBlank
	private String nomeInsumo;
	@Enumerated(EnumType.STRING)
	private Categoria categoria;
	@Enumerated(EnumType.STRING)
	private TipoInsumo tipoInsumo;
	@Min(value = 1, message = "Valor Mínimo 1")
	private Integer quantidadeMinimaEmEstoque;
	@Enumerated(EnumType.STRING)
	private UnidadeDeMedida unidadeDeMedida;
}
