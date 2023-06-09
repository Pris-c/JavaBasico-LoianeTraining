package aula24;

public class TesteCarro {

    public static void main(String[] args) {

        aula24.Carro van = new aula24.Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consCombustivel = 0.20;

        aula24.Carro fusca = new aula24.Carro();
        fusca.marca = "Volkswagem";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consCombustivel = 0.15;

        //System.out.println(van);    //Imprime endereço de memória



        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
    }
}
