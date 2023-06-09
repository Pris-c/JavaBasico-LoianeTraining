package com.prisc.cursojavabasico.parte5orientacaoaobjetos.aula31e32;

//classe publica
public class Carro {

    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consCombustivel;

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é " + capCombustivel * consCombustivel + "km");
    }


    public double obterAutonomia(){
        System.out.println("Médoto obterAutonomia() foi chamado.");
        return this.capCombustivel * this.consCombustivel;
    }

    private double divideKmPorConsumoCombustivel(double km){
        return km/this.consCombustivel;
    }

    public double calculaCombustivel(double km){
        return this.divideKmPorConsumoCombustivel(km);
    }
}
