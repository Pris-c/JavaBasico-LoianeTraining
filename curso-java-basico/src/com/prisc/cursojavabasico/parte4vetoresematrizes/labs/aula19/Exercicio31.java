package com.prisc.cursojavabasico.parte4vetoresematrizes.labs.aula19;

public class Exercicio31 {
/*Ler um vetor A com 20 elementos. Separar os elementos pares e
ímpares de A utilizando apenas um vetor extra B. Sugestão: no início
do vetor B armazene os elementos pares de A e nas posições
restantes do vetor B armazene os elementos de A que são ímpares.*/


    public static void main(String[] args) {

        int[] A = new int[20];
        int[] B = new int[A.length];

        int contPar=0;
        int contImpar=10;

        System.out.print("A = ");
        for (int i = 0; i<20; i++){
            A[i] = i+1;
            System.out.print(A[i] + ", ");
        }

        for (int i=0; i< A.length; i++) {
            if ((A[i]%2) == 0){
                B[contPar] = A[i];
                contPar++;
            } else {
                B[contImpar] = A[i];
                contImpar++;
            }
        }

        System.out.println("");
        for (int j = 0; j< B.length; j++){
            if (j==0){
                System.out.print("B = ");
            }
            System.out.print(B[j] + ", ");
        }


    }
}
