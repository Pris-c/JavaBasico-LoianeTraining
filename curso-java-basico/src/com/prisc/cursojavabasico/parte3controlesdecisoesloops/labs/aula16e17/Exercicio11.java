package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio11 {
/*
Altere o programa anterior para mostrar no final a soma dos números.
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = scanner.nextInt();

            if (n1 == n2){
            System.out.println("Os numeros digitados são iguais");
        }

            else if (n1 > n2){
            for (int i = (n2+1); i < n1; i++) {
                soma += i;
            }

        } else {
            for (int i = (n1+1); i < n2; i++){
                soma += i;
            }
        }

        System.out.println("Soma dos numeros no intervalo = " + soma);

    }

}
