package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas44a46;

public class Quadrado extends Figura2D{

    private double lado;

    @Override
    public double calcularArea() {
        return Math.pow(getLado(),2);
    }

    public Quadrado(String nome, String cor, double lado) {
        this.setNome(nome);
        this.setCor(cor);
        this.lado = lado;
    }

    public Quadrado() {
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
