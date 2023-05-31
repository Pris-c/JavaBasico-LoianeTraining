package exercicios_aulas16e17;

import java.util.Scanner;

public class Exercicio38 {
/*Um funcionário de uma empresa recebe aumento salarial anualmente:
Sabe-se que:
. Esse funcionário foi contratado em 1995, com salário inicial de
R$ 1.000,00;
a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
b. A partir de 1997 (inclusive), os aumentos salariais sempre
correspondem ao dobro do percentual do ano anterior. Faça um
programa que determine o salário atual desse funcionário. Após
concluir isto, altere o programa permitindo que o usuário digite o
salário inicial do funcionário.*/


    public static void main(String[] args) {

        //double salarioIn = 1000.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Salario inicial em 1995: ");
        double salarioIn = scanner.nextDouble();

        int anoContrato = 1995;
        int anoAtual = 2023;
        double aum = (1.5/100);

        double salNovo = salarioIn * aum;   //96

        for (int i = 1997; i < anoAtual; i++){
            aum *= 2;               //1.5% * 2
            salNovo *= (1 + aum);   //Sal * 1,015
        }

        System.out.println("Salario em 2023: R$ " + salNovo );


    }
}
