import java.util.Scanner;

public class Exercicio2 {
//Faça um programa que peça um número e então mostre a mensagem: O número informado foi: [número].

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("O número informado foi: " + numero);

    }
}
