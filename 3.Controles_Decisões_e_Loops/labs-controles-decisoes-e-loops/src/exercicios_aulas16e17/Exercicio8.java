package exercicios_aulas16e17;

import java.util.Scanner;

public class Exercicio8 {
/*
Faça um programa que leia 5 números e informe a soma e a média
dos números.
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2, n3, n4, n5;
        int soma;
        double media;

        System.out.println("COMPARA  5 NUMEROS INTEIROS");
        System.out.println("Digite o primeiro numero: ");
        n1 = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = scan.nextInt();
        System.out.println("Digite o terceiro numero: ");
        n3 = scan.nextInt();
        System.out.println("Digite o quarto numero: ");
        n4 = scan.nextInt();
        System.out.println("Digite o quinto numero: ");
        n5 = scan.nextInt();

        soma = n1 + n2 + n3 + n4 + n5;
        media = soma/5;

        System.out.println("soma = " + soma);
        System.out.println("media = " + media);


    }
}
