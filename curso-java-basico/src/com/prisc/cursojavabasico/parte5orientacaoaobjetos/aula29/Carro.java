package com.prisc.cursojavabasico.parte5orientacaoaobjetos.aula29;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é " + capCombustivel * consCombustivel + "km");
    }

    //Construtor simples e vazio - Não precisa ser declarado, existe por padrão.
    //Carro(){

    Carro(){
        System.out.println("A classe foi instanciada");
        numPassageiros = 4;
    }

    Carro(String marca){
        this.marca = marca;
    }

    Carro(String marca_, String modelo_, int numPassageiros_, int capCombustivel_, double consCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        capCombustivel = consCombustivel_;

    }

    double obterAutonomia(){
        System.out.println("Médoto obterAutonomia() foi chamado.");
        return capCombustivel*consCombustivel;
    }

    double calculaCombustivel(double km){
        double qtdadeCombustivel = km/consCombustivel;
        return qtdadeCombustivel;
    }

}
