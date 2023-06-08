package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula14e15;

import java.util.Scanner;

public class Exercicio14 {
/*
Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A
atribuição de conceitos obedece à tabela abaixo:
o Média de Aproveitamento Conceito
o Entre 9.0 e 10.0 A
o Entre 7.5 e 9.0 B
o Entre 6.0 e 7.5 C
o Entre 4.0 e 6.0 D
o Entre 4.0 e zero E

O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a mensagem “APROVADO” se o conceito for
A, B ou C ou “REPROVADO” se o conceito for D ou E.

 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double nota1, nota2, media;
        char conceito = '0';
        String situacao = "";

        System.out.println("CALCULA MÉDIA DO SEMESTRE");
        System.out.println("Insira as notas abaixo (entre 0 a 10)");
        System.out.print("Nota 1: ");
        nota1 = scan.nextDouble();

        if((nota1 >= 0) && (nota1 <= 10)){

            System.out.print("Nota 2: ");
            nota2 = scan.nextDouble();

            if((nota2 >= 0) && (nota2 <= 10)){
                media = (nota1 + nota2) / 2;

                if (media >= 9){
                    conceito = 'A';
                    situacao = "APROVADO";
                } else if (media >= 7.5) {
                    conceito = 'B';
                    situacao = "APROVADO";
                } else if (media >= 6) {
                    conceito = 'C';
                    situacao = "APROVADO";
                } else if (media >= 4 ) {
                    conceito = 'D';
                    situacao = "REPROVADO";
                } else {
                    conceito = 'E';
                    situacao = "REPROVADO";
                }

                System.out.println(situacao);
                System.out.println("O aluno recebeu conceito " + conceito + " pela média " + media);
            } else {
                System.out.println("Nota fora do intervalo válido");
            }
        } else {
            System.out.println("Nota fora do intervalo válido");
        }

    }

}
