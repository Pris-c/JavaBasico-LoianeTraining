package com.prisc.cursojavabasico.parte4vetoresematrizes.labs.aula19;

import java.text.DecimalFormat;

public class Exercicio36 {
/*Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que
cada elemento do vetor A é formado pela potência de base 2 elevado
ao expoente igual a posição do respectivo elemento, ou seja:
A[i] = 2i. Sugestão int A[11];*/

    public static void main(String[] args) {

        double[] A = new double[11];

        DecimalFormat df = new DecimalFormat("###,###");

        System.out.print("A = ");
        for (int i = 0; i < A.length; i++) {

            A[i] = Math.pow(2, i);
            System.out.print(df.format(A[i]) + ", ");
        }



    }




}
