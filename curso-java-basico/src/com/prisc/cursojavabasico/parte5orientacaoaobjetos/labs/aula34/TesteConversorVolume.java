package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula34;

public class TesteConversorVolume {

    public static void main(String[] args) {

        double a = ConversorUnidadeVolume.conLitroEmCm3(100);
        double b = ConversorUnidadeVolume.conGalAmEmPol3(100);
        double c = ConversorUnidadeVolume.conM3EmPe3(100);
        double d = ConversorUnidadeVolume.conGalAmEmLitro(100);
        double e = ConversorUnidadeVolume.conM3EmLitro(100);

        System.out.println("100 L = " + a + " Cm³");
        System.out.println("100 Galões Americanos = " + b + " Polegadas³");
        System.out.println("100 M³ = " + c + " Pé³");
        System.out.println("100 Galões Americanos = " + d + " Litros");
        System.out.println("100 M³ = " + e + " Litros");

    }
}
