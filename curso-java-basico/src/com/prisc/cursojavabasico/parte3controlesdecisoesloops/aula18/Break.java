package com.prisc.cursojavabasico.parte3controlesdecisoesloops.aula18;

import java.util.Scanner;

public class Break {

    //imprime primeiro numero q seja maior que num, menor que max, e divisivel por 7

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        int num = scanner.nextInt();
        System.out.println("Entre com um limite: ");
        int max = scanner.nextInt();

        for (int i = num; i <= max; i++){

            if (i%7 == 0){
                System.out.println("O valor de i é = " + i);
                break;
            }

        }
    }
}
