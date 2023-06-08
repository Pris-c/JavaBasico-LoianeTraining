package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio7a {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2, n3, n4, n5;
        int maior = 0;

        System.out.println("COMPARA  5 NUMEROS INTEIROS");
        System.out.println("Digite o primeiro numero: ");
        n1 = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = scan.nextInt();
        System.out.println("Digite o terceiro numero: ");
        n3 = scan.nextInt();
        System.out.println("Digite o quarto numero: ");
        n4 = scan.nextInt();
        System.out.println("Digite o quinto numero: ");
        n5 = scan.nextInt();


        if ((n1 >= n2) &&
            (n1 >= n3) &&
            (n1 >= n4) &&
            (n1 >= n5)) {

            maior = n1;
        }

        if ((n2 >= n1) &&
            (n2 >= n3) &&
            (n2 >= n4) &&
            (n2 >= n5) ){

            maior = n2;
        }

        if ((n3 >= n1) &&
            (n3 >= n2) &&
            (n3 >= n4) &&
            (n3 >= n5)) {

            maior = n3;
        }

        if ((n4 >= n1) &&
            (n4 >= n2) &&
            (n4 >= n3) &&
            (n4 >= n5)) {

            maior = n4;

        }
        if ((n5 >= n1) &&
            (n5 >= n2) &&
            (n5 >= n3) &&
            (n5 >= n4)) {

            maior = n5;
        }


        System.out.println("Maior = " + maior);


    }
}
