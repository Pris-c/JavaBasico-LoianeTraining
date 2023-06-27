package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas44a46;

public class Circulo extends Figura2D{

    private double raio;

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(getRaio(), 2);
    }

    public Circulo() {
    }

    public Circulo(String nome, String cor, double raio) {
        this.setNome(nome);
        this.setCor(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
