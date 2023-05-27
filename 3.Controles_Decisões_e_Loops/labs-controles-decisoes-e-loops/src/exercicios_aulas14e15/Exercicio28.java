package exercicios_aulas14e15;

import java.util.Scanner;

import static java.lang.System.exit;

public class Exercicio28 {
/*
O Hipermercado Tabajara está com uma promoção de carnes que é
imperdível. Confira:
o                   Até 5 Kg            Acima de 5 Kg
o File Duplo        R$ 4,90 por          Kg R$ 5,80 por Kg
o Alcatra           R$ 5,90 por          Kg R$ 6,80 por Kg
o Picanha           R$ 6,90 por          Kg R$ 7,80 por Kg
Para atender a todos os clientes, cada cliente poderá levar
apenas um dos tipos de carne da promoção, porém não há
limites para a quantidade de carne por cliente. Se compra for
feita no cartão Tabajara o cliente receberá ainda um desconto
de 5% sobre o total a compra. Escreva um programa que peça
o tipo e a quantidade de carne comprada pelo usuário e gere
um cupom fiscal, contendo as informações da compra: tipo e
quantidade de carne, preço total, tipo de pagamento, valor do
desconto e valor a pagar.
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int tipo, formaPg;
        String tCarne = "";
        double kg;
        double precoKg = 0;
        double desc = 0;
        double precoT;

        System.out.println("SUPERMERCADO TABAJARA");
        System.out.println("Escolha o tipo da carne: ");
        System.out.println("(1) - Filé Duplo");
        System.out.println("(2) - Alcatra");
        System.out.println("(3) - Picanha");
        tipo = scan.nextInt();


        //System.out.println("Opçao inválida");

        if( (tipo >=1 ) && (tipo <= 3)) {

            System.out.println("Quantos kilos deseja?");
            kg = scan.nextDouble();

            if (kg > 0) {

                System.out.println("Qual é a forma de pagamento?");
                System.out.println("(1) - Cartão Tabajaras");
                System.out.println("(2) - Outro");
                formaPg = scan.nextInt();


                if ((formaPg == 1) || (formaPg == 2)) {

                    if (kg <= 5) {
                        switch (tipo) {
                            case 1:
                                precoKg = 4.90;
                                tCarne = "File Duplo";
                                break;
                            case 2:
                                precoKg = 5.90;
                                tCarne = "Alcatra";
                                break;
                            case 3:
                                precoKg = 6.60;
                                tCarne = "Picanha";
                                break;
                        }
                        // >5
                    } else {
                        switch (tipo) {
                            case 1:
                                precoKg = 5.80;
                                break;
                            case 2:
                                precoKg = 6.80;
                                break;
                            case 3:
                                precoKg = 7.80;
                                break;
                        }
                    }

                    precoT = kg * precoKg;

                    if (formaPg == 1) {
                        desc = precoT * 0.05;
                    }

                    System.out.println("--------CUPOM--FISCAL--------");
                    System.out.println("Tipo da carne: " + tCarne);
                    System.out.println("Quantidade: " + kg + " kg");
                    System.out.println("Preço Total: R$" + precoT);
                    System.out.println("Desconto: R$ " + desc);
                    System.out.println("Valor a pagar: R$ " + (precoT - desc));

                //Forma de pagamento
                } else {
                    System.out.println("Forma de pagamento inválida");
                }

            } else {
                System.out.println("Quantidade inválida.");
            }

        } else {
            System.out.println("Opçao inválida.");
        }


    }
}
