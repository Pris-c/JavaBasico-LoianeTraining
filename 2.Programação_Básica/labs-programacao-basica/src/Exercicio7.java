
import java.util.Scanner;

public class Exercicio7 {
//Faça um programa que calcule a área de um quadrado, em seguida, mostre o dobro dessa área para o usuário

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double lado;
        double area;

        System.out.println("MOSTRA DOBRO DA ÁREA DE UM QUADRADO");
        System.out.print("Digite o valor (em metros) dos lados do quadrado: ");
        lado = scanner.nextDouble();

        area = Math.pow(lado,2);

        System.out.println("O dobro da área é: " + (area * 2) + "m².");

    }
}
