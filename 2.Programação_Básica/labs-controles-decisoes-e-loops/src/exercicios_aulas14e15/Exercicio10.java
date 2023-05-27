package exercicios_aulas14e15;

import java.util.Scanner;

public class Exercicio10 {
/*
Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso.
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char turno;
        boolean isItLetter = false;

        System.out.println("Em qual turno você estuda?");
        System.out.println("(M) matutino - (V) vespertino - (N) noturno");
        turno = scan.next().charAt(0);

        //Como pegar excessao se digitar numero?
       isItLetter = Character.isLetter(turno);

        if (isItLetter) {
            switch (turno) {
                case 'M':
                case 'm':
                    System.out.println("Bom dia");
                    break;
                case 'V':
                case 'v':
                    System.out.println("Boa tarde");
                    break;
                case 'N':
                case 'n':
                    System.out.println("Boa noite");
                    break;
                default:
                    System.out.println("\'" + turno + "\'" + " não é um valor válido.");
            }

        } else {
            System.out.println("\'" + turno + "\'" + " não é um valor válido.");
        }
    }

}
