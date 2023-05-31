package exercicios_aulas16e17;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio22 {
/*
Altere o programa de cálculo dos números primos, informando, caso o
número não seja primo, por quais número ele é divisível.
*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        int cont = 0;
        int resto = 0;

        ArrayList<Integer> divs = new ArrayList<>();

        System.out.println("É UM NUMERO PRIMO?");
        System.out.println("Digite um número: ");
        n = scanner.nextInt();

        if (n>0){

            //if (n>3) {

                for (int i = n; i > 0; i--) {
                    resto = n % i;

                    if (resto == 0) {
                        cont++;
                        divs.add(i);
                    }
                }
            //}

            if ( (n<=3) || (cont == 2)){
                System.out.println(n + " é um número primo.");
            } else {
                System.out.println(n + " não é um número primo.");
                System.out.println("Seus divisores são: ");
                System.out.println(divs);
            }
        } else {
            System.out.println("nulo");
        }



    }

}
