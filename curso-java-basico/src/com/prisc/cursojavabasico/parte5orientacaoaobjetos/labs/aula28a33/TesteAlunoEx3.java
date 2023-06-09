package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula28a33;

import com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula25a27.Aluno;

import java.util.Scanner;

public class TesteAlunoEx3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AlunoEx3 aluno = new AlunoEx3();

        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(scanner.nextLine());
        System.out.print("Digite o nome do curso: ");
        aluno.setNomeCurso(scanner.nextLine());
        System.out.println("Digite o numero de matricula: ");
        aluno.setMatricula(scanner.nextInt());
        System.out.println("Informe as matrículas: ");
        scanner.nextLine();

        for (int i = 0; i < aluno.getDisciplina().length; i++) {
            System.out.println("Disciplina n° " + (i+1) + ": ");
            aluno.setDisciplinaPosicao(i, scanner.nextLine());
        }
        System.out.println("Aluno cadastrado com sucesso!");
        System.out.println("-----------------------------");

        for (int i = 0; i < aluno.getNotasDisc().length; i++) {
            for (int j = 0; j < aluno.getNotasDisc()[i].length; j++) {
                System.out.println("Insira a nota " + (i + 1) + " da disciplina " + aluno.getDisciplina()[i] + ": ");

                aluno.setNotaDisciplina(i, j, scanner.nextDouble());
            }
        }

        System.out.println("");
        aluno.mostrarInfos();
        System.out.println("");


    }
}

