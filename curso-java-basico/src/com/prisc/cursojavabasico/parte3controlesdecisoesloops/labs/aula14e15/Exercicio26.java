package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula14e15;

import java.util.Scanner;

public class Exercicio26 {
/*
Um posto está vendendo combustíveis com a seguinte tabela de
descontos:

. Álcool:
a. até 20 litros, desconto de 3% por litro
b. acima de 20 litros, desconto de 5% por litro

Gasolina:
c. até 20 litros, desconto de 4% por litro
d. acima de 20 litros, desconto de 6% por litro.

Escreva um algoritmo que leia o número de litros vendidos, o tipo de
combustível (codificado da seguinte forma: A-álcool, Ggasolina),
calcule e imprima o valor a ser pago pelo cliente sabendo-se que o
 preço do litro da gasolina é R$ 2,50 o preço
do litro do álcool é R$ 1,90.
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double l;
        double desc = 0;
        double valorL = 0;
        double valorT;
        char comb;

        System.out.println("POSTO DE COMBUSTÍVEL");
        System.out.print("Quantidade de litros: ");
        l = scan.nextDouble();
        System.out.println("Qual combustível deseja?");
        System.out.println("(A) - Alcool      (G) - Gasolina");
        comb = scan.next().charAt(0);

        if ( (comb=='a') || (comb=='A') || (comb=='g') || (comb=='G')) {

            switch (comb) {
                case 'A':
                case 'a':
                    valorL = 1.90;
                    if (l <= 20) {
                        desc = 0.03;
                    } else {
                        desc = 0.05;
                    }
                    break;
                case 'G':
                case 'g':
                    valorL = 2.50;
                    if (l <= 20) {
                        desc = 0.04;
                    } else {
                        desc = 0.06;
                    }
            }
            valorT = (l * valorL) * (1-desc);
            System.out.println("O total da sua compra é R$ " + valorT);

        } else {
               System.out.println("Opção inválida");
        }

    }

}
