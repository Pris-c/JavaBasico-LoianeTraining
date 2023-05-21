import java.util.Scanner;

public class Exercicio10 {
//Faça um programa que peça a temperatura em graus Celsius , transforme e mostre a temperatura em graus Farenheit
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double tempF, tempC;

        System.out.println("CONVERSOR DE TEMPERATURAS");
        System.out.println("Celsius para  Farenheit");
        System.out.print("Digite a temperatura em Celsius: ");
        tempC = scanner.nextDouble();

        tempF = (tempC * 1.8) + 32;
        System.out.println(tempC + "ºC é equivalente a " + tempF + "ºF");

    }
}
