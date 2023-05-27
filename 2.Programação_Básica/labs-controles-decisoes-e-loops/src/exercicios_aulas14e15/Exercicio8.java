package exercicios_aulas14e15;

import java.util.Scanner;

public class Exercicio8 {
/*
Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato.
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double preco1, preco2, preco3, menor;
        char produto;
        boolean condPreco = true;

        System.out.println("COMPARA 3 PRODUTOS COM PREÇOS DISTINTOS");
        System.out.println("Digite o preço do produto 1:");
        preco1 = scanner.nextDouble();
        System.out.println("Digite o preço do produto 2:");
        preco2 = scanner.nextDouble();
        System.out.println("Digite o preço do produto 3:");
        preco3 = scanner.nextDouble();

        if ( (preco1==preco2) || (preco2==preco3) || (preco1==preco3) ){
            condPreco = false;
        }

        if (condPreco) {

            if ((preco1 < preco2) && (preco1 < preco3)) {
                produto = '1';
            } else if ((preco2 < preco1) && (preco2 < preco3)) {
                menor = preco2;
                produto = '2';
            } else {
                produto = '3';
            }

            System.out.println("Compre o produto " + produto + " !");
        }

        System.out.println("Há produtos com preços iguais");


    }
}
