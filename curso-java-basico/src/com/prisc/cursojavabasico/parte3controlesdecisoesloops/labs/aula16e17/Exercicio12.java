package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio12 {
/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
numero ele deseja ver a tabuada. A saída deve ser conforme o
exemplo abaixo:
o Tabuada de 5:
o 5 X 1 = 5
o 5 X 2 = 10
o ...
o 5 X 10 = 50
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("TABUADA");
        System.out.println("Quero ver a tabuada do numero: ");
        int n = scanner.nextInt();

        for (int i = 0; i <=10; i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }



    }
}
