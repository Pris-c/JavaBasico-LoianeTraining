package exercicios_aulas16e17;

import java.util.Scanner;

public class Exercicio17 {
//Faça um programa que calcule o fatorial de um número inteiro
//fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        int fat = 1;

        System.out.println("FATORIAL");
        System.out.println("Digite um numero: ");
        n = scanner.nextInt();

        for (int i=n; i>0; i--){
            fat *= i;
        }

        System.out.println("O fatorial de " + n + " é " + fat);

    }


}
