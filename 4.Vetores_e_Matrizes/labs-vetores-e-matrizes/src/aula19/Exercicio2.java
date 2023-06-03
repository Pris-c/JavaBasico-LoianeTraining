package aula19;

public class Exercicio2 {
/*Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = A[i] * 2.*/

    public static void main(String[] args) {


        int[] A = new int[8];
        int[] B = new int[A.length];

        A[0] = 9;
        A[1] = 8;
        A[2] = 7;
        A[3] = 6;
        A[4] = 5;
        A[5] = 4;
        A[6] = 3;
        A[7] = 2;

        for (int i =0; i < A.length; i++){
            B[i] = A[i] * 2;
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
