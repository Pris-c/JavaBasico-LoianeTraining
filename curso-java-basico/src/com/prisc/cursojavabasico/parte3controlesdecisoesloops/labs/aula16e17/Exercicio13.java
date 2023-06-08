package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio13 {
/*
Faça um programa que peça dois números, base e expoente, calcule e
mostre o primeiro número elevado ao segundo número. Não utilize a
função de potência da linguagem.
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int result = 1;

        System.out.println("POTENCIA");
        System.out.println("Base: ");
        int b = scanner.nextInt();
        System.out.println("Exp: ");
        int exp = scanner.nextInt();

        for (int i = 0; i < exp; i++){
            result *= b;
        }

        System.out.println("Resultado = " + result);

    }

}
