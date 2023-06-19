package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas44a46.ex1;

public class Cilindro extends Figura3D implements DimensaoVolumetrica{

    private double raio;
    private double altura;


    public Cilindro(String nome, String cor, double raio, double altura) {
        this.setNome(nome);
        this.setCor(cor);
        this.raio = raio;
        this.altura = altura;
    }

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public Cilindro() {
    }

    @Override
    public double calcularVolume() {
        return Math.PI * Math.pow(raio,2) * altura;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(getRaio(), 2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
