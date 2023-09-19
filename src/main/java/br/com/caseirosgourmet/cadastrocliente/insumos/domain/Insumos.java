package br.com.caseirosgourmet.cadastrocliente.insumos.domain;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class Insumos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID idInsumos;
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
