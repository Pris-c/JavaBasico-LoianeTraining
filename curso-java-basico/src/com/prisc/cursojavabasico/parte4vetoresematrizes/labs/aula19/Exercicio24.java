package com.prisc.cursojavabasico.parte4vetoresematrizes.labs.aula19;

public class Exercicio24 {
/*Números palíndromos são aqueles que escritos da direita para a
esquerda têm o mesmo valor quando escritos da esquerda para a
direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um
programa que verifique se um dado vetor A de 10 elementos inteiros é
um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao
último, se o segundo elemento do vetor é igual ao penúltimo e assim
por diante até verificar todos os elementos ou chegar a conclusão que
o vetor não é um palíndromo.*/


    public static void main(String[] args) {


        int[] vetor = new int[10];
        boolean palíndromo = true;
        int cont = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) Math.round(Math.random() * 1);
        }

        /*for (int i = 0, j = 9; i < 5; i++, j--) {
        vetor[i] = vetor[j] = i+1;
        }*/


        for (int i = 0, j = 9; i < 5; i++, j--) {
            if ((vetor[i]) != (vetor[j])) {
                palíndromo = false;
            }
            cont++;
        }

        if (palíndromo) {
            System.out.println("O array é um palíndromo.");
        } else {
            System.out.println("O array não é um palindromo.");
        }

        for (int p :
                vetor) {
            System.out.print(p + " - ");
        }

    }

}
