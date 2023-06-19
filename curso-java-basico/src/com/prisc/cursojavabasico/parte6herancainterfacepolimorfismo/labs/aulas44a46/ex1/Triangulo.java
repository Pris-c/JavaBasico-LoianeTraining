package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas44a46.ex1;

public class Triangulo extends Figura2D implements DimensaoSuperficial{

    private double base;
    private double altura;

    public Triangulo(String nome, String cor, double base, double altura) {
        this.setNome(nome);
        this.setCor(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ( getBase()*getAltura() ) / 2;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
