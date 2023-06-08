package com.prisc.cursojavabasico.parte4vetoresematrizes.labs.aula19;

public class Exercicio40 {
    /*Criar dois vetores A e B cada um com 10 elementos inteiros.
Desenvolver um programa que crie um vetor C que é a diferença dos
conjuntos formados pelos elementos dos vetores A e B. Diferença de
conjuntos = todos os elementos do conjunto A que não existem no
conjunto B.*/

    public static void main(String[] args) {

        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[A.length];

        int nA =0;
        int nB =0;
        int nC =0;

        boolean add = true;

        for (int i = 0; i < A.length; i++) {
            A[i] = i*2;
            B[i] = i*3;
        }

        int contC = 0;

        //Cada elemento de A
        for (int i = 0; i < A.length; i++) {
            add = true;
            nA = A[i];

            //Compara elemento de A com cada elemento de B
            for (int j = 0; j < B.length; j++) {
                nB = B[j];

                //Entra se encontrar elemento igual
                if (nA == nB) {
                    add = false;
                    break;
                }
            }

            //Verificar se elemento diferente em A e B já existe em C
            for (int t = 0; t<C.length; t++){
                if (nA == C[t]){
                    //Se já existir em C
                    add = false;
                }
            }

            if (add) {
                C[contC] = nA;
                contC++;
            }
        }

        System.out.print("A: ");
        for (int n : A ) {
            System.out.print(n + " ");
        }

        System.out.print("\nB: ");
        for (int n : B ) {
            System.out.print(n + " ");
        }

        System.out.print("\nC: ");
        for (int n : C ) {
            System.out.print(n + " ");
        }


    }

}
