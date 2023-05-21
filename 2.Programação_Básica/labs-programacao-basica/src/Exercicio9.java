import java.util.Scanner;

public class Exercicio9 {
//Faça um programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        float tempF, tempC;

        System.out.println("CONVERSOR DE TEMPERATURAS");
        System.out.println("Farenheit para Celsius");
        System.out.print("Digite a temperatura em Farenheit: ");
        tempF = scanner.nextFloat();

        tempC = ( 5 * ( tempF -32) / 9);
        System.out.println(tempF + "ºF é equivalente a " + tempC + "ºC");

    }
}
