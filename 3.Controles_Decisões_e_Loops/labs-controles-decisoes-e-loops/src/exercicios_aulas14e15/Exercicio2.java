package exercicios_aulas14e15;

import java.util.Scanner;

public class Exercicio2 {
//Faça um Programa que peça um valor e mostre na tela se o valor é
//positivo ou negativo.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("POSITIVO OU NEGATIVO?");
        System.out.print("Digite um valor inteiro: ");
        num = scan.nextInt();

        if (num > 0) {
            System.out.println("O valor digitado é positivo.");
        } else if (num < 0) {
            System.out.println("O valor digitado é negativo.");
        } else {
            System.out.println("O valor digitado é nulo.");
        }

    }
}
