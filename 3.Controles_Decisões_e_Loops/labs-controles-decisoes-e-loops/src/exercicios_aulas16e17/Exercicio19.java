package exercicios_aulas16e17;

import java.util.Scanner;

public class Exercicio19 {
/*Altere o programa anterior para que ele aceite apenas números entre 0
e 1000.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        int soma = 0;
        int menor = 0;
        int maior = 0;

        System.out.println("Numeros inteiros");
        System.out.println("Para SAIR, digite (0) a qualquer momento");


        do{
            System.out.println("Digite um numero: ");

            n = scanner.nextInt();

            if ((n > 0) && (n<=1000)) {
                soma += n;

                if (n > maior) {
                    maior = n;
                } else if (n < menor) {
                    menor = n;
                }
            } else {
                System.out.println("Valor inválido. Digite um numero entre 0 e 1000");
            }



        } while (n != 0);

        System.out.println("Maior numero digitado: " + maior);
        System.out.println("Menor numero digitado: " + menor);
        System.out.println("Soma dos numeros digitados: " + soma);



    }




}
