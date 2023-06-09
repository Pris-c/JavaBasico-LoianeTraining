package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula28a33;

import java.util.Scanner;

public class JogoDaVelhaEx4 {


    private String[][] jogo = new String[3][3];
    private int conJogadas;
    private boolean fimDeJogo;

    public boolean isFimDeJogo() {
        return fimDeJogo;
    }

    public void setFimDeJogo(boolean fimDeJogo) {
        this.fimDeJogo = fimDeJogo;
    }



    public void JogoDaVelhaEx4(){
        //this.jogo = new String[3][3];   //não funcionou
        //montarTabuleiro();              //não funcionou
        this.conJogadas = 0;
    }



    public String[][] getJogo() {
        return jogo;
    }

    public void setJogo(String[][] jogo) {
        this.jogo = jogo;
    }

    public String getJogoPosicao(int i, int j){
        return this.jogo[i][j];
    }

    public void setJogoPosicao(int i, int j, String jogada){
        this.jogo[i][j] = jogada;
        //System.out.println("jogo [" + i+"]["+j+"] = " + jogada);
    }

    public int getConJogadas() {
        return conJogadas;
    }

    public void setConJogadas(int conJogadas) {
        this.conJogadas = conJogadas;
    }




    public void montarTabuleiro(){
        int n = 1;
        for (int i = 0; i < getJogo().length; i++){
            for (int j=0; j< getJogo()[i].length; j++){
                setJogoPosicao(i, j, Integer.toString(n));
                n++;
            }
        }
    }

    public void exibirTabuleiro(){
        System.out.println("\t" + getJogoPosicao(0,0) + "\t|\t" + getJogoPosicao(0,1) + "\t|\t" + getJogoPosicao(0,2));
        System.out.println("\t" + getJogoPosicao(1,0) + "\t|\t" + getJogoPosicao(1,1) + "\t|\t" + getJogoPosicao(1,2));
        System.out.println("\t" + getJogoPosicao(2,0) + "\t|\t" + getJogoPosicao(2,1) + "\t|\t" + getJogoPosicao(2,2));
        System.out.println();
    }

    public int definirJogador() {
        int jogador;
        if (getConJogadas() % 2 == 0) {
            jogador = 1;
        } else {
            jogador = 2;
        }
        return jogador;
    }

    private boolean verificarEmpate() {
        boolean empate = false;
        if (conJogadas == 9) {
            System.out.println("\tO JOGO ACABOU SEM VENCEDOR.");
            empate = true;
        }
        return empate;
    }

    private boolean verificarVencedor(){
        boolean vencedor = false;
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
            System.out.println("\nFIM DE JOGO: JOGADOR " + (definirJogador()-1) + " VENCEU!");
            vencedor = true;

        }
        return vencedor;
    }

    public boolean verificarFimDeJogo(){
        if (verificarEmpate() || verificarVencedor()){
            fimDeJogo = true;
        }
        return fimDeJogo;
    }


    private int[] definirJogada(int jogada){
        int[] posicao =  new int[3];

        switch (jogada){
            //posicao X, posicao Y, valor padrao.
            case 1: posicao[0] = 0; posicao[1] = 0; posicao[2] = 1; break;
            case 2: posicao[0] = 0; posicao[1] = 1; posicao[2] = 2; break;
            case 3: posicao[0] = 0; posicao[1] = 2; posicao[2] = 3; break;
            case 4: posicao[0] = 1; posicao[1] = 0; posicao[2] = 4; break;
            case 5: posicao[0] = 1; posicao[1] = 1; posicao[2] = 5; break;
            case 6: posicao[0] = 1; posicao[1] = 2; posicao[2] = 6; break;
            case 7: posicao[0] = 2; posicao[1] = 0; posicao[2] = 7; break;
            case 8: posicao[0] = 2; posicao[1] = 1; posicao[2] = 8; break;
            case 9: posicao[0] = 2; posicao[1] = 2; posicao[2] = 9; break;
        }
        return posicao;
    }

    private void marcarJogo(int jogador, int X,int Y){
        String sinal;
        if (jogador==1){
            sinal = "X";
        } else {
            sinal = "O";
        }
        setJogoPosicao(X, Y, sinal);
        //System.out.println("\n\n");
    }

    public void executarJogada(int jogada){
        int jogador = definirJogador();

        int posicao[] = definirJogada(jogada);
        int posX = posicao[0];
        int posY = posicao[1];
        String valorPadrao = Integer.toString(posicao[2]);

        if (getJogoPosicao(posX, posY).equals(valorPadrao)){
            marcarJogo(jogador, posX, posY);
            setConJogadas(getConJogadas()+1);
            System.out.println();
            exibirTabuleiro();
        } else {
            System.out.println("\n\n\tJOGADA INVÁLIDA.\n");
            exibirTabuleiro();
        }


    }

}
