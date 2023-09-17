package br.com.caseirosgourmet.cadastrocliente.insumos.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class Insumos {
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
