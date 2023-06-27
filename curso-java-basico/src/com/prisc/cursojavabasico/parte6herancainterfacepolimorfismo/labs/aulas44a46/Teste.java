package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas44a46;

public class Teste {
    public static void main(String[] args) {

        Figura2D circulo = new Circulo("circulo", "verde", 5);
        Quadrado quadrado = new Quadrado("quadrado", "verde", 5);
        Triangulo triangulo = new Triangulo("triangulo", "verde", 10, 8);

        Cubo cubo = new Cubo("cubo", "vermelho", 4);
        Cilindro cilindro = new Cilindro("cilindro", "vermelho", 5, 10);
        Piramide piramide = new Piramide("piramide", "vermelho", quadrado.calcularArea(), 10);

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = circulo;
        figuras[1] = quadrado;
        figuras[2] = triangulo;
        figuras[3] = cubo;
        figuras[4] = cilindro;
        figuras[5] = piramide;

        for (FiguraGeometrica f: figuras){
            System.out.println("---------------");

            if (f instanceof Figura2D){
                Figura2D f2d = (Figura2D) f;
                System.out.println("Área do " + f.getNome() + " = " + f2d.calcularArea());
            } else {
                Figura3D f3d = (Figura3D) f;
                System.out.println("Área do " + f.getNome() + " = " + f3d.calcularArea());
                System.out.println("Volume do " + f.getNome() + " = " + f3d.calcularVolume());
            }


        }



    }
}
