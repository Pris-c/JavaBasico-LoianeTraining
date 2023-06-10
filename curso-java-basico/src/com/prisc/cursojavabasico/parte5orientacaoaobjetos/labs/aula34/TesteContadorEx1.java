package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula34;

public class TesteContadorEx1 {

    public static void main(String[] args) {

        int cont = ContadorEx1.getCont();
        System.out.println(cont);
        int cont2 = ContadorEx1.getCont();
        System.out.println(cont);

        ContadorEx1 cont3 = new ContadorEx1();
        System.out.println(ContadorEx1.getCont());


        ContadorEx1 cont4 = new ContadorEx1();
        System.out.println(ContadorEx1.getCont());

        ContadorEx1.zerarContador();
        System.out.println(ContadorEx1.getCont());




    }
}
