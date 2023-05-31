package exercicios_aulas16e17;

import java.util.Scanner;

public class Exercicio20 {
/*
Altere o programa de cálculo do fatorial, permitindo ao usuário calcular
o fatorial várias vezes e limitando o fatorial a números inteiros positivos
e menores que 16.
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        int fat = 1;

        System.out.println("FATORIAL - 1 a 16");
        System.out.println("Digite (0) a qualquer momento para sair.");

        do {
            System.out.println("Digite um numero: ");
            n = scanner.nextInt();

            if ((n > 0) && (n <= 16)) {
                for (int i = n; i > 0; i--) {
                    fat *= i;
                }
                System.out.println("O fatorial de " + n + " é " + fat);
                System.out.println("");

            } else if (n != 0){
                System.out.println("Valor fora do intervalo válido.\n");
            }



        } while (n != 0);


    }
}
