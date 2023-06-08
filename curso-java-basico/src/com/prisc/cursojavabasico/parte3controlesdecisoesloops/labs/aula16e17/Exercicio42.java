package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio42 {
/*Faça um programa que leia uma quantidade indeterminada de
números positivos e conte quantos deles estão nos seguintes
intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados
deverá terminar quando for lido um número negativo.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        int int1 = 0;  // 0-25
        int int2 = 0;  // 26-50
        int int3 = 0;  // 51-75
        int int4 = 0;  // 76-100


        do {
            System.out.println("Digite um numero: ");
            n = scanner.nextInt();

            if ( (n>=0) && (n<=100)) {
                if ((n >= 0) && (n <= 25)) {
                    int1++;
                } else if ((n <= 50)) {
                    int2++;
                } else if ((n <= 75)) {
                    int3++;
                } else if ((n <= 100)) {
                    int4++;
                }
            }

        } while(n>=0);

        System.out.println("[0 - 25 ] = " + int1 + " numeros");
        System.out.println("[26 - 50 ] = " + int2 + " numeros");
        System.out.println("[51 - 75 ] = " + int3 + " numeros");
        System.out.println("[76 - 100 ] = " + int4 + " numeros");

    }


}
