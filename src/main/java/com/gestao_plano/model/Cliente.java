package com.gestao_plano.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String tipoPlano;
    private Double saldoDados;
    private Double saldoVoz;
    private Double saldoSMS;

    @OneToMany(mappedBy = "cliente")
    private List<Pacote> pacotes;

    @OneToMany(mappedBy = "cliente")
    private List<LimiteAlerta> limiteAlerta;

    @ManyToOne
    @JoinColumn(name = "plano_id")
    private Plano plano;


    public void contratarPacote(Pacote pacote) {
        // Lógica para verificar se o cliente pode contratar o pacote
        if (pacote != null) {
            // Adiciona o pacote à lista de pacotes do cliente
            pacotes.add(pacote);
            // Associar o cliente ao pacote
            pacote.setCliente(this);
        } else {
            throw new IllegalArgumentException("Pacote não pode ser nulo");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", tipoPlano='" + tipoPlano + '\'' +
                ", saldoDados=" + saldoDados +
                ", saldoVoz=" + saldoVoz +
                ", saldoSMS=" + saldoSMS +
                ", pacotes=" + pacotes +
                ", limiteAlerta=" + limiteAlerta +
                ", plano=" + plano +
                '}';
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public Double getSaldoDados() {
        return saldoDados;
    }

    public void setSaldoDados(Double saldoDados) {
        this.saldoDados = saldoDados;
    }

    public Double getSaldoVoz() {
        return saldoVoz;
    }

    public void setSaldoVoz(Double saldoVoz) {
        this.saldoVoz = saldoVoz;
    }

    public Double getSaldoSMS() {
        return saldoSMS;
    }

    public void setSaldoSMS(Double saldoSMS) {
        this.saldoSMS = saldoSMS;
    }

    public List<Pacote> getPacotes() {
        return pacotes;
    }

    public void setPacotes(List<Pacote> pacotes) {
        this.pacotes = pacotes;
    }

    public List<LimiteAlerta> getLimiteAlerta() {
        return limiteAlerta;
    }

    public void setLimiteAlerta(List<LimiteAlerta> limiteAlerta) {
        this.limiteAlerta = limiteAlerta;
    }
}
