package com.gestao_plano.controller;

import com.gestao_plano.model.Plano;
import com.gestao_plano.service.PlanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/planos")
public class PlanoController {

    @Autowired
    private PlanoService planoService;

    @GetMapping
    public List<Plano> listarTodos() {
        return planoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plano> buscarPorId(@PathVariable Long id) {
        Plano plano = planoService.buscarPorId(id);
        return plano != null ? ResponseEntity.ok(plano) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Plano salvar(@RequestBody Plano plano) {
        return planoService.salvar(plano);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        planoService.remover(id);
        return ResponseEntity.noContent().build();
    }
}
