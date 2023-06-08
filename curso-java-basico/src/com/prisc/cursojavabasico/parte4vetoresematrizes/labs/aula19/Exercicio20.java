package com.prisc.cursojavabasico.parte4vetoresematrizes.labs.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio20 {
    /*Implementar um programa que obtenha a cotação do dólar (U$) em
relação ao real (R$) e a seguir armazene em vetor A com 20
elementos as seguintes conversões:
A[i] = cotação do dolar * i, para todo i variando de 1 até 20.*/


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] conversoes = new double[20];

        System.out.println("Cotação do dia: ");
        System.out.print("$ 1,00 = R$ : ");
        double cotacao = scanner.nextDouble();

        // ###,### Separador de milhar      .## casas decimais
        DecimalFormat df = new DecimalFormat("###,###.##");

       for (int i = 1; i <=20; i++){
           System.out.println( i + " * " + cotacao + " = " + df.format(i*cotacao));
       }
    }
}
