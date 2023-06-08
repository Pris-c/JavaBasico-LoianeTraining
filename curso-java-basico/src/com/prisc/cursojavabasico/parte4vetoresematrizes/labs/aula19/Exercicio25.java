package com.prisc.cursojavabasico.parte4vetoresematrizes.labs.aula19;

import java.util.Random;

public class Exercicio25 {
/*
    Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
    mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
    a) Bi deverá receber 1 quando Ai for par; b) Bi deverá receber 0
    quando Ai for ímpar.*/

    public static void main(String[] args) {

        int[] arrayInt = new int[10];
        int[] arrayB = new int[arrayInt.length];
        Random random = new Random();


        for (int i = 0; i< arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(10);
        }

        for (int i = 0; i< arrayInt.length; i++) {
            int n = arrayInt[i];

            if ( (n%2)==0 ){
                arrayB[i] = 1;
            } else {
                arrayB[i] = 0;
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
    }



}
