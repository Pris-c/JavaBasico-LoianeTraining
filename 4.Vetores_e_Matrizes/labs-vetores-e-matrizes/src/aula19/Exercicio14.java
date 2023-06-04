package aula19;

import java.util.Random;

public class Exercicio14 {
    /*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a média aritmética simples dos elementos
ímpares armazenados neste vetor.    */

    public static void main(String[] args) {

        int[] vetor = new int[10];
        double soma = 0;
        double cont = 0;

        Random random = new Random();

        for (int i = 0; i <10; i++){
            vetor[i] = random.nextInt(15);
        }

        for (int num: vetor) {
            if ( (num%2) != 0){
                soma += num;
                cont++;
            }
        }

        System.out.print("A = ");
        for (int i =0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

        double media = soma/cont;
        System.out.println("\nMedia dos numeros impares = " + media);

    }
}
