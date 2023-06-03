package aula19;

import java.util.Scanner;

public class Exercicio18 {
    /*Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a menor e a maior idades e suas respectivas posições.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] idades = new  int[10];
        int maior = 0;
        int posMaior = -1;
        int menor = 0;
        int posMenor = -1;

        for (int i=0; i < idades.length; i++){

            System.out.println("Digite a " + (i+1) + "º idade: ");
            idades[i] = scanner.nextInt();

            if (i==0){
                maior = idades[i];
                menor = idades[i];
                posMenor = i;
                posMaior = i;
            } else if (idades[i] > maior){
                maior = idades[i];
                posMaior = i;
            } else if ( idades[i] < menor) {
                menor = idades[i];
                posMenor = i;

            }

        }

        System.out.println("Maior numero = " + maior + " na posição " + posMaior);
        System.out.println("Menor numero = " + menor + " na posição " + posMenor);

    }
}
