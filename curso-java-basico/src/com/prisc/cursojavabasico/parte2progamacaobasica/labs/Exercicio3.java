import java.util.Scanner;

public class Exercicio3 {
//Faça um programa que peça dois numeros e imprima a soma

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("CALCULO DE SOMA DE DOIS INTEIROS");
        System.out.print("Digite o primeiro número inteiro: ");
        numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        numero2 = scanner.nextInt();

        System.out.println("A soma dos números digitados é: " + (numero1 + numero2));
    }
}
