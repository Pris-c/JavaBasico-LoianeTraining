package com.prisc.cursojavabasico.parte4vetoresematrizes.labs.aula19;

import java.util.Random;

public class Exercicio26 {
/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C de mesmo tipo e tamanho, obedecendo as seguintes
regras de formação:
a) Ci deverá receber 1 quando Ai for maior que Bi;
b) Ci deverá receber 0 quando Ai for igual a Bi;
c) Ci deverá receber -1 quando Ai for menor que Bi.*/


    public static void main(String[] args) {

        int[] arrayInt = new int[10];
        int[] arrayB = new int[arrayInt.length];
        int[] arrayC = new int[arrayInt.length];

        Random random = new Random();

        for (int i = 0; i < arrayInt.length; i++) {
            arrayB[i] = random.nextInt(15);
            arrayInt[i] = random.nextInt(15);

            if (arrayInt[i] > arrayB[i]) {
                arrayC[i] = 1;
            } else if (arrayB[i] > arrayInt[i]) {
                arrayC[i] = -1;
            } else {
                arrayC[i] = 0;
            }
        }

            System.out.print("A = ");
            for (int j =0; j < arrayInt.length; j++){
                System.out.print(arrayInt[j] + " ");
            }

            System.out.print("\nB = ");
            for (int j =0; j < arrayInt.length; j++){
                System.out.print(arrayB[j] + " ");
            }

            System.out.print("\nC = ");
            for (int j =0; j < arrayInt.length; j++){
                System.out.print(arrayC[j] + " ");
            }

    }
}
