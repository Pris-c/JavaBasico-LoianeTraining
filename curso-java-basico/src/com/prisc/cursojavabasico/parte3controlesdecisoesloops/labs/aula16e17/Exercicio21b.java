package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio21b {
/*
Faça um programa que peça um número inteiro e determine se ele é
ou não um número primo. Um número primo é aquele que é divisível
somente por ele mesmo e por 1.
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        int cont = 0;
        int resto = 0;

        System.out.println("É UM NUMERO PRIMO?");
        System.out.println("Digite um número: ");
        n = scanner.nextInt();

        if (n > 0) {
            if (n>3) {

                int i = (n-1);
                while ((i > 1) && (cont == 0)) {
                    resto = n % i;

                    if (resto == 0) {
                        cont++;
                    }

                    //System.out.println("i = " + i + " e cont = " + cont);

                    i--;
                }

                if (cont == 0) {
                    System.out.println(n + " é um numero primo.");
                } else {
                    System.out.println(n + " não é um número primo.");
                }

            }else {
                System.out.println(n + " é um numero primo.");
            }

        } else {
            System.out.println(n + " não é um numero primo.");
        }
    }
}
