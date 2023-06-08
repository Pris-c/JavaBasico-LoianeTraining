package com.prisc.cursojavabasico.parte4vetoresematrizes.labs.aula20;

import java.util.Scanner;

public class Exercicio6 {
/*Faça um programa para jogar o jogo da velha. O programa deve
permitir que dois jogadores façam uma partida do jogo da velha,
usando o computador para ver o tabuleiro. Cada jogador vai
alternadamente informando a posição onde deseja colocar a sua
peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e
determinar automaticamente quando o jogo terminou e quem foi o
vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
deve atualizar a situação do tabuleiro na tela.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[][] jogo = new String[3][3];

        jogo[0][0] = "1";
        jogo[0][1] = "2";
        jogo[0][2] = "3";
        jogo[1][0] = "4";
        jogo[1][1] = "5";
        jogo[1][2] = "6";
        jogo[2][0] = "7";
        jogo[2][1] = "8";
        jogo[2][2] = "9";

        boolean winer = false;
        int jogador;
        int jogada = 0;
        int conJogadas = 0;
        String marcaJog = " ";


        do {

            System.out.println("\t" + jogo[0][0] + "\t|\t" + jogo[0][1] + "\t|\t" + jogo[0][2]);
            System.out.println("\t" + jogo[1][0] + "\t|\t" + jogo[1][1] + "\t|\t" + jogo[1][2]);
            System.out.println("\t" + jogo[2][0] + "\t|\t" + jogo[2][1] + "\t|\t" + jogo[2][2]);

            if (conJogadas % 2 == 0) {
                jogador = 1;
                marcaJog = "X";
            } else {
                jogador = 2;
                marcaJog = "O";
            }

            System.out.println("\nJOGADOR " + jogador);
            System.out.print("Escolha a posição da sua jogada: ");
            jogada = scanner.nextInt();

            switch (jogada) {
                case 1:
                    if (!jogo[0][0].equals("1")) {
                        System.out.println("\n\nJogada inválida.");
                        break;
                    } else {
                        jogo[0][0] = marcaJog;
                        conJogadas++;
                        System.out.println("\n\n");
                    }
                    break;
                case 2:
                    if (!((jogo[0][1]).equals("2"))) {
                        System.out.println("\n\nJogada inválida.");
                        break;
                    } else {
                        jogo[0][1] = marcaJog;
                        conJogadas++;
                        System.out.println("\n\n");
                        break;

                    }
                case 3:
                    if (!jogo[0][2].equals("3")) {
                        System.out.println("\n\nJogada inválida.");
                        break;
                    } else {
                        jogo[0][2] = marcaJog;
                        conJogadas++;
                        System.out.println("\n\n");
                    }
                    break;
                case 4:
                    if (!jogo[1][0].equals("4")) {
                        System.out.println("\n\nJogada inválida.");
                        break;
                    } else {
                        jogo[1][0] = marcaJog;
                        conJogadas++;
                        System.out.println("\n\n");
                    }
                    break;
                case 5:
                    if (!jogo[1][1].equals("5")) {
                        System.out.println("\n\nJogada inválida.");
                        break;
                    } else {
                        jogo[1][1] = marcaJog;
                        conJogadas++;
                        System.out.println("\n\n");
                    }
                    break;
                case 6:
                    if (!jogo[1][2].equals("6")) {
                        System.out.println("\n\nJogada inválida.");
                        break;
                    } else {
                        jogo[1][2] = marcaJog;
                        conJogadas++;
                        System.out.println("\n\n");
                    }
                    break;
                case 7:
                    if (!jogo[2][0].equals("7")) {
                        System.out.println("\n\nJogada inválida.");
                        break;
                    } else {
                        jogo[2][0] = marcaJog;
                        conJogadas++;
                        System.out.println("\n\n");
                    }
                    break;
                case 8:
                    if (!jogo[2][1].equals("8")) {
                        System.out.println("\n\nJogada inválida.");
                        break;
                    } else {
                        jogo[2][1] = marcaJog;
                        conJogadas++;
                        System.out.println("\n\n");
                    }
                    break;
                case 9:
                    if (!jogo[2][2].equals("9")) {
                        System.out.println("\n\nJogada inválida.");
                        break;
                    } else {
                        jogo[2][2] = marcaJog;
                        conJogadas++;
                        System.out.println("\n\n");
                    }
                    break;
                default:
                    System.out.println("\n\nJogada inválida");
            }

            //ANALISAR FIM DO JOGO
            if (conJogadas == 9){
                System.out.println("\nO JOGO ACABOU SEM VENCEDOR!");
                break;
            } else if (
                (jogo[0][0].equalsIgnoreCase(jogo[0][1] ) && jogo[0][0].equalsIgnoreCase(jogo[0][2])) ||
                (jogo[1][0].equalsIgnoreCase(jogo[1][1] ) && jogo[1][0].equalsIgnoreCase(jogo[1][2])) ||
                (jogo[2][0].equalsIgnoreCase(jogo[2][1] ) && jogo[2][0].equalsIgnoreCase(jogo[2][2])) ||

                (jogo[0][0].equalsIgnoreCase(jogo[1][0] ) && jogo[0][0].equalsIgnoreCase(jogo[2][0])) ||
                (jogo[0][1].equalsIgnoreCase(jogo[1][1] ) && jogo[0][1].equalsIgnoreCase(jogo[2][1])) ||
                (jogo[0][2].equalsIgnoreCase(jogo[1][2] ) && jogo[0][2].equalsIgnoreCase(jogo[2][2])) ||

                (jogo[0][0].equalsIgnoreCase(jogo[1][1] ) && jogo[0][0].equalsIgnoreCase(jogo[2][2])) ||
                (jogo[0][2].equalsIgnoreCase(jogo[1][1] ) && jogo[0][2].equalsIgnoreCase(jogo[2][0]))
            ) {
                System.out.println("\t"+jogo[0][0]+"\t|\t"+jogo[0][1]+"\t|\t"+jogo[0][2]);
                System.out.println("\t"+jogo[1][0]+"\t|\t"+jogo[1][1]+"\t|\t"+jogo[1][2]);
                System.out.println("\t"+jogo[2][0]+"\t|\t"+jogo[2][1]+"\t|\t"+jogo[2][2]);
                winer = true;
                System.out.println("\n\tJOGADOR " + jogador + " VENCEU!");
            }

        } while ( (!winer) || (conJogadas==9) );

    }
}
