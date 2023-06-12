package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {


    private String curso;
    private double notas[];

/*    public Aluno() {
        super();            //seta construtor da classe mãe: Pessoa
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
    }*/




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
        //super.setCpf("100100100-01");
        this.curso = "Cursinho";
    }


    public String obterEtiquedaEndereco(){
        String s = "Endereço do aluno: ";
        //s += this.getEndereco();
        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquedaEndereco());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(curso, aluno.curso) && Arrays.equals(notas, aluno.notas);
    }

   /* @Override
    public int hashCode() {
        int result = Objects.hash(curso);
        result = 31 * result + Arrays.hashCode(notas);
        return result;
    }*/
}

