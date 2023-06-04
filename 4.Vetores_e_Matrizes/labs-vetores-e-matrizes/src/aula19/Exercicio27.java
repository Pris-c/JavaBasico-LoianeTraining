package aula19;

import java.util.Random;

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

        Random random = new Random();

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(100);
        }

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
