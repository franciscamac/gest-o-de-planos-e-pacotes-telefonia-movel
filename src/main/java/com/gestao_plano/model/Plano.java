package com.gestao_plano.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Plano {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private Double limiteDados;
    private Double limiteVoz;
    private Double limiteSMS;

    @OneToMany(mappedBy = "plano")
    private List<Pacote> pacotes;

    @OneToMany(mappedBy = "plano", cascade = CascadeType.ALL)
    private List<Cliente> clientes;
}
