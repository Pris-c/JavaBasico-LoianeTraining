package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula14e15;

import java.util.Scanner;

public class Exercicio23 {
/*
Faça um Programa que peça um número e informe se o número é
inteiro ou decimal. Dica: utilize uma função de arredondamento.
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n, n2;


        System.out.println("INTEIRO OU DECIMAL");
        System.out.print("Digite um número: ");
        n = scanner.nextDouble();

         n2 = Math.ceil(n);

         /*
         o número recebido será arredondado para o valor mais próximo e alto
         e retornado como um decimal da mesma forma
          */

         if (n == n2){
             System.out.println("O número digitado é inteiro");
         } else {
             System.out.println("O número digitado é decimal");
         }

    }

}
