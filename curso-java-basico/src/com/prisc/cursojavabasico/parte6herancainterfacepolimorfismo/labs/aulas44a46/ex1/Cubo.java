package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas44a46.ex1;

public class Cubo extends Figura3D implements DimensaoVolumetrica{

    private double lado;

    public Cubo(String nome, String cor, double lado) {
        super.setNome(nome);
        super.setCor(cor);
        this.lado = lado;
    }

    public Cubo() {
    }

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(lado, 3);


    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.getLado()*2;
    }
}
