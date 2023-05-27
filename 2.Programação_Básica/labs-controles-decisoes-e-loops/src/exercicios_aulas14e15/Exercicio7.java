package exercicios_aulas14e15;

import java.util.Scanner;

public class Exercicio7 {
//Faça um Programa que leia três números e mostre o maior e o menor deles.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, maior, menor;

        System.out.println("COMPARA 3 INTEIROS");
        System.out.println("Digite o primeiro numero:");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero:");
        num3 = scanner.nextInt();

        if((num1 >= num2) && (num1 >= num3)){
            maior = num1;
            if (num2 >= num3){
                menor = num3;
            } else {
                menor = num2;
            }

        } else if ((num2 >= num1) && (num2 >= num3)) {
            maior = num2;
            if (num1 >= num3){
                menor = num3;
            } else {
                menor = num1;
            }

        } else {
            maior = num3;
            if (num1 >= num2){
                menor = num2;
            } else {
                menor = num1;
            }
        }

        System.out.println("O maior valor digitado foi " + maior);
        System.out.println("O menor valor digitado foi " + menor);
    }

}
