package com.gestao_plano.controller;

import com.gestao_plano.model.LimiteAlerta;
import com.gestao_plano.service.LimiteAlertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/limites-alerta")
public class LimiteAlertaController {

    @Autowired
    private LimiteAlertaService limiteAlertaService;

    @GetMapping
    public List<LimiteAlerta> listarTodos() {
        return limiteAlertaService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LimiteAlerta> buscarPorId(@PathVariable Long id) {
        LimiteAlerta limiteAlerta = limiteAlertaService.buscarPorId(id);
        return limiteAlerta != null ? ResponseEntity.ok(limiteAlerta) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public LimiteAlerta salvar(@RequestBody LimiteAlerta limiteAlerta) {
        return limiteAlertaService.salvar(limiteAlerta);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        limiteAlertaService.remover(id);
        return ResponseEntity.noContent().build();
    }
}
