package exercicios_aulas16e17;

import java.util.Scanner;

public class Exercicio30 {
/*O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende
implantar a metodologia da tabelinha, que já é um sucesso na sua loja
de 1,99. Você foi contratado para desenvolver o programa que monta
a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão
informado pelo usuário, conforme o exemplo abaixo:
o Preço do pão: R$ 0.18
o Panificadora Pão de Ontem - Tabela de preços
o 1 - R$ 0.18
o 2 - R$ 0.36
o ...
o 50 - R$ 9.00*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Panificadora Pão de Ontem");
        double preco = 0;
        double precoUn = 0;

        do {
            System.out.print("Insira o valor do pão: ");
            precoUn = scanner.nextDouble();

            if (precoUn <= 0){
                System.out.println("Valor inválido.");
            }

        } while (precoUn <= 0);

        for (int j = 1; j <= 50; j++) {
            preco = j * precoUn;
            System.out.println("o " + j + " -   R$ " + preco);
        }
    }

}
