package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio24 {
/*Faça um programa que calcule o mostre a média aritmética de N
notas.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        int soma = 0;
        int cont = 0;

        System.out.println("MÉDIA DAS NOTAS");
        System.out.println("Para SAIR, digite (0) a qualquer momento");


        do{
            System.out.println("Digite uma nota: ");
            n = scanner.nextInt();

            soma += n;
            cont++;
            //System.out.println("soma = " +soma+ " cont = " + (cont-1));

        } while (n != 0);

        System.out.println("Média: " + ( soma/(cont-1) ) );

    }


}
