package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula14e15;

import java.util.Scanner;

public class Exercicio21 {
/*
Faça um Programa para um caixa eletrônico. O programa deverá
perguntar ao usuário a valor do saque e depois informar quantas notas
de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5,
10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600
reais. O programa não deve se preocupar com a quantidade de notas
existentes na máquina.
. Exemplo 1: Para sacar a quantia de 256 reais, o programa
fornece duas notas de 100, uma nota de 50, uma nota de 5 e
uma nota de 1;
a. Exemplo 2: Para sacar a quantia de 399 reais, o programa
fornece três notas de 100, uma nota de 50, quatro notas de 10,
uma nota de 5 e quatro notas de 1.
 */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int saque;
        int n100 = 0;
        int n50 = 0;
        int n10 = 0;
        int n5 = 0;
        int n1 = 0;


        System.out.println("CAIXA ELETRONICO : R$ 10,00 a R$ 600,00");
        System.out.print("Digite o valor que deseja sacar: ");
        saque = scan.nextInt();

        if ((saque >= 10) || (saque <= 600)) {

            // 1, 5, 10, 50 e 100 reais

            if (saque >= 100) {
                n100 = saque / 100;
                saque = saque % 100;

                if (saque >= 50) {
                    n50 = saque / 50;
                    saque = saque % 50;
                }

                if (saque >= 10) {
                    n10 = saque / 10;
                    saque = saque % 10;
                }

                if (saque >= 5) {
                    n5 = saque / 5;
                    n1 = saque % 5;
                }
            }

            if (saque >= 50) {
                n50 = saque / 50;
                saque = saque % 50;

                if (saque >= 10) {
                    n10 = saque / 10;
                    saque = saque % 10;
                }

                if (saque >= 5) {
                    n5 = saque / 5;
                    n1 = saque % 5;
                }
            }

            if (saque >= 10) {
                n10 = saque / 10;
                saque = saque % 10;

                if (saque >= 5) {
                    n5 = saque / 5;
                    n1 = saque % 5;
                }
            }

            if (saque >= 5) {
                n5 = saque / 5;
                n1 = saque % 5;
            } else {
                n1 = saque;
            }

            System.out.println("Notas de R$ 100,00:   " + n100);
            System.out.println("Notas de R$ 50,00:    " + n50);
            System.out.println("Notas de R$ 10,00:    " + n10);
            System.out.println("Notas de R$ 5,00:     " + n5);
            System.out.println("Notas de R$ 1,00:     " + n1);

        } else {
            System.out.println("Valor indisponível");
        }

    }
}
