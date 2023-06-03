package aula19;

public class Exercicio6 {
    /*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a soma dos respectivos
elementos em A e B, ou seja:
C[i] = A[i] + B[i].*/


    public static void main(String[] args) {

        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[A.length];

        for (int i =0; i < A.length; i++){
            B[i] = i + (50 % (i+2));
            A[i] = 3 + i;

            C[i] = A[i] + B[i];
        }

        System.out.print("A = ");
        for (int i =0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }

        System.out.print("\nB = ");
        for (int i =0; i < A.length; i++){
            System.out.print(B[i] + " ");
        }
        System.out.print("\nC = ");
        for (int i =0; i < A.length; i++){
            System.out.print(C[i] + " ");
        }

    }
}
