package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

public class Exercicio6 {
/*
Faça um programa que imprima na tela os números de 1 a 20, um
abaixo do outro. Depois modifique o programa para que ele mostre os
números um ao lado do outro.
 */

    public static void main(String[] args) {


        /*for (int i=0; i<20; i++){
            System.out.println( i+1 );
        }*/

        for (int i=0; i<20; i++){
            if (( i!=19 )) {
                System.out.print( (i + 1) + " - ");
            }else {
                System.out.println( (i+1) );
            }

        }


    }
}
