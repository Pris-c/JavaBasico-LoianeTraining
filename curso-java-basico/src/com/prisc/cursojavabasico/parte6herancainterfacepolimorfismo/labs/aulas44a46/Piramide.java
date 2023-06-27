package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas44a46;

public class Piramide extends Figura3D implements DimensaoVolumetrica{

    private double areaDaBase;
    private double altura;

    @Override
    public double calcularVolume() {
        return ( getAreaDaBase() * getAltura() ) / 3;
    }

    public Piramide() {
    }

    public Piramide(String nome, String cor, double areaDaBase, double altura) {
        super.setNome(nome);
        super.setCor(cor);
        this.areaDaBase = areaDaBase;
        this.altura = altura;
    }

    public Piramide(double areaDaBase, double altura) {
        this.areaDaBase = areaDaBase;
        this.altura = altura;
    }

    public double getAreaDaBase() {
        return areaDaBase;
    }

    public void setAreaDaBase(double areaDaBase) {
        this.areaDaBase = areaDaBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public double calcularArea() {
        return this.getAreaDaBase();
    }
}
