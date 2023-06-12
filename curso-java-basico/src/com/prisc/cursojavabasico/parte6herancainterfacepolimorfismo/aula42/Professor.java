package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.aula42;

public class Professor {


    private double salario;
    private String nomeCurso;

   /* public Professor(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }*/

    public Professor() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiq(){
        return 0;
    }


    public String obterEtiquedaEndereco(){
        String s = "Endereço do professor: ";
        //s += this.getEndereco();
        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {
    System.out.println("Imprimindo endereço professor");
        System.out.println(this.obterEtiquedaEndereco());
    }
}
