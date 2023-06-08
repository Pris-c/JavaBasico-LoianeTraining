package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio15 {
/*
A série de Fibonacci é formada pela seqüência
1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série
até o n−ésimo termo.
 */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("FIBONACCI");
        System.out.println("Digite a quantidade de numeros a exibir: ");
        int n = scanner.nextInt();
        int n1 = 1;
        int n2 = 0;
        int f = 0;



        for (int i = 0; i < n; i++){

            f = n1 + n2;
            n1 = n2;
            n2 = f;

            System.out.println(f);

        }

    }
}
