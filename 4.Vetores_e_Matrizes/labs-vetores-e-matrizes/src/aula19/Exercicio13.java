package aula19;

public class Exercicio13 {
    /*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que determine a soma dos elementos armazenados neste vetor que
são múltiplos de 5.*/

    public static void main(String[] args) {

        int[] arrayInt = new int[10];
        int soma = 0;

        arrayInt[0] = 10;
        arrayInt[1] = 8;
        arrayInt[2] = 7;
        arrayInt[3] = 6;
        arrayInt[4] = 5;
        arrayInt[5] = 4;
        arrayInt[6] = 3;
        arrayInt[7] = 2;
        arrayInt[8] = 15;
        arrayInt[9] = 0;

        for (int n :arrayInt ) {
            if ( (n%5) == 0){
                soma += n;
            }
        }

        System.out.println("Soma dos elementos multiplos de 5 = " + soma);


    }
}
