package exercicios_aulas14e15;

import java.util.Scanner;

public class Exercicio1 {
//Faça um Programa que peça dois números e imprima o maior deles.

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.println("COMPARA NUMEROS INTEIROS");
        System.out.print("Digite um número inteiro: ");
        num1 = scan.nextInt();
        System.out.print("Digite outro número inteiro: ");
        num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println("O maior valor digitaro foi: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior valor digitaro foi: " + num2);
        } else {
            System.out.println("Os valores são iguais.");
        }


    }

}
