package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula14e15;

import java.util.Scanner;

public class Exercicio9 {
//Faça um Programa que leia três números e mostre-os em ordem decrescente.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, maior, menor, medio;

        System.out.println("ORDENA 3 INTEIROS");
        System.out.println("Digite o primeiro numero:");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero:");
        num3 = scanner.nextInt();

        if((num1 > num2) && (num1 > num3)){
            maior = num1;

            if (num2 > num3){
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }

        } else if ((num2 > num1) && (num2 > num3)) {
            maior = num2;

            if (num1 > num3){
                medio = num1;
                menor = num3;
            } else {
                medio = num3;
                menor = num1;
            }

        } else {
            maior = num3;

            if (num1 > num2){
                medio = num1;
                menor = num2;
            } else {
                medio = num2;
                menor = num1;
            }
        }

        System.out.println("Ordem crescente: " + menor + " - " + medio
                            + " - " + maior);

    }

}
