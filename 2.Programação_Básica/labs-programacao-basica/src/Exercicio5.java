import java.util.Scanner;

public class Exercicio5 {
//Faça um programa que converta metros para centímetros

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double valorMetro, valorCent;

        System.out.println("CONVERSOR DE UNIDADES");
        System.out.println("METRO(s) PARA CENTIMETRO(s)");

        System.out.print("Medida em metro(s): ");
        valorMetro = scan.nextDouble();

        valorCent = valorMetro * 100;

        System.out.println("" + valorMetro + "m equivale(m) a " + valorCent + "cm");

    }
}
