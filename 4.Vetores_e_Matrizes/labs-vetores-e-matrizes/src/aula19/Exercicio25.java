package aula19;

public class Exercicio25 {
/*
    Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
    mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
    a) Bi deverá receber 1 quando Ai for par; b) Bi deverá receber 0
    quando Ai for ímpar.*/

    public static void main(String[] args) {

        int[] arrayInt = new int[10];
        int[] arrayB = new int[arrayInt.length];

        arrayInt[0] = 9;
        arrayInt[1] = 7;
        arrayInt[2] = 7;
        arrayInt[3] = 3;
        arrayInt[4] = 4;
        arrayInt[5] = 4;
        arrayInt[6] = 8;
        arrayInt[7] = 2;
        arrayInt[8] = 10;
        arrayInt[9] = 0;

        for (int i = 0; i< arrayInt.length; i++) {
            int n = arrayInt[i];

            if ( (n%2)==0 ){
                arrayB[i] = 1;
            } else {
                arrayB[i] = 0;
            }

        }
            System.out.print("A = ");
            for (int j =0; j < arrayInt.length; j++){
                System.out.print(arrayInt[j] + " ");
            }

            System.out.print("\nB = ");
            for (int j =0; j < arrayInt.length; j++){
                System.out.print(arrayB[j] + " ");
            }
    }



}
