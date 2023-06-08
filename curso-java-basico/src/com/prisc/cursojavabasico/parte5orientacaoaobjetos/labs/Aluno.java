package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs;

public class Aluno {
/*Escreva uma class para representar um Aluno. Adicione atributos relacionados às caracteristicas
de um Aluno,como nome, matricula, curso que está matriculado, nome de 3 disciplinas que está cursando
e as notas dessas 3 disciplinas. Desenvolva um método para verificar se o aluno está aprovado (nota
maior ou igual a 7) em uma determinada disciplina. Escreva um programa para testar essa classe, que pede
as informações  do aluno ao usuário e ao  final informa o nome das disciplinas,*/

    String nome;
    String nomeCurso;
    String[] disciplina = new String[3];
    double[][] notasDisc = new double[3][3];
    int matricula;

    double calcularMedia(int idDisciplina){
        double media = 0;
        switch (idDisciplina) {
            case 1:
                media = (notasDisc[0][0] + notasDisc[0][1] + notasDisc[0][2]) / 3;
                break;
            case 2:
                media = (notasDisc[1][0] + notasDisc[1][1] + notasDisc[2][2]) / 3;
                break;
            case 3:
                media = (notasDisc[2][0] + notasDisc[2][1] + notasDisc[2][2]) / 3;
                break;
        }
        return media;
    }

    boolean verificarAprovacao(int idDisciplina){
        boolean aprovado = false;
        double media = calcularMedia(idDisciplina);
        if (media>=7) {
            aprovado = true;
        }
        return aprovado;
    }

    void mostrarInfos(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);

        for (int i=0; i< notasDisc.length; i++){
            System.out.println("Notas da disciplina " + disciplina[i]);
            for (int j=0; j<notasDisc[i].length; j++){
                System.out.print(notasDisc[i][j] + " ");
            }
            System.out.println();
        }
    }
    void listarDisciplinas(int idDisciplina){

    }
}
