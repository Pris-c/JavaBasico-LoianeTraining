package aula19;

import java.util.Scanner;

public class Exercicio29 {
/*Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
sendo este a junção dos dois outros vetores. Os primeiros 10
elementos de C deverão receber os elementos de A e os últimos
elementos C deverão receber os elementos de B. Desta forma, C
deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.*/

    public static void main(String[] args) {

        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[(A.length) + (B.length)];



        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i<A.length; i++){
            System.out.print("Digite o " + (i+1) + "º elemento de A: ");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i<B.length; i++){
            System.out.print("Digite o " + (i+1) + "º elemento de B: ");
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i< A.length; i++){
            C[i] = A[i];
            C[i+A.length] = B[i];
        }

        System.out.print("A = ");
        for (int i = 0; i< A.length; i++){
            System.out.print(A[i] + " - ");
        }
        System.out.println(" ");

        System.out.print("B = ");
        for (int i = 0; i<B.length; i++){
            System.out.print(B[i] + " - ");
        }
        System.out.println(" ");

        System.out.print("C = ");
        for (int i = 0; i<C.length; i++){
            System.out.print(C[i] + " - ");
        }





    }
}
