package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula28a33;

import java.util.Scanner;

public class TesteJogoDaVelhaEx4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        JogoDaVelhaEx4 jogo = new JogoDaVelhaEx4();

       jogo.montarTabuleiro();
        jogo.exibirTabuleiro();

        do {
            System.out.println("\nJOGADOR " + jogo.definirJogador());
            System.out.print("Escolha a posição da sua jogada: ");
            int jogada = scan.nextInt();

            jogo.executarJogada(jogada);
            jogo.verificarFimDeJogo();


        } while (!jogo.isFimDeJogo());


    }
}
