package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio22a {
/*
Altere o programa de cálculo dos números primos, informando, caso o
número não seja primo, por quais número ele é divisível.
*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        int cont = 0;
        int contPrint = 0;
        int resto = 0;

        System.out.println("É UM NUMERO PRIMO?");
        System.out.print("Digite um número: ");
        n = scanner.nextInt();

        if (n>0) {
            if ((n > 3)) {

                for (int i = (n - 1); i > 1; i--) {
                    resto = n % i;

                    if (resto == 0) {
                        cont++;


                        if (cont > 0) {

                            if ((cont == 1) && (contPrint == 0)) {
                                contPrint++;
                                System.out.println(n + " não é um numero primo");
                                System.out.println(i + " é um divisor");

                            } else {
                                System.out.println(i + " é um divisor.");
                            }
                        }
                    }
                }

            }

            if ( (cont==0)){
                System.out.println(n + " é um número primo.");
            } else {
                System.out.println("1 é um divisor");
            }


        } else if (n==0){
            System.out.println("0 não é um numero primo");
        } else {
            System.out.println(n + " não é um numero natural.");
        }


    }

}
