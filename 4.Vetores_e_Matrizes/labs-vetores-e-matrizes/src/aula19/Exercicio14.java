package aula19;

public class Exercicio14 {
    /*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a média aritmética simples dos elementos
ímpares armazenados neste vetor.    */

    public static void main(String[] args) {

        int[] vetor = new int[10];
        double soma = 0;
        double cont = 0;

        for (int i = 0; i <10; i++){
            vetor[i] = i;
        }

        for (int num: vetor) {
            if ( (num%2) != 0){
                soma += num;
                cont++;
            }
        }

        double media = soma/cont;
        System.out.println("Media dos numeros impares = " + media);

    }
}
