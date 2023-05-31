package exercicios_aulas16e17;

import java.util.Scanner;

public class Exercicio36 {
    /*Desenvolva um programa que faça a tabuada de um número qualquer
inteiro que será digitado pelo usuário, mas a tabuada não deve
necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
devem ser informados também pelo usuário, conforme exemplo
abaixo:
o Montar a tabuada de: 5
o Começar por: 4
o Terminar em: 7
o
o Vou montar a tabuada de 5 começando em 4 e terminando em 7:
o 5 X 4 = 20
o 5 X 5 = 25
o 5 X 6 = 30
o 5 X 7 = 35
Obs: Você deve verificar se o usuário não digitou o final menor
que o inicial.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inicial = 0;
        int fim = 0;

        System.out.println("TABUADA");
        System.out.print("Quero montar a tabuada do número: ");
        int n = scanner.nextInt();

        do {

            System.out.print("Começando por: ");
            inicial = scanner.nextInt();

            System.out.print("Terminando por: ");
            fim = scanner.nextInt();

            if (fim < inicial){
                System.out.println("O valor de inicio deve ser menor do que o valor de término");
            }

        } while (fim < inicial);

        for (int i = inicial; i <= fim; i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }



    }
}
