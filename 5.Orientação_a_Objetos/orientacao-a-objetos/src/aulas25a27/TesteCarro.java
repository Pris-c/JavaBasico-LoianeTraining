package aulas25a27;

public class TesteCarro {

    public static void main(String[] args) {

        aulas25a27.Carro van = new aulas25a27.Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consCombustivel = 0.20;

        aulas25a27.Carro fusca = new Carro();
        fusca.marca = "Volkswagem";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consCombustivel = 0.15;

        //System.out.println(van);    //Imprime endereço de memória

        //van.exibirAutonomia();
        //double autonomia = van.obterAutonomia();
        //System.out.println("Autonomia do carro é " + van.obterAutonomia() + "km.");
        double qtdadeComb10 = van.calculaCombustivel(10);
        System.out.println("Qtdade combustível: " + qtdadeComb10);;

    }
}
