package com.prisc.cursojavabasico.parte4vetoresematrizes.labs.aula19;

import java.util.Random;

public class Exercicio37 {
    /*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial
do elemento correspondente em A.*/

    public static void main(String[] args) {

        int[] A = new int[15];
        int[] B = new int[A.length];

        int fat = 1;

        Random random = new Random();

        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(15);
        }

        for (int n : A) {
            fat=1;
            for (int j = 1; j<=n; j++){
                fat *= j;
                //System.out.println(j);
                //System.out.println(fat);
            }

            System.out.println(n+"! = " + fat);

        }



    }
}
