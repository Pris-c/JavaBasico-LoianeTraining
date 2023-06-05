package aula24a27;

import java.util.Scanner;

public class TesteAluno {
/*Escreva um programa para testar essa classe, que pede
as informações  do aluno ao usuário e ao  final informa o nome das disciplinas*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = scanner.nextLine();
        System.out.print("Digite o nome do curso: ");
        aluno.nomeCurso = scanner.nextLine();
        System.out.println("Digite o numero de matricula: ");
        aluno.matricula = scanner.nextInt();
        System.out.println("Informe as matrículas: ");
        scanner.nextLine();

        for (int i = 0; i < aluno.disciplina.length; i++){
            System.out.println("Disciplina n° " + i +": ");
            aluno.disciplina[i] = scanner.nextLine();
        }
        System.out.println("Aluno cadastrado com sucesso!");
        System.out.println("-----------------------------");

        for (int j=0; j<aluno.notasDisc.length; j++){
            for (int i =0; i<aluno.notasDisc[j].length; i++){
                System.out.println("Insira a nota " + (i+1) + " da disciplina " + aluno.disciplina[j] + ": ");
                aluno.notasDisc[j][i] = scanner.nextInt();
            }
        }

        aluno.mostrarInfos();
        System.out.println("");

            for (int i=0; i<aluno.notasDisc.length; i++){
                if (aluno.verificarAprovacao(i)){
                    System.out.println("Situação em " + aluno.disciplina[i] + ": APROVADO.");
                } else {
                    System.out.println("Situação em " + aluno.disciplina[i] + ": REPROVADO.");
                }
            }


        /*System.out.println("Buscar matrículas");
        System.out.println("Digite o número de matrícula do aluno");
        int mat = scanner.nextInt();*/










    }
}
