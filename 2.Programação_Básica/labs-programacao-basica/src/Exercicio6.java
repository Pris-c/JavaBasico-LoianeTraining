import java.util.Scanner;

public class Exercicio6 {
//Faça um programa que peça o raio de um circulo, calcule e mostre sua área

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double raio;
        double area;

        System.out.println("CALCULO DA ÁREA DO CIRCULO");
        System.out.print("Digite o raio do circulo (m): ");
        raio = scan.nextDouble();

        //area = 3.1415 * (raio * raio);
        area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do circulo é: " + area + "m²");

    }
}
