package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio21c {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        int resto = 0;
        boolean primo = true;

        System.out.println("É UM NUMERO PRIMO?");
        System.out.println("Digite um número: ");
        n = scanner.nextInt();

        if (n > 0) {
            if (n>3) {

                int i = (n-1);
                while (i > 1) {
                    resto = n % i;

                    if (resto == 0) {
                        System.out.println("Não é primo.");
                        primo = false;
                        break;
                    }
                    i--;
                }

                if(primo) {
                    System.out.println(n + " é um número primo.");
                }

            } else {
                System.out.println(n + " é um numero primo.");
            }

        } else {
            System.out.println(n + " não é um numero primo.");
        }
    }


}
