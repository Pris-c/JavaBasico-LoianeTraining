package aula20;

public class Exercicio2 {
    /*Gere e imprima uma matriz M 10x10 com valores aleatórios entre
0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
qual é o maior e o menor valor da coluna 7.*/

    public static void main(String[] args) {

        int[][] matriz = new int[10][10];

        int maiorL5 = 0;
        int menorL5 = 0;
        int maiorC7 = 0;
        int menorC7 = 0;
        int n = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) Math.round(Math.random() * 100);

                n = matriz[i][j];

                if (i == 5) {
                    if (j == 0) {
                        maiorL5 = n;
                        menorL5 = n;
                    } else if (n > maiorL5) {
                        maiorL5 = n;
                    } else if ((n < menorL5)) {
                        menorL5 = n;
                    }
                }
                if (j == 7) {
                    if (i == 0) {
                        maiorC7 = n;
                        menorC7 = n;
                    } else if (n > maiorC7) {
                        maiorC7 = n;
                    } else if ((n < menorC7)) {
                        menorC7 = n;
                    }
                }

            }
        }

        for (int i = 0; i < matriz.length; i++){
            System.out.println("");
            for (int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + " - ");
            }
        }

        System.out.println("");
        System.out.println("Linha 5: Maior = " + maiorL5 + "; Menor = " + menorL5);
        System.out.println("Coluna 7: Maior = " + maiorC7 + "; Menor = " + menorC7);
    }
}
