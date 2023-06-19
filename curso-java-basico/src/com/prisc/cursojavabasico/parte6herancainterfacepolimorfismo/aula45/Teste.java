package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.aula45;

public class Teste {

    public static void main(String[] args) {



    Aluno aluno = new Aluno();
    Pessoa pessoAluno = aluno;    //upcasting


    Pessoa aluno2 = (Pessoa) new Aluno();       //conversão manual - casting




    Pessoa aluno3 = new Pessoa();
    Aluno aluno4 = (Aluno) aluno3;      //downcasting manual


    }



}
