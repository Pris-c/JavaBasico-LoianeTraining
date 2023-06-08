package com.prisc.cursojavabasico.parte4vetoresematrizes.labs.aula19;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercicio42 {
/*Ler 10 elementos inteiros em um vetor A e colocá-los em ordem
crescente e apresentar os elementos ordenados.*/

    public static void main(String[] args) {

        int[] A = new int[10];
        int[] Asorted = new int[10];

        A[0] = 9;
        A[1] = 12;
        A[2] = 7;
        A[3] = 10;
        A[4] = 5;
        A[5] = 9;
        A[6] = 3;
        A[7] = 15;
        A[8] = 8;
        A[9] = 1;

        System.out.print("A = ");
        for (int a: A ) {
            System.out.print(a + " - ");
        }

        Arrays.sort(A);

        System.out.print("\nA sorted = ");
        for (int a: A ) {
            System.out.print(a + " - ");
        }


    }
}
