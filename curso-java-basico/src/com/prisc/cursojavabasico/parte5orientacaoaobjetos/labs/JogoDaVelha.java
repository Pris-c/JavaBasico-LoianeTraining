package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs;

import java.util.Scanner;

public class JogoDaVelha {
/*Reescreva  o exercício 6 da aula 20 (Jogo da Velha).
Desenvolva uma classe para representar o Jogo da Velha.
Desenvolva uma classe para testar o Jogo.*/

    Scanner scanner = new Scanner("System.in");
    String[][] jogo = new String[3][3];
    int conJogadas;
    boolean vencedor;
    boolean empate;

    int jogador;
    int jogada = 0;
    String marcaJog = " ";

    void montarTabuleiro(){
        empate = false;
        vencedor = false;
        conJogadas = 0;
        int n = 1;


        for (int i = 0; i < jogo.length; i++){
            for (int j=0; j<jogo[i].length; j++){
                jogo[i][j] = Integer.toString(n);
                n++;
            }
        }
   }
   void exibirTabuleiro(){
       System.out.println("\t" + jogo[0][0] + "\t|\t" + jogo[0][1] + "\t|\t" + jogo[0][2]);
       System.out.println("\t" + jogo[1][0] + "\t|\t" + jogo[1][1] + "\t|\t" + jogo[1][2]);
       System.out.println("\t" + jogo[2][0] + "\t|\t" + jogo[2][1] + "\t|\t" + jogo[2][2]);
   }

   int definirJogador() {
       if (conJogadas % 2 == 0) {
           jogador = 1;
           marcaJog = "X";
       } else {
           jogador = 2;
           marcaJog = "O";
       }
       return jogador;
   }
 /*  void definirMarca(int jogador) {
        switch (jogador) {
            case 1:
                marcaJog = "X";
                break;
            case 2:
                marcaJog = "O";
                break;
        }
   }*/

        void executarJogada(int jogada){
        definirJogador();

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
    }

    boolean verificarEmpate() {
        if (conJogadas == 9) {
            exibirTabuleiro();
            System.out.println("\tO JOGO ACABOU SEM VENCEDOR.");
            empate = true;
        }
        return empate;
    }

    boolean verificarVencedor(){
        if (
                (jogo[0][0].equalsIgnoreCase(jogo[0][1] ) && jogo[0][0].equalsIgnoreCase(jogo[0][2])) ||
                (jogo[1][0].equalsIgnoreCase(jogo[1][1] ) && jogo[1][0].equalsIgnoreCase(jogo[1][2])) ||
                (jogo[2][0].equalsIgnoreCase(jogo[2][1] ) && jogo[2][0].equalsIgnoreCase(jogo[2][2])) ||

                (jogo[0][0].equalsIgnoreCase(jogo[1][0] ) && jogo[0][0].equalsIgnoreCase(jogo[2][0])) ||
                (jogo[0][1].equalsIgnoreCase(jogo[1][1] ) && jogo[0][1].equalsIgnoreCase(jogo[2][1])) ||
                (jogo[0][2].equalsIgnoreCase(jogo[1][2] ) && jogo[0][2].equalsIgnoreCase(jogo[2][2])) ||

                (jogo[0][0].equalsIgnoreCase(jogo[1][1] ) && jogo[0][0].equalsIgnoreCase(jogo[2][2])) ||
                (jogo[0][2].equalsIgnoreCase(jogo[1][1] ) && jogo[0][2].equalsIgnoreCase(jogo[2][0]))
            ) {
            exibirTabuleiro();
            System.out.println("\nFIM DE JOGO: JOGADOR " + jogador + " VENCEU!");
            vencedor = true;

        }
        return vencedor;
    }


}
