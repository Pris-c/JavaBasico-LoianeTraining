package aula19;

import java.util.Random;

public class Exercicio32 {
/*Criar um vetor A com 5 elementos inteiros. Escreva um programa que
imprima a tabuada de cada um dos elementos do vetor A.*/

    public static void main(String[] args) {

        int[] A = new int[20];
        Random random = new Random();

        System.out.print("A = ");
        for (int i = 0; i<5; i++){
            A[i] = random.nextInt(10);
            System.out.print(A[i] + ", ");
        }

        System.out.println("\n----------------");
        for(int j=0; j<5; j++){
            for (int t = 1; t<=10; t++){
                System.out.println(A[j] + " * " + t + " = " + (A[j]*t));
            }
            System.out.println("------------------");
        }




    }
}
