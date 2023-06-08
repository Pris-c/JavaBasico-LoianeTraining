package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula14e15;

import java.util.Scanner;

public class Exercicio4 {
//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char letra;

        System.out.println("VOGAL OU CONSOANTE?");
        System.out.println("Digite uma letra: ");
        letra = scan.next().charAt(0);

        boolean isItLetter = Character.isLetter(letra);
        if (isItLetter) {

            switch (letra) {
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                    System.out.println(letra + " - VOGAL");
                    break;
                default:
                    System.out.println(letra + " - CONSOANTE");
            }
        } else {
            System.out.println("Caracter inválido.");
        }
    }
}
