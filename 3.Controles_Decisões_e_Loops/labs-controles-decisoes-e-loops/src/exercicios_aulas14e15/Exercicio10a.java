package exercicios_aulas14e15;

import java.util.Scanner;

import static java.lang.System.exit;

public class Exercicio10a {
/*
Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso.
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String turno;
        boolean isItLetter = false;

        System.out.println("Em qual turno você estuda?");
        System.out.println("(M) matutino - (V) vespertino - (N) noturno");
        turno = scan.next();

        //Como pegar excessao se digitar numero?
        isItLetter = Character.isLetter(turno.charAt(0));

        if (isItLetter) {

            if (turno.equalsIgnoreCase("M")) {
                System.out.println("Bom dia!");
            } else if (turno.equalsIgnoreCase("V")) {
                System.out.println("Boa tarde!");
            } else if (turno.equalsIgnoreCase("N")) {
                System.out.println("Boa noite!");
            } else {
                System.out.println("Valor inválido.");
            }
        } else {
            System.out.println("Valor inválido.");
        }
    }

}
