package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio14 {
/*
Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números impares.
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n;
        int par = 0;
        int impar = 0;

        System.out.println("CONTA PARES E IMPARES");

        for (int i = 0; i<10; i++){

            System.out.println("Digite o numero " + (i+1) + " :");
            n = scan.nextInt();
            if( (n % 2) == 0 ){
                par += 1;
            } else {
                impar += 1;
            }

        }

        System.out.println("Pares: " + par);
        System.out.println("Impares: " + impar);

    }


}
