package br.com.caseirosgourmet.cadastrocliente.insumo.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/insumo")
public interface InsumoAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	InsumoResponse postInsumo(@Valid @RequestBody InsumoRequest insumoRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<InsumoListResponse> getTodosInsumos();
	
	@GetMapping(value = "/{idInsumo}")
	@ResponseStatus(code = HttpStatus.OK)
	InsumoDetalhadoResponse getInsumoAtravesId(@PathVariable UUID idInsumo);
	
	@DeleteMapping(value = "/{idInsumo}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaInsumoAtravesId(@PathVariable UUID idInsumo);
	
	@PatchMapping(value = "/{idInsumo}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void patchAlteraInsumo(@PathVariable UUID idInsumo,
			@Valid @RequestBody InsumoAlteracaoRequest insumoAlteracaoRequest);
	
	@PatchMapping(value = "/{idInsumo}/gerencia-insumo")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void gerenciaInsumo(@PathVariable UUID idInsumo,
			@Valid @RequestBody GerenciadorRequest gerenciadorRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<GerenciaInsumoListResponse> getGerenciaTodosInsumos();
}
