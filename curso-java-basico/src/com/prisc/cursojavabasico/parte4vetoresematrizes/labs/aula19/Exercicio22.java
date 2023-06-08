package com.prisc.cursojavabasico.parte4vetoresematrizes.labs.aula19;

public class Exercicio22 {
/*Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
para implementar um programa que determine o percentual de
números 0's e 1's existentes no vetor A.*/


    public static void main(String[] args) {


        int[] A = new int[10];
        double cont1 = 0;
        double prc1 = 0;

        for (int i =0; i < A.length; i++) {
            A[i] = (int) Math.round(Math.random()*1);
        }

        for (int num :
             A ) {
            if ( (num==1) ){
                cont1++;
            }

            prc1 = cont1/10;
            System.out.println(num + " ");
        }

        System.out.println(" Porcentagem de 1 = " + prc1);
        System.out.println(" Porcentagem de 0 = " + (1-prc1));

    }



}
