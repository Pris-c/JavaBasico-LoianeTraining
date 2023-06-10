package com.prisc.cursojavabasico.parte5orientacaoaobjetos.aula34;

public class TesteCalculadora {

    static  int resultadoSoma;

    public static void main(String[] args) {
        resultadoSoma = MinhaCalculadora.soma(1,6);
        soma2Valores(1,2);
    }

    static int soma2Valores(int num1, int num2){
        return MinhaCalculadora.soma(num1, num2);
    }


}
