package aula19;

public class Exercicio1 {
/*Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
seja, B[i] = A[i].*/

    public static void main(String[] args) {

        int[] A = new int[5];
        int[] B = new int[A.length];

        A[0] = 9;
        A[1] = 8;
        A[2] = 7;
        A[3] = 6;
        A[4] = 5;

        for (int i =0; i < A.length; i++){
            B[i] = A[i];
        }

        System.out.print("A = ");
        for (int i =0; i < A.length; i++){
            System.out.print(A[i] + "  ");
        }

        System.out.print("\nB = ");
        for (int i =0; i < A.length; i++){
            System.out.print(B[i] + "  ");
        }






    }

}
