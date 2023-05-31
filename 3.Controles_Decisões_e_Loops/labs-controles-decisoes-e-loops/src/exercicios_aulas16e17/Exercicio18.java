package exercicios_aulas16e17;

import java.util.Scanner;

public class Exercicio18 {
/*
Faça um programa que, dado um conjunto de N números, determine o
menor valor, o maior valor e a soma dos valores.
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        int soma = 0;
        int menor = 0;
        int maior = 0;

        System.out.println("Numeros inteiros");
        System.out.println("Para SAIR, digite (0) a qualquer momento");


        do{
            System.out.println("Digite um numero: ");

            n = scanner.nextInt();
            soma += n;

            if (n > maior){
                maior = n;
            } else if (n < menor) {
                menor = n;
            }

        } while (n != 0);

        System.out.println("Maior numero digitado: " + maior);
        System.out.println("Menor numero digitado: " + menor);
        System.out.println("Soma dos numeros digitados: " + soma);



    }


}
