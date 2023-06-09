package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula28a33;

public class LampadaEx1 {
/*Reescreva os seguintes exercícios, criando todos os  tributos do tipo privado, métodos getters
e setters e construtores. Os métodos que serão utilizados pela classe de teste devem ser públicos.
Se necessário, crie métodos privados como auxiliares para organizar melhor o código fonte também.*/

/*Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar, desligar a lampada.*/


    private String marca;
    private String modelo;
    private String tipoLuz;
    private String cor;
    private int potencia;
    private int tensao;
    private int tempoGarantia;
    private double preco;
    private boolean ligada;


    public void ligar(){
        setLigada(true);
    }

    public void desligar(){
        setLigada(false);
    }

    public boolean estaLigada(){
      return ligada;
    }
    public void mostrarEstado(){
        if(estaLigada()){
            System.out.println("A lâmpada está ligada");
        } else {
            System.out.println("A lâmpadas está desligada.");
        }
    }

    public void mudarEstado(){
        if (estaLigada()){
            desligar();
        } else {
            ligar();
        }
    }

    public LampadaEx1(){}

    public LampadaEx1(String marca, String modelo, String tipoLuz, String cor, int potencia, int tensao, int tempoGarantia, double preco, boolean ligada) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoLuz = tipoLuz;
        this.cor = cor;
        this.potencia = potencia;
        this.tensao = tensao;
        this.tempoGarantia = tempoGarantia;
        this.preco = preco;
        this.ligada = ligada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getTensao() {
        return tensao;
    }

    public void setTensao(int tensao) {
        this.tensao = tensao;
    }

    public int getTempoGarantia() {
        return tempoGarantia;
    }

    public void setTempoGarantia(int tempoGarantia) {
        this.tempoGarantia = tempoGarantia;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
}
