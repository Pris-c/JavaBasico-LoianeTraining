package com.prisc.cursojavabasico.parte5orientacaoaobjetos.aula29;

public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        //van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consCombustivel = 0.20;
        System.out.println("Numero de passageiros = " + van.numPassageiros);

        Carro van2 = new Carro("Fiat");
        van2.modelo = "Ducato";
        System.out.println("Marca van2 = " + van2.marca);

        Carro fusca = new Carro("Volkswagem", "Fusca", 4, 30, 0.18);
        System.out.println("Marca = " + fusca.marca);
        System.out.println("Modelo = " + fusca.modelo);
        System.out.println("Passageiros = " + fusca.numPassageiros);
        System.out.println("Capacidade combust = " + fusca.capCombustivel);
        System.out.println("Consumo = " + fusca.consCombustivel);
    }
}
