package com.prisc.cursojavabasico.parte5orientacaoaobjetos.aula30;

public class Carros {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombustivel;

    public Carros(){ }

    public Carros(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;

        System.out.println("Chamando construtor com 3 parametros");
    }

    public Carros(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Chamando construtor com 2 parametros");
    }

    public Carros(String marca, String modelo, int numPassageiros, double capCombustivel, double consCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consCombustivel = consCombustivel;
    }

        void exibirAutonomia() {
        System.out.println("A autonomia do carro é " + capCombustivel * consCombustivel + "km");
    }


    double obterAutonomia(){
        System.out.println("Médoto obterAutonomia() foi chamado.");
        return this.capCombustivel * this.consCombustivel;
    }

    double calculaCombustivel(double km){
        double qtdadeCombustivel = km/this.consCombustivel;
        return qtdadeCombustivel;
    }
}
