package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula14e15;

import java.util.Scanner;

public class Exercicio6 {
//Faça um Programa que leia três números e mostre o maior deles.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, maior;

        System.out.println("COMPARA 3 INTEIROS");
        System.out.println("Digite o primeiro numero:");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero:");
        num3 = scanner.nextInt();

        if((num1 >=  num2) && (num1 >= num3)){
            maior = num1;
        } else if ((num2 >= num1) && (num2 >= num3)) {
            maior = num2;
        } else {
            maior = num3;
        }

        System.out.println("O maior valor digitado foi " + maior);
    }


}
