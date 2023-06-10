package com.prisc.cursojavabasico.parte5orientacaoaobjetos.aula36;

public class Telefone {

    private String tipo;
    private String ddd;
    private String numero;

    public String getDdd() {
        return ddd;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
