package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula34;

public class ContadorEx1 {
    /*Escreva uma classe chamada Contador, que tem um atributo estático que é incrementado sempre que a
classe for instanciada. Crie métodos para zerar, incrementar e retornar o valor do contador. Desenvolva
um programa para testar essa classe.*/

    private static int cont;

    public ContadorEx1() {
        cont++;
    }

    public static void zerarContador(){
        cont = 0;
    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        ContadorEx1.cont = cont;
    }
}
