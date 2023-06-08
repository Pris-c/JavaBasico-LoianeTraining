package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio49 {
    /*Faça um programa que mostre os n termos da Série a seguir:
o S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
Imprima no final a soma da série.*/

    public static void main(String[] args) {

        int n, m;
        int num;
        double div = 0;
        double soma = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos termos quer exibir: ");
        num = scanner.nextInt();

        for (double i = 1, j = 1; i<=num ;i++, j+=2){
             n = (int) i;
             m = (int) j;

            if (i==num){
                System.out.print(n + "\\" + m);
            } else {
                System.out.print(n + "\\" + m + " + ");
            }

            div = i/j;
            //System.out.println("div = " + div);
            soma += div;

        }
        System.out.println("\nSoma = " + soma);


    }


}
