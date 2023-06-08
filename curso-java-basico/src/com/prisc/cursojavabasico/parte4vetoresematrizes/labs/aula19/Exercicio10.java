package com.prisc.cursojavabasico.parte4vetoresematrizes.labs.aula19;

public class Exercicio10 {
/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
seja: B[i] := A[i] % 2.*/

    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[A.length];

        A[0] = 9;
        A[1] = 8;
        A[2] = 7;
        A[3] = 6;
        A[4] = 5;
        A[5] = 4;
        A[6] = 3;
        A[7] = 2;
        A[8] = 1;
        A[9] = 0;

        for (int i =0; i < A.length; i++){
            B[i] = A[i] % 2;
        }

            System.out.print("A = ");
            for (int i =0; i < A.length; i++){
                System.out.print(A[i] + " ");
            }

            System.out.print("\nB = ");
            for (int i =0; i < A.length; i++){
                System.out.print(B[i] + " ");
            }

    }
}
