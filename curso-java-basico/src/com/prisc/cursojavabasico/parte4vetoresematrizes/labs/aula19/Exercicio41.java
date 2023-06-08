package com.prisc.cursojavabasico.parte4vetoresematrizes.labs.aula19;

import java.util.Scanner;

public class Exercicio41 {
/*Ler 10 elementos inteiros em um vetor A. Montar uma rotina de busca,
para pesquisar se um dado elemento X está armazenado em A.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];

        boolean contem = false;

        System.out.print("A = ");
        for (int i = 0; i < A.length; i++) {
            A[i] = i*5;
            System.out.print(A[i] + " - ");
        }

        System.out.println("");
        System.out.print("Digite o numero que deseja buscar: ");
        int n = scanner.nextInt();

        for (int a: A) {
            if (n == a){
                contem = true;
                break;
            }
        }

        if (contem){
            System.out.println(n + " está contido em A[].");
        } else {
            System.out.println("A[] não contém " + n);
        }

    }
}
