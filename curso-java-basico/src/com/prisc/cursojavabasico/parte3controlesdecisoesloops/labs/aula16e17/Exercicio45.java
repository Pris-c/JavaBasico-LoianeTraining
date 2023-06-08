package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio45 {
/*Desenvolver um programa para verificar a nota do aluno em uma
prova com 10 questões, o programa deve perguntar ao aluno a
resposta de cada questão e ao final comparar com o gabarito da prova
e assim calcular o total de acertos e a nota (atribuir 1 ponto por
resposta certa). Após cada aluno utilizar o sistema deve ser feita uma
pergunta se outro aluno vai utilizar o sistema. Após todos os alunos
terem respondido informar:
. Maior e Menor Acerto;
a. Total de Alunos que utilizaram o sistema;
b. A Média das Notas da Turma.
Gabarito da Prova:
01 - A
02 - B
03 - C
04 - D
05 - E
06 - E
07 - D
08 - C
09 - B
10 - A */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String q1 = "A";
        String q2 = "B";
        String q3 = "C";
        String q4 = "D";
        String q5 = "E";
        String q6 = "E";
        String q7 = "D";
        String q8 = "C";
        String q9 = "B";
        String q10 = "A";
        String resp;
        String opcao = "-1";
        int aluno = 0;
        int maiorNota = 0;
        int menorNota = 0;

        do {
            int acertos = 0;

            System.out.println("Preencha suas respostas");
            System.out.println("Alternativas (A), (B), (C), (D) ou (E)");
            for (int i = 1; i <= 10; i++) {
                System.out.println("Questão " + i + ": ");
                resp = scanner.next();

                if ((i == 1) && (resp.equalsIgnoreCase(q1))) {
                    acertos++;
                } else if ((i == 2) && (resp.equalsIgnoreCase(q2))) {
                    acertos++;
                } else if ((i == 3) && (resp.equalsIgnoreCase(q3))) {
                    acertos++;
                } else if ((i == 4) && (resp.equalsIgnoreCase(q4))) {
                    acertos++;
                } else if ((i == 5) && (resp.equalsIgnoreCase(q5))) {
                    acertos++;
                } else if ((i == 6) && (resp.equalsIgnoreCase(q6))) {
                    acertos++;
                } else if ((i == 7) && (resp.equalsIgnoreCase(q7))) {
                    acertos++;
                } else if ((i == 8) && (resp.equalsIgnoreCase(q8))) {
                    acertos++;
                } else if ((i == 9) && (resp.equalsIgnoreCase(q9))) {
                    acertos++;
                } else if ((i == 10) && (resp.equalsIgnoreCase(q10))) {
                    acertos++;
                }
            }

            aluno++;
            if (aluno==1){
                maiorNota = acertos;
                menorNota = acertos;
            } else {
                if (acertos > maiorNota){
                    maiorNota = acertos;
                }
                if (acertos < menorNota){
                    menorNota = acertos;
                }
            }
            System.out.println("\nNota do aluno (" + aluno + "): " + acertos + "\n");

            do {
                System.out.println("Digite (0) para sair ou (1) se outro aluno for utilizar o sistema");
                opcao = scanner.next();
            } while ( (!opcao.equals("1")) && (!opcao.equals("0")));

        } while (!opcao.equals("0"));

        System.out.println("-----");
        System.out.println("Maior nota = " + maiorNota);
        System.out.println("Menor nota = " + menorNota);

    }

}
