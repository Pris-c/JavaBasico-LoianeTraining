package aula19;

import java.util.Scanner;

public class Exercicio17 {
    /*Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a quantidade de pessoas que possuem idade superior a 35
anos.*/


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] idades = new  int[10];
        int cont = 0;

        for (int i=0; i < idades.length; i++){

            System.out.println("Digite a " + (i+1) + "º idade: ");
            idades[i] = scanner.nextInt();

            if (idades[i] > 35){
                cont++;
            }
        }

        System.out.print("A = ");
        for (int i =0; i < idades.length; i++){
            System.out.print(idades[i] + " ");
        }

        System.out.println("\nPessoas com mais de 35 anos: " + cont);



    }
}
