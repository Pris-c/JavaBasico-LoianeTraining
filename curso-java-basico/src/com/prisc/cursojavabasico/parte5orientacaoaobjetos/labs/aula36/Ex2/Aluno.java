package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula36.Ex2;

public class Aluno {
    /* Cada Aluno tem nome, matricula e 4 notas.*/


    private String nome;
    private String matricula;
    private int[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }


    /*Ao final, imprima a média de cada aluno, se o mesmo está aprovado (media maior ou igual a 7),
    e qual é a média da turma*/

    public double media(){
        double soma = 0;
        double media = 0;

        for (int i=0; i < getNotas().length; i++){
            soma += getNotas()[i];
        }
        media = soma / getNotas().length;
        return media;
    }

    public boolean aprovado(){
        if (media() >= 7){
            return true;
        }else {
            return false;
        }

    }

}
