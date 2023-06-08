package com.prisc.cursojavabasico.parte4vetoresematrizes.labs.aula19;

public class Exercicio33 {
/*Criar um vetor A com 10 elementos inteiros. Escreva um programa que
imprima cada elemento do vetor A e uma mensagem indicando se o
respectivo elemento é um número primo ou não.*/

    public static void main(String[] args) {

        int[] A = new int[10];
        boolean primo = true;

        System.out.print("A = ");
        for (int i = 0; i< A.length; i++){
            A[i] = i+7;
            System.out.print(A[i] + ", ");
        }

        System.out.println("");
        System.out.println("-----------------------");
        for (int i = 0; i < A.length; i++){
            primo = true;
            int n = A[i];
            for (int d = (n-1); d>1; d--){

                if ( (A[i]%d) == 0){
                    primo = false;
                    //break;
                }
            }

            if (primo){
                System.out.println(n + " é primo.");
            } else {
                System.out.println(n + " NÃO é primo.");
            }

        }

    }
}
