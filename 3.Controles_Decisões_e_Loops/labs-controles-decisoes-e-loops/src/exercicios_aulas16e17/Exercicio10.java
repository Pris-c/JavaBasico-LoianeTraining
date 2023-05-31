package exercicios_aulas16e17;

import java.util.Scanner;

public class Exercicio10 {
/*
Faça um programa que receba dois números inteiros e gere os
números inteiros que estão no intervalo compreendido por eles.
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = scanner.nextInt();

        if (n1 == n2){
            System.out.println("Os numeros digitados são iguais");
        }

        else if (n1 > n2){
            for (int i = (n2+1); i < n1; i++) {
                System.out.println(i);
            }

        } else {
            for (int i = (n1+1); i < n2; i++){
                System.out.println(i);
            }
        }

    }
}
