package aula19;

public class Exercicio27 {
/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
a) Bi deverá receber 'a' quando Ai for menor que 7; b) Bi deverá
receber 'b' quando Ai for igual a 7; c) Bi deverá receber 'c' quando Ai for
maior que 7 e menor que 10; d) Bi deverá receber 'd' quando Ai for
igual a 10; e e) Bi deverá receber 'e' quando Ai for maior que 10.
Sugestão: char B[10];*/

    public static void main(String[] args) {

        int[] arrayInt = new int[10];
        char[] arrayB = new char[arrayInt.length];

        arrayInt[0] = 3;
        arrayInt[1] = 7;
        arrayInt[2] = 10;
        arrayInt[3] = 3;
        arrayInt[4] = 4;
        arrayInt[5] = 4;
        arrayInt[6] = 8;
        arrayInt[7] = 2;
        arrayInt[8] = 11;
        arrayInt[9] = 0;

        /*a) Bi deverá receber 'a' quando Ai for menor que 7;
        b) Bi deverá receber 'b' quando Ai for igual a 7;
        c) Bi deverá receber 'c' quando Ai for maior que 7 e menor que 10;
        d) Bi deverá receber 'd' quando Ai for igual a 10; e
        e) Bi deverá receber 'e' quando Ai for maior que 10.
        Sugestão: char B[10];*/

        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] < 7){
                arrayB[i] = 'a';
            } else if (arrayInt[i] == 7) {
                arrayB[i] = 'b';
            } else if (arrayInt[i] < 10) {
                arrayB[i] = 'c';
            } else if (arrayInt[i] == 10) {
                arrayB[i] = 'd';
            } else {
                arrayB[i] = 'e';
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
