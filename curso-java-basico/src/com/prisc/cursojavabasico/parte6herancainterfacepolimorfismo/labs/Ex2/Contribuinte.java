package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.Ex2;

public class Contribuinte {

    private String nome;


    protected double calcularImposto(double rendaBruta){
        return 0;
    }

    protected void mostrarImposto(double rendaBruta){
        System.out.println("Imposto de " + this.nome + " = R$ " + calcularImposto(rendaBruta));
    }


    public Contribuinte() {
    }

    public Contribuinte(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Contribuinte{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
