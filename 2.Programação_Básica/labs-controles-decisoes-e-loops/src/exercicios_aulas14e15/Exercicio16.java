package exercicios_aulas14e15;

import java.util.Scanner;

import static java.lang.System.exit;

public class Exercicio16 {
/*
Faça um programa que calcule as raízes de uma equação do segundo
grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
b e c e fazer as consistências, informando ao usuário nas seguintes
situações:

a. Se o usuário informar o valor de A igual a zero, a equação não é
do segundo grau e o programa não deve fazer pedir os demais
valores, sendo encerrado;
b. Se o delta calculado for negativo, a equação não possui raizes
reais. Informe ao usuário e encerre o programa;
c. Se o delta calculado for igual a zero a equação possui apenas
uma raiz real; informe-a ao usuário;
d. Se o delta for positivo, a equação possui duas raiz reais;
informe-as ao usuário;
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        double delta, raiz1, raiz2;

        System.out.println("RESOLVE EQUAÇÃO DO 2º GRAU");
        System.out.print("Digite o valor de \"a\": ");
        a = scanner.nextDouble();

        if (a!=0) {
            System.out.print("Digite o valor de \"b\": ");
            b = scanner.nextDouble();
            System.out.print("Digite o valor de \"c\" ");
            c = scanner.nextDouble();

            delta = ((Math.pow(b, 2)) - (4 * a * c));

            if (delta >= 0){

                if (delta == 0) {
                    raiz1 = ((-b) / (2 * a));

                    System.out.println("A equação possui apenas uma raiz real: ");
                    System.out.println("Raiz = " + raiz1);

                } else {
                    raiz1 = ((-b + Math.sqrt(delta)) / (2 * a));
                    raiz2 = ((-b - Math.sqrt(delta)) / (2 * a));

                    System.out.println("A equação possui duas raizes reais: ");
                    System.out.println("Raiz 1 = " + raiz1);
                    System.out.println("Raiz 2 = " + raiz2);
                }

            } else {
                System.out.println("A equação não possui raizes reais.");
            }

        }else {
            System.out.println("Não pode ser uma equação do 2º grau.");

        }


    }


}
