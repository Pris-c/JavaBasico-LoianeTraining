package aula19;

import java.util.Random;

public class Exercicio13 {
    /*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que determine a soma dos elementos armazenados neste vetor que
são múltiplos de 5.*/

    public static void main(String[] args) {

        int[] arrayInt = new int[10];
        int soma = 0;

        Random random = new Random();

        for (int i =0; i < arrayInt.length; i++){
            arrayInt[i] = random.nextInt(10);
        }

        for (int n :arrayInt ) {
            if ( (n%5) == 0){
                soma += n;
            }
        }

        System.out.print("A = ");
        for (int i =0; i < arrayInt.length; i++){
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println("\nSoma dos elementos multiplos de 5 = " + soma);


    }
}
