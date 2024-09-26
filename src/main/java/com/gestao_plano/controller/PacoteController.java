package com.gestao_plano.controller;

import com.gestao_plano.model.Pacote;
import com.gestao_plano.service.PacoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pacotes")
public class PacoteController {

    @Autowired
    private PacoteService pacoteService;

    @GetMapping
    public List<Pacote> listarTodos() {
        return pacoteService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pacote> buscarPorId(@PathVariable Long id) {
        Pacote pacote = pacoteService.buscarPorId(id);
        return pacote != null ? ResponseEntity.ok(pacote) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Pacote salvar(@RequestBody Pacote pacote) {
        return pacoteService.salvar(pacote);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        pacoteService.remover(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Pacote> listarPorCliente(@PathVariable Long clienteId) {
        return pacoteService.listarPorCliente(clienteId);
    }
}