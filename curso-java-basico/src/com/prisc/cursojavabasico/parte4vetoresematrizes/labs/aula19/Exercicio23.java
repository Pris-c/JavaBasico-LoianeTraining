package com.prisc.cursojavabasico.parte4vetoresematrizes.labs.aula19;

public class Exercicio23 {
    /*Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que verifique se "todos" os elementos do vetor A são pares. Se pelo
menos um elemento do vetor não for par o processo de repetição para
percorrer os elementos do vetor deve ser encerrado, como sugestão:
utilize uma variável do tipo flag para atingir este propósito.*/

    public static void main(String[] args) {
        int[] A = new int[10];

        for (int i =0; i < A.length; i++) {
            A[i] = (int) Math.round(Math.random()*10);
        }

        for (int num:
             A) {
            System.out.println(num);
            if (num%2==0){
                System.out.println("É par");
                break;
            }


        }



    }
}
