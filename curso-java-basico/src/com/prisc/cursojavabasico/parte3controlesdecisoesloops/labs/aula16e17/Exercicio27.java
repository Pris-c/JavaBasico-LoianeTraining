package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio27 {
/*Faça um programa que calcule o número médio de alunos por turma.
Para isto, peça a quantidade de turmas e a quantidade de alunos para
cada turma. As turmas não podem ter mais de 40 alunos.*/


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int turmas;
        int alunos;
        int soma = 0;
        int media = 0;

        System.out.println("MÉDIA DE ALUNOS POR TURMA");
        do {
            System.out.print("Numero de turmas: ");
            turmas = scanner.nextInt();

            if (turmas<1){
                System.out.println("É necessário ao menos 1 turma.");
            }
        } while (turmas<1);

        for (int i = 0; i < turmas; i++) {

            do {
                System.out.println("Numero de alunos na turma " + (i + 1) + ": ");
                alunos = scanner.nextInt();

                if ((alunos < 0) || (alunos > 40)) {
                    System.out.println("As turmas devem ter entre 1 e 40 alunos");
                }

            } while ((alunos < 0) || (alunos > 40));
            soma += alunos;

        }

        media = soma / turmas;
        System.out.println("Numero médio de alunos por turma = " + media);

    }
}
