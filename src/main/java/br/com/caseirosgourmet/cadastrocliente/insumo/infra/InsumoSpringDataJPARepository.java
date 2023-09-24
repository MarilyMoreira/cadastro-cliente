package br.com.caseirosgourmet.cadastrocliente.insumo.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.caseirosgourmet.cadastrocliente.insumo.domain.Insumo;

public interface InsumoSpringDataJPARepository extends JpaRepository<Insumo, UUID> {

}
