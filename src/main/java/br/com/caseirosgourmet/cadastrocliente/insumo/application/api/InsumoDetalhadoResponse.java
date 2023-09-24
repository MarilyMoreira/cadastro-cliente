package br.com.caseirosgourmet.cadastrocliente.insumo.application.api;

import java.util.UUID;

import br.com.caseirosgourmet.cadastrocliente.insumo.domain.Insumo;
import lombok.Value;

@Value
public class InsumoDetalhadoResponse {
	private UUID idInsumo;
	private String nomeInsumo;

	public InsumoDetalhadoResponse(Insumo insumo) {
		this.idInsumo = insumo.getIdInsumo();
		this.nomeInsumo = insumo.getNomeInsumo();
	}

}
