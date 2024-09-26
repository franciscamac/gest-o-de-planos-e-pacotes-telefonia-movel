package com.gestao_plano.repository;

import com.gestao_plano.model.Pacote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacoteRepository extends JpaRepository<Pacote, Long> {
    List<Pacote> findByClienteId(Long clienteId);
}
