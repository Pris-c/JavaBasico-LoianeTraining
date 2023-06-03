package aula19;

public class Exercicio35 {
/*Criar um vetor A com 10 elementos inteiros. Escreva um programa que
imprima cada elemento do vetor A e a relação de todos os divisores do
respectivo elemento.*/


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
            System.out.println("Divisores de A["+i+"] = " + n);

            for (int j=1; j<=n; j++){
                if ((n%j) == 0 ){
                    System.out.print(j + "  ");
                }
            }
            System.out.println(" ");
            System.out.println("---");

        }




    }


}
