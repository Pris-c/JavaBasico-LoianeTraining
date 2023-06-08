import java.util.Scanner;

public class Exercicio11 {
/*Faça um programa que peça dois numeros inteiros e um numero real.
Calcule e mostre:
a) o produto do dobro do primeiro com metade do segundo;
b) a soma do triplo do primeiro com o terceiro;
c) o terceiro elevado ao cubo.
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1, num2, resultado1;
        double num3, resultado2, resultado3;


        System.out.println("OPERAÇÕES COM NUMEROS INTEIROS E REAL");
        System.out.print("Digite um numero inteiro: ");
        num1 = scan.nextInt();
        System.out.print("Digite outro numero inteiro: ");
        num2 = scan.nextInt();
        System.out.print("Digite um numero real: ");
        num3 = scan.nextDouble();

        resultado1 = (2 * num1) * (num2 / 2);
        resultado2 = (3 * num1) + num3;
        resultado3 = Math.pow(num3, 3);

        System.out.println("\nProduto do dobro do primeiro com metade do segundo = " + resultado1);
        System.out.println("Soma do triplo do primeiro com o terceiro = " + resultado2);
        System.out.println("Terceiro elevado ao cubo = " + resultado3);

    }
}
