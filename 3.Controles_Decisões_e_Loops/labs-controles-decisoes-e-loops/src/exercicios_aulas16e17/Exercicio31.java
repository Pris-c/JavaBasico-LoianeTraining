package exercicios_aulas16e17;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio31 {
/*O Sr. Manoel Joaquim expandiu seus negócios para além dos
negócios de 1,99 e agora possui uma loja de conveniências. Faça um
programa que implemente uma caixa registradora rudimentar. O
programa deverá receber um número desconhecido de valores
referentes aos preços das mercadorias. Um valor zero deve ser
informado pelo operador para indicar o final da compra. O programa
deve então mostrar o total da compra e perguntar o valor em dinheiro
que o cliente forneceu, para então calcular e mostrar o valor do troco.
Após esta operação, o programa deverá voltar ao ponto inicial, para
registrar a próxima compra. A saída deve ser conforme o exemplo
abaixo:
o Lojas Tabajara
o Produto 1: R$ 2.20
o Produto 2: R$ 5.80
o Produto 3: R$ 0
o Total: R$ 9.00
o Dinheiro: R$ 20.00
o Troco: R$ 11.00
o ...*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> produto = new ArrayList<>();
        //ArrayList<Double> precoP = new ArrayList<>();

        int cont = 0;
        double preco = 0;
        double valorCompra = 0;
        double pgmt = 0;
        double troco = 0;

        do {
            System.out.println("-------------");
            System.out.println("Nova compra");

            do {
                System.out.println("Entre com o valor do produto ou digite (0) para concluir:");
                preco = scanner.nextDouble();

                if (preco > 0){
                    produto.add(preco);
                    valorCompra += preco;
                    cont++;
                }

            } while (preco != 0);

            System.out.println("LOJAS TABAJARA");
            for (int i = 0;  i < produto.size(); i++){
                System.out.println("o Produto " + (i+1) +": R$ " + produto.get(i) );
            }
            System.out.println("Total da compra = R$ " + valorCompra);

            System.out.print("Valor fornecido pelo cliente: R$ ");
            pgmt = scanner.nextDouble();

            if (pgmt >= valorCompra){
                troco = pgmt - valorCompra;
                System.out.println("o Troco: R$ " + troco);
                System.out.println("");

            } else {
                System.out.println("Valor insuficiente para pagamento.");
            }


        } while (true);


    }
}
