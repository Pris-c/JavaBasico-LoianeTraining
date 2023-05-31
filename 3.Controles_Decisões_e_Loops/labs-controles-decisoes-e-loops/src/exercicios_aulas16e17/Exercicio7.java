package exercicios_aulas16e17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio7 {
/*
Faça um programa que leia 5 números e informe o maior número.
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList();

        int n1, n2, n3, n4, n5;

        System.out.println("COMPARA  5 NUMEROS INTEIROS");
        System.out.println("Digite o primeiro numero: ");
        n1 = scan.nextInt();
        nums.add(n1);
        System.out.println("Digite o segundo numero: ");
        n2 = scan.nextInt();
        nums.add(n2);
        System.out.println("Digite o terceiro numero: ");
        n3 = scan.nextInt();
        nums.add(n3);
        System.out.println("Digite o quarto numero: ");
        n4 = scan.nextInt();
        nums.add(n4);
        System.out.println("Digite o quinto numero: ");
        n5 = scan.nextInt();
        nums.add(n5);

        Collections.sort(nums);

        //System.out.println(nums);
        System.out.println("Maior = " + (nums.get(nums.size()-1)) );





    }
}
