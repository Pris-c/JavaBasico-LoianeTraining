package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula14e15;

import java.util.Scanner;

public class Exercicio27 {
/*Uma fruteira está vendendo frutas com a seguinte tabela de preços:
            Até 5 Kg        Acima de 5 Kg
Morango R$ 2,50 por Kg     R$ 2,20 por Kg
Maçã    R$ 1,80 por Kg     R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
compra ultrapassar R$ 25,00, receberá ainda um desconto de
10% sobre este total.

Escreva um algoritmo para ler a quantidade (em Kg) de morangos
e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.*/


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double qtdMor, qtdMa;
        double pMorango;
        double pMaca;
        double qtdTotal;
        double pTotal;

        System.out.println("FEIRA");
        System.out.print("Digite a quantidade (kg) de morangos: ");
        qtdMor = scan.nextDouble();
        System.out.print("Digite a quantidade (kg) de maças: ");
        qtdMa = scan.nextDouble();

        if (qtdMor <= 5){
            pMorango = 2.50;
        } else {
            pMorango = 2.20;
        }

        if (qtdMa <= 5){
            pMaca = 1.80;
        } else {
            pMaca = 1.50;
        }

        qtdTotal = qtdMa + qtdMor;
        pTotal = (qtdMa * pMaca) + (qtdMor * pMorango);

        if (qtdTotal >= 8){                     //**para ser >R$25, total tem que ser maior que 8kg
            pTotal = 0.9 * pTotal;
        }

        System.out.println("Valor da compra: R$ " + pTotal);


    }


}
