package com.gestao_plano.model;

import jakarta.persistence.*;

@Entity
public class LimiteAlerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    private String tipoLimite; //dados, voz, sms
    private Double valorLimite;

    public void verificarLimite(){

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipoLimite() {
        return tipoLimite;
    }

    public void setTipoLimite(String tipoLimite) {
        this.tipoLimite = tipoLimite;
    }

    public Double getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(Double valorLimite) {
        this.valorLimite = valorLimite;
    }
}
