package com.gestao_plano.service;

import com.gestao_plano.model.Pacote;
import com.gestao_plano.repository.PacoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacoteService {

    @Autowired
    private PacoteRepository pacoteRepository;

    public List<Pacote> listarTodos() {
        return pacoteRepository.findAll();
    }

    public Pacote buscarPorId(Long id) {
        return pacoteRepository.findById(id).orElse(null);
    }

    public Pacote salvar(Pacote pacote) {
        return pacoteRepository.save(pacote);
    }

    public void remover(Long id) {
        pacoteRepository.deleteById(id);
    }

    public List<Pacote> listarPorCliente(Long clienteId) {
        return pacoteRepository.findByClienteId(clienteId);
    }
}
