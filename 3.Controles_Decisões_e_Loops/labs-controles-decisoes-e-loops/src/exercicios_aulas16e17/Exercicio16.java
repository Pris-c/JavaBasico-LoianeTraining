package exercicios_aulas16e17;

import java.util.Scanner;

public class Exercicio16 {
/*
série de Fibonacci é formada pela seqüência
0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até
que o valor seja maior que 500.
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("FIBONACCI");
        System.out.println("Digite a quantidade de numeros a exibir: ");
        int n1 = 1;
        int n2 = 0;
        int f = 0;

       while (f < 500){

            f = n1 + n2;
            n1 = n2;
            n2 = f;

            System.out.println(f);

        }

}



}
