package aula19;

public class Exercicio12 {
    /*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a soma de todos os elementos armazenados
neste vetor.*/


    public static void main(String[] args) {

        int[] vetorInt = new int[10];
        int soma = 0;

        vetorInt[0] = 1;
        vetorInt[1] = 1;
        vetorInt[2] = 1;
        vetorInt[3] = 1;
        vetorInt[4] = 1;
        vetorInt[5] = 1;
        vetorInt[6] = 1;
        vetorInt[7] = 1;
        vetorInt[8] = 1;
        vetorInt[9] = 0;

        for (int n : vetorInt) {
            soma += n;
        }

        System.out.println("Soma dos elementos do vetor = " + soma);



    }
}
