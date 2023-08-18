package com.ada.inadimplentes.model;

import jakarta.persistence.*;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "inadimplente")
    private boolean inadimplente;

    @Column(name = "idade")
    private Integer idade;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "dependentes")
    private Integer dependentes;

    @Column(name = "escolaridade")
    private String escolaridade;

    @Column(name = "estado_civil")
    private String estadoCivil;

    @Column(name = "salario_anual")
    private Double salarioAnual;

    @Column(name = "tipo_cartao")
    private String tipoCartao;

    @Column(name = "meses_relacionamento")
    private Integer mesesDeRelacionamento;

    @Column(name = "limite_creditos")
    private Double limiteDeCreditos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isInadimplente() {
        return inadimplente;
    }

    public void setInadimplente(boolean inadimplente) {
        this.inadimplente = inadimplente;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getDependentes() {
        return dependentes;
    }

    public void setDependentes(Integer dependentes) {
        this.dependentes = dependentes;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Double getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(Double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    public Integer getMesesDeRelacionamento() {
        return mesesDeRelacionamento;
    }

    public void setMesesDeRelacionamento(Integer mesesDeRelacionamento) {
        this.mesesDeRelacionamento = mesesDeRelacionamento;
    }

    public Double getLimiteDeCreditos() {
        return limiteDeCreditos;
    }

    public void setLimiteDeCreditos(Double limiteDeCreditos) {
        this.limiteDeCreditos = limiteDeCreditos;
    }
}
