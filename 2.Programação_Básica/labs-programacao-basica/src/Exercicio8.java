import java.util.Scanner;

public class Exercicio8 {
//Faça um programa que pergunte quanto você ganha por hora e o numero de horas trabalhadas no mês.
//Calcule e mostre o total do seu salário no referido mês.

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double valorHora;
        double horasTrabalhadas;
        double salario;

        System.out.println("CALCULO DE SALARIO DO MÊS");
        System.out.print("Valor da hora trabalhada: ");
        valorHora = scan.nextDouble();
        System.out.print("Número de horas trabalhadas no mês: ");
        horasTrabalhadas = scan.nextDouble();

        salario = valorHora * horasTrabalhadas;

        System.out.println("O salário do mês será: R$ " + salario);

    }
}
