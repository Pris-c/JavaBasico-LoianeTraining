package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula14e15;

import java.util.Scanner;

public class Exercicio13 {
/*
Faça um Programa que leia um número e exiba o dia correspondente
da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
aparecer valor inválido.
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o dia da semana (1 a 7): ");
        int dia = scan.nextInt();

        switch (dia){
            case 1: System.out.println( dia + " - Domingo"); break;
            case 2: System.out.println(dia + " - Segunda"); break;
            case 3: System.out.println(dia + " - Terça"); break;
            case 4: System.out.println(dia + " - Quarta"); break;
            case 5: System.out.println(dia + " - Quinta"); break;
            case 6: System.out.println(dia + " - Sexta"); break;
            case 7: System.out.println(dia + " - Sábado"); break;
            default: System.out.println("Valor inválido!");
        }


    }
}
