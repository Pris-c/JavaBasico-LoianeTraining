package exercicios_aulas14e15;

import java.util.Scanner;

public class Exercicio3 {
//Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char sexo;

        System.out.println("FEMININO OU MASCULINO?");
        System.out.println("Digite (M) para masculino ou (F) para feminino: ");
        sexo = scan.next().charAt(0);

        if((sexo == 'M') || (sexo == 'm')){
            System.out.println("M - Masculino");
        } else if ((sexo == 'F') || (sexo == 'f')) {
            System.out.println("F - Feminino");
        } else {
            System.out.println("Sexo Inválido.");
        }

    }
}
