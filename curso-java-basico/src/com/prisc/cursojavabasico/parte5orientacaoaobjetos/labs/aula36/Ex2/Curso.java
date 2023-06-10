package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula36.Ex2;

public class Curso {
    /*Escreva uma classe para representar um Curso, que tem nome e horário.
    Cada curso tem um Professor, que possui nome, departamento e email.
    Cada Curso também pode ter vários alunos (tipo Aluno).
    Cada Aluno tem nome, matricula e 4 notas.
    */



    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }


    public double mediaDaTurma(){
        double soma = 0;
        double media = 0;

        for (int i =0; i < getAlunos().length; i++){
            soma += alunos[i].media();
        }

        media = soma / getAlunos().length;
        return media;
    }

}
