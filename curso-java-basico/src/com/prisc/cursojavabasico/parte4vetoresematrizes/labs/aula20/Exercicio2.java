package com.prisc.cursojavabasico.parte4vetoresematrizes.labs.aula20;

public class Exercicio2 {
    /*Gere e imprima uma matriz M 10x10 com valores aleatórios entre
0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
qual é o maior e o menor valor da coluna 7.*/

    public static void main(String[] args) {

        int[][] matriz = new int[10][10];

        int maiorL5 = Integer.MIN_VALUE;
        int menorL5 = Integer.MAX_VALUE;
        int maiorC7 = Integer.MIN_VALUE;
        int menorC7 = Integer.MAX_VALUE;
        int n = 0;

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) Math.round(Math.random() * 10);

                n = matriz[i][j];

                if (i == 5) {
                    if (n > maiorL5) {
                        maiorL5 = n;
                    } else if ((n < menorL5)) {
                        menorL5 = n;
                    }
                }
                if (j == 7) {
                    if (n > maiorC7) {
                        maiorC7 = n;
                    } else if ((n < menorC7)) {
                        menorC7 = n;
                    }
                }
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(" ");
        }

        System.out.println("");
        System.out.println("Linha 5: Maior = " + maiorL5 + "; Menor = " + menorL5);
        System.out.println("Coluna 7: Maior = " + maiorC7 + "; Menor = " + menorC7);
    }
}
