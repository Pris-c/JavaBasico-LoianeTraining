package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.aula41;

public class Teste {

    public static void main(String[] args) {

       // Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

       // pessoa.setEndereco("Rua 1, nº1");
        aluno.setEndereco("Rua 2, nº2");
        professor.setEndereco("Rua 3, nº3");

        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();

    }
}
