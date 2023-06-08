package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio43 {
/*O cardápio de uma lanchonete é o seguinte:
o Especificação Código Preço
o Cachorro Quente 100 R$ 1,20
o Bauru Simples 101 R$ 1,30
o Bauru com ovo 102 R$ 1,50
o Hambúrguer 103 R$ 1,20
o Cheeseburguer 104 R$ 1,30
o Refrigerante 105 R$ 1,00
Faça um programa que leia o código dos itens pedidos e as
quantidades desejadas. Calcule e mostre o valor a ser pago por
item (preço * quantidade) e o total geral do pedido. Considere
que o cliente deve informar quando o pedido deve ser
encerrado.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cod = -1;
        int qtd = 0;

        int qtd100 = 0;
        int qtd101 = 0;
        int qtd102 = 0;
        int qtd103 = 0;
        int qtd104 = 0;
        int qtd105 = 0;

        double p100 = 1.20;
        double p101 = 1.30;
        double p102 = 1.50;
        double p103 = 1.20;
        double p104 = 1.30;
        double p105 = 1.00;

        double preco = 0;
        String produto = "";

        do {

            System.out.println("Digite o codigo do produto ou (0) para encerrar pedido: ");
            cod = scanner.nextInt();
            if (cod!=0){
                System.out.println("Quantidade: ");
                qtd = scanner.nextInt();

                switch (cod){
                    case 100: qtd100 += qtd; break;
                    case 101: qtd101 += qtd; break;
                    case 102: qtd102 += qtd; break;
                    case 103: qtd103 += qtd; break;
                    case 104: qtd104 += qtd; break;
                    case 105: qtd105 += qtd; break;
            }
            }
        } while (cod!=0);

        double t100 = (qtd100*p100);
        double t101 = (qtd101*p101);
        double t102 = (qtd102*p102);
        double t103 = (qtd103*p103);
        double t104 = (qtd104*p104);
        double t105 = (qtd105*p105);
        double total = t100 +t101 + t102 + t103 + t104 + t105;

        System.out.println("Qtd\t\t Produto\t\t\tValor Un.\tTotal");
        if (qtd100 > 0){ System.out.println(qtd100 + " - Cachorro Quente(100)\t\tR$ 1,20\t\t" + t100 ); }
        if (qtd101 > 0){ System.out.println(qtd101 + " - Bauru Simples(101)\t\tR$ 1,20\t\t" + t101 ); }
        if (qtd102 > 0){ System.out.println(qtd102 + " - Bauru com ovo(102)\t\tR$ 1,20\t\t" + t102 ); }
        if (qtd103 > 0){ System.out.println(qtd103 + " - Hambúrguer(103)\t\t\tR$ 1,20\t\t" + t103 ); }
        if (qtd104 > 0){ System.out.println(qtd104 + " - Cheeseburguer(104)\t\tR$ 1,20\t\t" + t104 ); }
        if (qtd105 > 0){ System.out.println(qtd105 + " - Refrigerante(105)\t\tR$ 1,20\t\t" + t105 ); }
        System.out.println("\nTotal da compra = " + total);

    }
}
