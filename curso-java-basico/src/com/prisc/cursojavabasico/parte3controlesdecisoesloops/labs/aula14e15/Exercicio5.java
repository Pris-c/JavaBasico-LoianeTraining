package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula14e15;

import java.util.Scanner;

public class Exercicio5 {
/*
Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou
igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete;
o A mensagem "Aprovado com Distinção", se a média for igual a
dez.
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("CALCULA MEDIA");
        System.out.println("Digite a primeira nota (1 a 10):");
        nota1 = scan.nextDouble();

        if ( (nota1 >= 0) && (nota1 <= 10) ) {

            System.out.println("Digite a segunda nota:");
            nota2 = scan.nextDouble();

            if ((nota2 >= 0) && (nota2 <= 10)) {

                media = (nota1 + nota2) / 2;

                if (media == 10) {
                    System.out.println("Aprovado com distinção!");
                } else if (media >= 7) {
                    System.out.println("Aprovado!");
                } else {
                    System.out.println("Reprovado.");
                }
            }
        }

        System.out.println("Nota inválida");

    }


}
