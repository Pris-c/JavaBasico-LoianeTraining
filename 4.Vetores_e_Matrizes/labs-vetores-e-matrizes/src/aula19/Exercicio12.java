package aula19;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio12 {
    /*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a soma de todos os elementos armazenados
neste vetor.*/


    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("###,###.##");

        Random random = new Random();

        int[] vetorInt = new int[10];
        int soma = 0;

        for (int i =0; i < vetorInt.length; i++){
            vetorInt[i] = random.nextInt(10);
        }

        for (int n : vetorInt) {
            soma += n;
        }


        System.out.print("A = ");
        for (int i =0; i < vetorInt.length; i++){
            System.out.print(vetorInt[i] + " ");
        }

        System.out.println("\nSoma dos elementos do vetor = " + df.format(soma));



    }
}
