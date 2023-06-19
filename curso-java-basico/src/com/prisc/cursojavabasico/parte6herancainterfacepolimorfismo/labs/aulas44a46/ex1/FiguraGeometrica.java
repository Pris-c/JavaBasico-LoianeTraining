package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas44a46.ex1;

public abstract class FiguraGeometrica {
    /*Escreva uma classe FiguraGeometrica com atributos  nome e cor. Escreva uma classe Figura2D e uma classe Figura3D.
Ambas classes Figura2D e Figura3D são subclasses da classe FiguraGeometrica. Crie ainda as classes Circulo, Quadrado e
Triangulo que estendem a classe Figura2D e crie também as classes Cubo e Cilindro e Piramide que estendem a classe Figura3D.*/


    private String nome;
    private String cor;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
