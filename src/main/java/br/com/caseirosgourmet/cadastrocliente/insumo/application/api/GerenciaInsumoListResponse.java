package br.com.caseirosgourmet.cadastrocliente.insumo.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class GerenciaInsumoListResponse {
	private UUID idInsumo;
}
