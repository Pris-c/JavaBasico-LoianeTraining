package aula19;

import java.text.DecimalFormat;

public class Exercicio4 {
/*Criar um vetor A com 7 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
raiz quadrada do respectivo elemento de A, ou seja:
B[i] = sqrt(A[i]).*/

    public static void main(String[] args) {


        int[] A = new int[7];
        double[] B = new double[A.length];

        A[0] = 9;
        A[1] = 8;
        A[2] = 7;
        A[3] = 6;
        A[4] = 5;
        A[5] = 4;
        A[6] = 3;

        for (int i =0; i < A.length; i++){
            B[i] = Math.sqrt(A[i]) ;
        }

        System.out.print("A = ");
        for (int i =0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }

        DecimalFormat df = new DecimalFormat("###,###.###");

        System.out.print("\nB = ");
        for (int i =0; i < A.length; i++){
            System.out.print(df.format(B[i]) + " ");
        }


    }
}
