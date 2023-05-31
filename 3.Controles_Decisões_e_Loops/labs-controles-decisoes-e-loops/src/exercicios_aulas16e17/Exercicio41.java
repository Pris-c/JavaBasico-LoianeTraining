package exercicios_aulas16e17;

import java.util.Scanner;

public class Exercicio41 {
/*Faça um programa que receba o valor de uma dívida e mostre uma
tabela com os seguintes dados: valor da dívida, valor dos juros,
quantidade de parcelas e valor da parcela.
o Os juros e a quantidade de parcelas seguem a tabela abaixo:
Quantidade de Parcelas % de Juros sobre o valor inicial da dívida
1 0
3 10
6 15
9 20
12 25
Exemplo de saída do programa:
Valor da Dívida Valor dos Juros Quantidade de Parcelas Valor da Parcela
R$ 1.000,00 0 1 R$ 1.000,00
R$ 1.100,00 100 3 R$ 366,00
R$ 1.150,00 150 6 R$ 191,67*/


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double juros = 0;

        System.out.println("Digite o valor da dívida: ");
        double divida = scanner.nextDouble();
        System.out.println("Digite o numero de parcelas: ");
        int parcelas = scanner.nextInt();

        if ( (parcelas==3) || (parcelas==1) || (parcelas==6 || (parcelas==9) || (parcelas==12))){
            switch (parcelas){
                case 1: juros = 0; break;
                case 3: juros = 0.10; break;
                case 6: juros = 0.15; break;
                case 9: juros = 0.20; break;
                case 12: juros = 0.25; break;
            }

            double dívidaF = divida * (1+juros);
            double valorParc = dívidaF/parcelas;

            System.out.println("Valor da dívida: " + dívidaF);
            System.out.println("Valor dos juros: " + (dívidaF-divida));
            System.out.println("Numero de parcelas: " + parcelas);
            System.out.println("Valor da parcela: " + (dívidaF/parcelas));
        }  else {
            System.out.println("Numero de parcelas inválido.");
        }
    }
}
