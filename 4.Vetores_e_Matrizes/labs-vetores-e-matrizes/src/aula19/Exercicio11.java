package aula19;

public class Exercicio11 {
    /*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste
vetor que são pares (Even).*/


    public static void main(String[] args) {

        int[] A = new int[10];
        int contOdd = 0, contEven = 0 ;

        A[0] = 9;
        A[1] = 8;
        A[2] = 7;
        A[3] = 6;
        A[4] = 5;
        A[5] = 4;
        A[6] = 2;
        A[7] = 2;
        A[8] = 2;
        A[9] = 0;

        for (int num : A) {
            if ( (num%2) == 0 ){
                contEven++;
            } else {
                contOdd++;
            }
        }

        System.out.println("Even Numbers = " + contEven);
        System.out.println("Odd Numbers = " + contOdd);

    }
}
