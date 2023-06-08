package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio28 {
/*Faça um programa que calcule o valor total investido por um
colecionador em sua coleção de CDs e o valor médio gasto em cada
um deles. O usuário deverá informar a quantidade de CDs e o valor
para em cada um.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cd;
        int precoCd;
        int soma = 0;
        int media = 0;

        System.out.println("COLEÇÃO DE CDs");
        do {
            System.out.print("Total de CDs da coleção: ");
            cd = scanner.nextInt();

            if (cd<1){
                System.out.println("É necessário ao menos 1 CD.");
            }
        } while (cd<1);

        for (int i = 0; i < cd; i++) {

            do {
                System.out.println("Preço do CD " + (i + 1) + ": ");
                precoCd = scanner.nextInt();

                if (precoCd < 0) {
                    System.out.println("O preço não pode ser inferior a R$ 0");
                }

            } while (precoCd < 0);
            soma += precoCd;

        }

        media = soma / cd;

        System.out.println("Preço total gasto na coleção: R$ " + soma);
        System.out.println("Preço médio pago por CD: R$ " + media);
    }
}
