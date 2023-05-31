package exercicios_aulas16e17;

import java.util.Scanner;

public class Exercicio50 {
    /*Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que
calcule o valor de H com N termos.*/

    public static void main(String[] args) {

        int n, m;
        int num;
        double div = 0;
        double soma = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos termos quer exibir: ");
        num = scanner.nextInt();


        System.out.print("H = ");

        for (double i = 1; i<=num ; i++){
            n = 1;
            m = (int) i;

            if (i==num){
                System.out.print(n + "\\" + m);
            } else {
                System.out.print(n + "\\" + m + " + ");
            }

            div = 1/i;
            //System.out.println("div = " + div);
            soma += div;

        }
        System.out.println("\nH = " + soma);


    }



}
