package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio23 {
/*23. Faça um programa que mostre todos os primos entre 1 e N sendo N
um número inteiro fornecido pelo usuário. O programa deverá mostrar
também o número de divisões que ele executou para encontrar os
números primos. Serão avaliados o funcionamento, o estilo e o número
de testes (divisões) executados.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        int cont = 0;
        int resto = 0;
        int div = 0;
        boolean printed = true;

        System.out.println("É UM NUMERO PRIMO?");
        System.out.println("Digite um número: ");
        n = scanner.nextInt();

        if (n>0){
            //Testando numeros (j) de 1 a n.
            for (int j = 1; j <= n; j++){


                //testando j.
                int i = 1;
                cont = 0;
                while ((i <= j) && (cont < 3)) {

                    resto = j % i;
                    div++;
                    //System.out.println(j + " % " + i);
                    //System.out.println("j = " + j + " i = " + i + " resto = " + resto);

                    if (resto == 0) {
                        cont++;
                    }

                    i++;

                }

                if (cont < 3){
                    if (printed){
                        System.out.println("Entre 1 e " + n + " são primos: ");
                        System.out.print(j);
                        printed = false;
                    } else {
                        System.out.print(", " + j);
                    }
                }

            }

            System.out.println("\nForam realizadas " + div + " divisões");

        } else {
            System.out.println("Intervalo nulo");
        }

    }

}
