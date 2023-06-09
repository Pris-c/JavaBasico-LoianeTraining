package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula28a33;

public class Teste {

    public static void main(String[] args) {

        String[][] jogo = new String[3][3];

        int n = 1;
        for (int i = 0; i < jogo.length; i++){
            for (int j=0; j<jogo[i].length; j++){
                jogo[i][j] = Integer.toString(n);
                n++;
            }
        }


        System.out.println("\t" + jogo[0][0] + "\t|\t" + jogo[0][1] + "\t|\t" + jogo[0][2]);
        System.out.println();
    }
}
