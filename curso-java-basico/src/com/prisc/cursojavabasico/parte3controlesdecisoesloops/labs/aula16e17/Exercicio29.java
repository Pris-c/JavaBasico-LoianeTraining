package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

public class Exercicio29 {
/*O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99,
com cerca de 10 caixas. Para agilizar o cálculo de quanto cada cliente
deve pagar ele desenvolveu um tabela que contém o número de itens
que o cliente comprou e ao lado o valor da conta. Desta forma a
atendente do caixa precisa apenas contar quantos itens o cliente está
levando e olhar na tabela de preços. Você foi contratado para
desenvolver o programa que monta esta tabela de preços, que conterá
os preços de 1 até 50 produtos, conforme o exemplo abaixo:
o Lojas Quase Dois - Tabela de preços
o 1 - R$ 1.99
o 2 - R$ 3.98
o ...
o 50 - R$ 99.50*/

    public static void main(String[] args) {


        System.out.println("LOJINHA DO MANOEL");
        double preco = 0;

        for (int j = 1; j <= 50; j++){
            preco = j * 1.99;
            System.out.println("o " + j + " -   R$ " + preco);
        }

    }
}
