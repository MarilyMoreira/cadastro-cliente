package br.com.caseirosgourmet.cadastrocliente.insumo.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.caseirosgourmet.cadastrocliente.insumo.domain.Insumo;
import lombok.Value;

@Value
public class InsumoListResponse {
	private UUID idInsumo;
	private String nomeInsumo;

	public static List<InsumoListResponse> converte(List<Insumo> insumos) {
		return insumos.stream()
				.map(InsumoListResponse::new)				
				.collect(Collectors.toList());	
	}

	private InsumoListResponse(Insumo insumo) {
		this.idInsumo = insumo.getIdInsumo();
		this.nomeInsumo = insumo.getNomeInsumo();
	}
}
