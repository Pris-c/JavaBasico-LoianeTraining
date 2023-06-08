package com.prisc.cursojavabasico.parte4vetoresematrizes.labs.aula19;

import java.util.Scanner;

public class Exercicio30 {
/*Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo
que nos vetor B e C serão armazenados o valores pares e ímpares de A, respectivamente.*/


    public static void main(String[] args) {

        int[] A = new int[20];
        int[] B = new int[A.length/2];
        int[] C = new int[A.length/2];
        int contB = 0;
        int contC = 0;

        System.out.print("A = ");
        for (int i = 0; i<A.length; i++){
            A[i] = i+1;
            System.out.print(A[i] + " - ");
        }

        for (int a: A) {
            if ( (a%2) == 0){
                B[contB] = a;
                contB++;
            } else {
                C[contC] = a;
                contC++;
            }
        }

        System.out.println("");
        for (int j = 0; j<10; j++){
            if (j==0){
                System.out.print("B = ");
            }
            System.out.print(B[j] + " - ");
        }

        System.out.println("");
        for (int j = 0; j<10; j++){
            if (j==0){
                System.out.print("C = ");
            }
            System.out.print(C[j] + " - ");
        }






    }
}
