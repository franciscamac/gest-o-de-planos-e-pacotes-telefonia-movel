package com.gestao_plano.service;

import com.gestao_plano.model.Plano;
import com.gestao_plano.repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanoService {

    @Autowired
    private PlanoRepository planoRepository;

    public List<Plano> listarTodos() {
        return planoRepository.findAll();
    }

    public Plano buscarPorId(Long id) {
        return planoRepository.findById(id).orElse(null);
    }

    public Plano salvar(Plano plano) {
        return planoRepository.save(plano);
    }

    public void remover(Long id) {
        planoRepository.deleteById(id);
    }
}
