package exercicios_aulas14e15;

import java.util.Scanner;

public class Exercicio4a {
//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String letra;

        System.out.println("VOGAL OU CONSOANTE?");
        System.out.println("Digite uma letra: ");
        letra = scan.next();

        boolean isItLetter  = Character.isLetter(letra.charAt(0));

        if ( isItLetter && (letra.length() == 1)) {
            if ( letra.equalsIgnoreCase("a") ||
                 letra.equalsIgnoreCase("e") ||
                 letra.equalsIgnoreCase("i") ||
                 letra.equalsIgnoreCase("o") ||
                 letra.equalsIgnoreCase("u")){
                        System.out.println(letra + " - VOGAL");

            } else {
                    System.out.println(letra + " - CONSOANTE");
            }
        } else {
            System.out.println("Valor digitado não é uma letra.");
        }
    }
}
