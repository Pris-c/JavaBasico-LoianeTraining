package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.aula39.TesteAcesso;

import com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.aula39.Pessoa;

public class Aluno extends Pessoa {


    private String curso;
    private double notas[];

    public Aluno() {
        super();            //seta construtor da classe mãe: Pessoa
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
    }




    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }




    public double calcularMedia(){
        return 0;
    }

    public boolean verificarAprovado(){
        return true;
    }


    public void umMetodoQualquer(){
        super.setCpf("100100100-01");
        this.curso = "Cursinho";
    }


    public void verificarAcesso(){
        //public
        super.nomePublico = " ";
        this.nomePublico = "";
        //protected
        this.nomeProtegido = "";
        super.nomeProtegido = "";
    }




}

