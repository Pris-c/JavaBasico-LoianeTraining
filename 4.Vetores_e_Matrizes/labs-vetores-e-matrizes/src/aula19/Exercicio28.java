package aula19;

public class Exercicio28 {
/*Ler um vetor A com 10 elementos e construir um vetor B de mesmo
tipo e tamanho e com os mesmos elementos de A, sendo que estes
deverão estar invertidos, ou seja, o primeiro elemento de A passa a
ser o último de B, o segundo elemento de A passa a ser o penúltimo
de B e assim por diante.*/

    public static void main(String[] args) {

        int[] A = new int[10];
        int[] B = new int[A.length];

        for (int i =0; i < A.length; i++) {
            A[i] = (int) Math.round(Math.random()*10);
        }

        for (int i = 0, j = 9; i < 10; i++, j--){
            B[j] = A[i];
        }

            System.out.print("A = ");
            for (int j =0; j < A.length; j++){
                System.out.print(A[j] + " ");
            }

            System.out.print("\nB = ");
            for (int j =0; j < B.length; j++){
                System.out.print(B[j] + " ");
            }
    }
}
