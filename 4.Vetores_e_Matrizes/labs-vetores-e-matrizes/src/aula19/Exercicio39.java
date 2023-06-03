package aula19;

public class Exercicio39 {
/*Criar dois vetores A e B cada um com 10 elementos inteiros.
Desenvolver um programa que realize a interseção dos vetores A e B
para produzir um vetor C. Interseção de conjuntos = todos os
elementos que existem em A e também existem em B.*/

    public static void main(String[] args) {

        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[A.length];

        int nA =0;
        int nB =0;
        int nC =0;

        boolean add = false;

        for (int i = 0; i < A.length; i++) {
            A[i] = (i+1)*2;
            B[i] = (i+1)*3;
        }

        int contC = 0;

        //Cada elemento de A
        for (int i = 0; i < A.length; i++) {
            nA = A[i];

            //Compara elemento de A com cada elemento de B
            for (int j = 0; j < B.length; j++) {
                nB = B[j];

                //Entra se encontrar elemento igual
                if (nA == nB){
                    add = true;
                    nC = nA;

                    //Verificar se elemento repetido em A e B já existe em C
                    for (int t = 0; t<C.length; t++){
                        if (nC == C[t]){
                            //Se já existir em C
                            add = false;
                            break;
                        }
                    }
                    if (add) {
                        C[contC] = nC;
                        contC++;
                    }
                }
            }
        }

        System.out.print("A: ");
        for (int n : A ) {
            System.out.print(n + " ");
        }

        System.out.print("\nB: ");
        for (int n : B ) {
            System.out.print(n + " ");
        }

        System.out.print("\nC: ");
        for (int n : C ) {
            System.out.print(n + " ");
        }

    }
}
