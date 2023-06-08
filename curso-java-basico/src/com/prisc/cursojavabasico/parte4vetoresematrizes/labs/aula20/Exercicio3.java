package com.prisc.cursojavabasico.parte4vetoresematrizes.labs.aula20;

import java.util.Scanner;

public class Exercicio3 {
/*Capture do teclado valores para preenchimento de uma matriz M
3x3. Após a captura imprima a matriz criada e encontre a
quantidade de números pares, a quantidade de números ímpares.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int n = 0;
        int contPar = 0;
        int contImp = 0;

        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                System.out.println("Insira valor [" + i + "][" + j + "]");
                matriz[i][j] = scanner.nextInt();
                n = matriz[i][j];

                if (n%2 == 0){
                    contPar++;
                } else {
                    contImp++;
                }
            }
        }
        System.out.println("\n");

        for (int i=0; i<matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                n = matriz[i][j];
                System.out.print(n + "\t");
            }
        }

        System.out.println("\n");
        System.out.println(contPar + " números pares");
        System.out.println(contImp + " números impares");



    }
}
