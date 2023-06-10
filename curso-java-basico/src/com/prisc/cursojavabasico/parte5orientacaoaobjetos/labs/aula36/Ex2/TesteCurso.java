package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula36.Ex2;

import java.util.Scanner;

public class TesteCurso {
/*Escreva um programa teste que crie um Curso com 5  alunos, e que peça para o usuário
entrar com as 4 notas de cada  aluno.
Ao final, imprima a média de cada aluno, se o mesmo está aprovado (media maior ou igual a 7),
e qual é a média da turma.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Curso curso = new Curso();
        Professor prof = new Professor();
        Aluno[] alunos = new Aluno[5];



        Aluno aluno1 = new Aluno();
        aluno1.setNome("aluno1");
        aluno1.setMatricula("100");
        alunos[0] = aluno1;

        Aluno aluno2 = new Aluno();
        aluno2.setNome("aluno2");
        aluno2.setMatricula("200");
        alunos[1] = aluno2;

        Aluno aluno3 = new Aluno();
        aluno3.setNome("aluno3");
        aluno3.setMatricula("3");
        alunos[2] = aluno3;

        Aluno aluno4 = new Aluno();
        aluno4.setNome("aluno4");
        aluno4.setMatricula("400");
        alunos[3] = aluno4;

        Aluno aluno5 = new Aluno();
        aluno5.setNome("aluno5");
        aluno5.setMatricula("500");
        alunos[4] = aluno5;





        curso.setNome("Curso Teste");

        /*peça para o usuário entrar com as 4 notas de cada  aluno*/
        for (int i = 0; i < alunos.length; i++){            //para cada aluno
            int[] notas = new int[4];

            System.out.println("Insira as notas do aluno " + alunos[i].getNome());

            for (int j = 0; j < notas.length; j++){         //para cada nota
                System.out.print((j+1) +"ª Nota: ");
                notas[j] = scan.nextInt();
            }
            alunos[i].setNotas(notas);
            //System.out.println(aluno1.getNotas()[1]);
        }

        curso.setAlunos(alunos);



        /*Ao final, imprima a média de cada aluno, se o mesmo está aprovado (media maior ou igual a 7),
        e qual é a média da turma*/

        //Media de cada aluno
        System.out.println("");
        for (Aluno a: curso.getAlunos()){
            String situacao;
            if (a.aprovado()){
                 situacao = "APROVADO";
            } else {
                situacao = "REPROVADO";
            }
            System.out.println("Aluno " + a.getNome() + ": média = " + a.media() + " Situação: " + situacao );
        }

        System.out.println("\nMédia da turma: " + curso.mediaDaTurma());









    }
}
