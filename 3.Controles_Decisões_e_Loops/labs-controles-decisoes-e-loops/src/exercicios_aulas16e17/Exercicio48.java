package exercicios_aulas16e17;

import java.util.Scanner;

public class Exercicio48 {
/*Faça um programa que peça um numero inteiro positivo e em seguida mostre este
numero invertido.
o Exemplo:
12376489
=> 98467321*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero inteiro: ");
        int num = scanner.nextInt();

        int reverso = 0;
        int resto = 0;

        while(num != 0)
        {
            resto = num % 10;
            num = num/10;
            reverso = reverso * 10 + resto;

        }
        System.out.println("O reverso é : " + reverso);
    }


}
