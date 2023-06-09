package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula25a27;

import java.util.Scanner;

public class TesteJogoDaVelha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();
        boolean empate;
        boolean vencedor;


        jogo.montarTabuleiro();


        do {
            jogo.exibirTabuleiro();
            int jogador = jogo.definirJogador();

            System.out.println("\nJOGADOR " + jogador);
            System.out.print("Escolha a posição da sua jogada: ");
            int jogada = scanner.nextInt();

            jogo.executarJogada(jogada);

            empate = jogo.verificarEmpate();
            if (empate){
                break;
            }
            vencedor = jogo.verificarVencedor();


        } while (!empate && !vencedor);

        

    }
}
