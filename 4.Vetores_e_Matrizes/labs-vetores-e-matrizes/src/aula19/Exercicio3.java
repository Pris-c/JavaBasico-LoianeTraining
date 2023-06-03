package aula19;

public class Exercicio3 {
/*Criar um vetor A com 7 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o quadrado do respectivo elemento de A, ou seja:
B[i] = A[i] * A[I].*/


    public static void main(String[] args) {

        int[] A = new int[7];
        int[] B = new int[A.length];

        A[0] = 9;
        A[1] = 8;
        A[2] = 7;
        A[3] = 6;
        A[4] = 5;
        A[5] = 4;
        A[6] = 3;

        for (int i =0; i < A.length; i++){
            B[i] = A[i] * A[i];
        }

        System.out.print("A = ");
        for (int i =0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }

        System.out.print("\nB = ");
        for (int i =0; i < A.length; i++){
            System.out.print(B[i] + " ");
        }





    }




}
