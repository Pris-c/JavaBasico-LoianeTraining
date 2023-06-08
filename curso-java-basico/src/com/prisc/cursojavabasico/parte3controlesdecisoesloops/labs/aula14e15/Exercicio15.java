package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula14e15;

import java.util.Scanner;

public class Exercicio15 {
/*
Faça um Programa que peça os 3 lados de um triângulo. O programa
deverá informar se os valores podem ser um triângulo. Indique, caso
os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
escaleno.
o Dicas:
o Três lados formam um triângulo quando a soma de quaisquer
dois lados for maior que o terceiro;
o Triângulo Equilátero: três lados iguais;
o Triângulo Isósceles: quaisquer dois lados iguais;
o Triângulo Escaleno: três lados diferentes;
 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double l1, l2, l3;

        System.out.println("TRIANGULO");
        System.out.print("Digite o valor do primeiro lado: ");
        l1 = scanner.nextDouble();
        System.out.print("Digite o valor do segundo lado: ");
        l2 = scanner.nextDouble();
        System.out.print("Digite o valor do terceiro lado: ");
        l3 = scanner.nextDouble();

        if( ((l1 + l2) > l3) &&
            ((l2 + l3) > l1) &&
            ((l3 + l1) > l2) ) {

                if ( (l1 == l2) && (l2 == l3)  ){
                    System.out.println("Triangulo Equilátero");
                } else if ( (l1 == l2) || (l2 == l3) ||(l1 == l3) ) {
                    System.out.println("Triangulo Isósceles");
                } else {
                    System.out.println("Triangulo Escaleno");
                }

        } else {
            System.out.println("As dimensões digitadas não formam um triângulo");
        }

    }
}
