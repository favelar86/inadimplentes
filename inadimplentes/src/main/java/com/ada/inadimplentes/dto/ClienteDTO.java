package com.ada.inadimplentes.dto;

import jakarta.persistence.Column;

public class ClienteDTO {

    private Long id;

    private boolean inadimplente;

    private Integer idade;

    private String sexo;

    private Integer dependentes;

    private String escolaridade;

    private String estadoCivil;

    private Double salarioAnual;

    private String tipoCartao;

    private Integer mesesDeRelacionamento;

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
