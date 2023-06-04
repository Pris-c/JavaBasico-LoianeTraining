package aula19;

import java.util.Random;

public class Exercicio16 {
    /*Criar um vetor A com 10 elementos inteiros. Escrever um programa
que calcule e escreva: a) a soma de elementos armazenados neste
vetor que são inferiores a 15; b) a quantidade de elementos
armazenados no vetor que são iguais a 15; e c) a média dos
elementos armazenados no vetor que são superiores a 15.*/

    public static void main(String[] args) {

        int[] vetor = new int[10];
        int somaMenor = 0;
        int contIgual = 0;
        double contMaior = 0;
        double somaMaior = 0;
        double mediaMaior = 0;

        Random random = new Random();


        for (int i = 0; i <10; i++){
            vetor[i] = random.nextInt(100);
        }

        for (int n:
             vetor) {

            if ( n<15 ){
                somaMenor++;
            } else if (n==15) {
                contIgual++;
            } else {
                contMaior++;
                somaMaior += n;
            }
        }

        System.out.print("A = ");
        for (int i =0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

        mediaMaior = somaMaior / contMaior;

        System.out.println("\nSoma dos numeros menores do que 15: " + somaMenor);
        System.out.println("Contagem dos valores iguais a 15: " + contIgual);
        System.out.println("Média dos valores maiores que 15: " + mediaMaior);


    }
}
