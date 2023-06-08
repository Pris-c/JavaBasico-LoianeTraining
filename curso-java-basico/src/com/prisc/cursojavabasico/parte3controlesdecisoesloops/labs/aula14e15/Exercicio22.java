package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula14e15;

import java.util.Scanner;

public class Exercicio22 {
/*
Faça um Programa que peça um número inteiro e determine se ele é
par ou impar. Dica: utilize o operador módulo (resto da divisão).
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        boolean par;

        System.out.println("PAR OU IMPAR");
        System.out.print("Digite um número inteiro: ");
        n = scanner.nextInt();

        par = ((n%2) == 0);

        if (par){
            System.out.println("O numero digitado é par.");
        } else {
            System.out.println("O numero digitado é impar.");
        }



    }

}
