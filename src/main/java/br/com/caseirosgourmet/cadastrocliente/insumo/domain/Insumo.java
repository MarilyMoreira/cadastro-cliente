package br.com.caseirosgourmet.cadastrocliente.insumo.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.caseirosgourmet.cadastrocliente.insumo.application.api.InsumoAlteracaoRequest;
import br.com.caseirosgourmet.cadastrocliente.insumo.application.api.InsumoRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
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
	@Enumerated(EnumType.STRING)
	private Categoria categoria;
	@Enumerated(EnumType.STRING)
	private TipoInsumo tipoInsumo;
	@Min(value = 1, message = "Valor Mínimo 1")
	private Integer quantidadeMinimaEmEstoque;
	@Enumerated(EnumType.STRING)
	private UnidadeDeMedida unidadeDeMedida;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

	public Insumo(InsumoRequest insumoRequest) {
		this.nomeInsumo = insumoRequest.getNomeInsumo();
		this.categoria = insumoRequest.getCategoria();
		this.tipoInsumo = insumoRequest.getTipoInsumo();
		this.quantidadeMinimaEmEstoque = insumoRequest.getQuantidadeMinimaEmEstoque();
		this.unidadeDeMedida = insumoRequest.getUnidadeDeMedida();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

	public void altera(InsumoAlteracaoRequest insumoRequest) {
		this.nomeInsumo = insumoRequest.getNomeInsumo();
		this.categoria = insumoRequest.getCategoria();
		this.tipoInsumo = insumoRequest.getTipoInsumo();
		this.quantidadeMinimaEmEstoque = insumoRequest.getQuantidadeMinimaEmEstoque();
		this.unidadeDeMedida = insumoRequest.getUnidadeDeMedida();
		this.dataHoraDoCadastro = LocalDateTime.now();
		
	}
}
