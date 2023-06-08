package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio1 {
/*
Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double nota;

        do {
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scan.nextDouble();
            if ( (nota<0) || (nota>10)){
                System.out.println("Valor inválido.");
            }
        } while ((nota<0) || (nota>10));

    System.out.println("Nota: " +  nota);


    }
}
