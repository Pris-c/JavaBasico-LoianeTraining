package aula19;

import java.text.DecimalFormat;

public class Exercicio15 {
    /*Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que defina o percentual de elementos pares e ímpares,
respectivamente, armazenados neste vetor.*/

    public static void main(String[] args) {

        int[] arrayInt = new int[10];
        double contEven = 0;
        double contOdd = 0;
        double fEven = 0;
        double fOdd = 0;

        arrayInt[0] = 9;
        arrayInt[1] = 7;
        arrayInt[2] = 7;
        arrayInt[3] = 3;
        arrayInt[4] = 4;
        arrayInt[5] = 3;
        arrayInt[6] = 7;
        arrayInt[7] = 2;
        arrayInt[8] = 10;
        arrayInt[9] = 0;

        for (int num:
             arrayInt) {
            if ( (num%2) == 0){
                contEven++;
            }else {
                contOdd++;
            }
        }

        fEven = contEven / arrayInt.length;
        fOdd = contOdd / arrayInt.length;

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.println("Impares = " + df.format(fOdd));
        System.out.println("Pares = " + df.format(fEven));

    }
}
