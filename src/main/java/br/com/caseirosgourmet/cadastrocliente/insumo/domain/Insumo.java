package br.com.caseirosgourmet.cadastrocliente.insumo.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
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
public class Insumo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID idInsumo;
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
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public Insumo(UUID idInsumo, @NotBlank String nomeInsumo, @NotBlank Categoria categoria,
			@NotBlank TipoInsumo tipoInsumo, @NotBlank int quantidadeMinimaEmEstoque,
			@NotBlank UnidadeDeMedida unidadeDeMedida) {
		this.idInsumo = UUID.randomUUID();
		this.nomeInsumo = nomeInsumo;
		this.categoria = categoria;
		this.tipoInsumo = tipoInsumo;
		this.quantidadeMinimaEmEstoque = quantidadeMinimaEmEstoque;
		this.unidadeDeMedida = unidadeDeMedida;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

}
