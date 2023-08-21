package com.ada.inadimplentes.repository.filter;

public class ClienteFilter {

    private boolean inadimplente;
    private String tipoCartao;

    public ClienteFilter(boolean inadimplente, String tipoCartao) {
        this.inadimplente = inadimplente;
        this.tipoCartao = tipoCartao;
    }

    public boolean isInadimplente() {
        return inadimplente;
    }

    public void setInadimplente(boolean inadimplente) {
        this.inadimplente = inadimplente;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }
}
