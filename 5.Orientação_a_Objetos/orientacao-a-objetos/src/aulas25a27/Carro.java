package aulas25a27;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é " + capCombustivel * consCombustivel + "km");
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
