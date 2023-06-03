package aula20;

public class Exercicio1 {
    /*Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
9. Após isso determine o maior número da matriz e a sua posição
(linha, coluna).*/

    public static void main(String[] args) {

        int[][] inteiros = new int[4][4];

        int maior =0;
        int posX = 0;
        int posY =0;

        for (int i = 0; i < inteiros.length; i++){
            for (int j=0; j<inteiros[i].length; j++){
                inteiros[i][j] = (int) Math.round(Math.random()*100);

                if ( (i==0) && (j==0) ){
                    maior = inteiros[i][j];
                    posX = i;
                    posY = j;
                } else if (inteiros[i][j] > maior){
                    maior = inteiros[i][j];
                    posX = i;
                    posY = j;
                }
            }
        }

        for (int i = 0; i < inteiros.length; i++){
            System.out.println("");
            for (int j=0; j<inteiros[i].length; j++){
                System.out.print(inteiros[i][j] + " - ");
            }

        }

        System.out.println("\nMaior valor = " + maior);
        System.out.println("Posição [" + posX + "] [" + posY + "]");


    }

}
