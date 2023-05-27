package exercicios_aulas14e15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio7a {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, maior, menor;
        ArrayList<Integer> numeros = new ArrayList();


        System.out.println("COMPARA 3 INTEIROS");
        System.out.println("Digite o primeiro numero:");
        num1 = scanner.nextInt();
        numeros.add(num1);
        System.out.println("Digite o segundo numero:");
        num2 = scanner.nextInt();
        numeros.add(num2);
        System.out.println("Digite o terceiro numero:");
        num3 = scanner.nextInt();
        numeros.add(num3);

        Collections.sort(numeros);

        maior = numeros.get( (numeros.size()-1) );
        menor = numeros.get(0);

        System.out.println("O maior valor digitado foi " + maior);
        System.out.println("O menor valor digitado foi " + menor);



    }
}
