package aula19;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio9 {
    /*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a divisão dos respectivos
elementos em A e B, ou seja:*/

    public static void main(String[] args) {

        double[] A = new double[10];
        int[] B = new int[A.length];
        double[] C = new double[B.length];
        double max = 10;
        double min = 0;

        Random random = new Random();

        for (int i =0; i < A.length; i++){
            B[i] = random.nextInt(10);
            A[i] = random.nextInt(10);

            C[i] = A[i] / B[i];
        }

        //  .## número de casas decimais
        DecimalFormat df = new DecimalFormat("##,##.##");

            System.out.print("A = ");
            for (int i =0; i < A.length; i++){
                System.out.print(A[i] + " ");
            }

            System.out.print("\nB = ");
            for (int i =0; i < A.length; i++){
                System.out.print(B[i] + " ");
            }
            System.out.print("\nC = ");
            for (int i =0; i < A.length; i++) {
                System.out.print(df.format(C[i]) + " ");
            }

    }


}
