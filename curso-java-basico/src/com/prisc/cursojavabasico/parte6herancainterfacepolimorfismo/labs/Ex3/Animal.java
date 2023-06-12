package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.Ex3;

public class Animal {


    private String nome;
    private double comprimento;
    private int nPatas;
    private String cor;
    private String ambiente;
    private double velocidade;


    public Animal() {
        this.nPatas = 4;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getnPatas() {
        return nPatas;
    }

    public void setnPatas(int nPatas) {
        this.nPatas = nPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }


    @Override
    public String toString() {
        return "-----------------" + '\n' +
                "Animal: " + nome + '\n' +
                "Comprimento: " + comprimento + '\n' +
                "Patas: " + nPatas + '\n' +
                "Cor: " + cor + '\n' +
                "Ambiente: " + ambiente + '\n' +
                "Velocidade: " + velocidade + " m/s";
    }
}
