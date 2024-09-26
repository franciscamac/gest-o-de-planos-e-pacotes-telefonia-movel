package com.gestao_plano.model;

import jakarta.persistence.*;

@Entity
public class Pacote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double quantidadeDados;
    private Double quantidadeVoz;
    private Double quantidadeSMS;
    private Double preco;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Plano plano;

    public void associarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getQuantidadeDados() {
        return quantidadeDados;
    }

    public void setQuantidadeDados(Double quantidadeDados) {
        this.quantidadeDados = quantidadeDados;
    }

    public Double getQuantidadeVoz() {
        return quantidadeVoz;
    }

    public void setQuantidadeVoz(Double quantidadeVoz) {
        this.quantidadeVoz = quantidadeVoz;
    }

    public Double getQuantidadeSMS() {
        return quantidadeSMS;
    }

    public void setQuantidadeSMS(Double quantidadeSMS) {
        this.quantidadeSMS = quantidadeSMS;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }
}
