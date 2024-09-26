package com.gestao_plano.service;

import com.gestao_plano.model.LimiteAlerta;
import com.gestao_plano.repository.LimiteAlertaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LimiteAlertaService {

    @Autowired
    private LimiteAlertaRepository limiteAlertaRepository;

    public List<LimiteAlerta> listarTodos() {
        return limiteAlertaRepository.findAll();
    }

    public LimiteAlerta buscarPorId(Long id) {
        return limiteAlertaRepository.findById(id).orElse(null);
    }

    public LimiteAlerta salvar(LimiteAlerta limiteAlerta) {
        return limiteAlertaRepository.save(limiteAlerta);
    }

    public void remover(Long id) {
        limiteAlertaRepository.deleteById(id);
    }
}
