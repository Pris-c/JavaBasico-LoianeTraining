package exercicios_aulas14e15;

import java.util.Scanner;

import static java.lang.System.exit;

public class Exercicio17 {
/*
Faça um Programa que peça um número correspondente a um
determinado ano e em seguida informe se este ano é ou não bissexto.

Anos bissextos são múltiplos de 4,
não múltiplos de 100 (1900 não é bissexto)
e múltiplos de 400 (2000 é bissexto).
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int ano;

        System.out.println("ESSE ANO É BISSEXTO?");
        System.out.print("Digite o ano: ");
        ano = scan.nextInt();

        if(ano>0) {
            if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)) {
                System.out.println("Sim! Esse é um ano bissexto!");
            } else {
                System.out.println("Não, esse não é um ano bissexto.");
            }
        } else {
            System.out.println("Esse não é um ano válido");
        }

    }

}


