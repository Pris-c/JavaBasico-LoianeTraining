package aula19;

public class Exercicio34 {
/*Criar um vetor A com 10 elementos inteiros. Escreva um programa que
imprima cada elemento do vetor A e a relação de todos os pares de 0
até o respectivo elemento.*/

    public static void main(String[] args) {

        int[] A = new int[10];

        System.out.print("A = ");
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 7;
            System.out.print(A[i] + ", ");
        }

        System.out.println("");
        System.out.println("-----------------------");
        for (int i = 0; i < A.length; i++) {
            int n = A[i];
            System.out.println("A["+i+"] = " + n);
            System.out.print("Pares entre 0 e " + n + ": ");

            for (int j=0; j<n; j++){
                if ((j%2) == 0 ){
                    System.out.print(j + "  ");
                }
            }
            System.out.println(" ");
            System.out.println("---");

        }

    }
}
