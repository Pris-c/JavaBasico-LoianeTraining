package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas36a43.Ex3;

public class TesteZoo {

    public static void main(String[] args) {

        Mamifero camelo = new Mamifero();
        Mamifero ursoDoCanada = new Mamifero();
        Peixe tubarao = new Peixe();

        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setCor("Amarelo");
        camelo.setVelocidade(2.0);

        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);

        ursoDoCanada.setNome("Urso do Canadá");
        ursoDoCanada.setComprimento(180);
        ursoDoCanada.setCor("Vermelha");
        ursoDoCanada.setVelocidade(0.5);
        ursoDoCanada.setAlimento("Mel");

        System.out.println("Zoo");
        System.out.println(camelo.toString());
        System.out.println(tubarao.toString());
        System.out.println(ursoDoCanada.toString());





    }
}
