package exercicios_aulas16e17;

import java.util.Scanner;

public class Exercicio5 {
/*
Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais.
Valide a entrada e permita repetir a operação.
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int popA = 0;
        int popB = 0;
        double cresA = 0;
        double cresB = 0;
        boolean isValid;

        System.out.println("CRESCIMENTO POPULACIONAL");

        do {
            System.out.println("Informe a população da cidade A: ");
            popA = scan.nextInt();
            isValid = popA > 0;

            if (!isValid){
                System.out.println("Valor inválido.");
                isValid = false;
            } else {
                isValid = true;
            }
        } while (!isValid);


        System.out.println("Informe a taxa de crescimento (em %) da cidade A: ");
        cresA = scan.nextDouble();


        do {
            System.out.println("Informe a população da cidade B: ");
            popB = scan.nextInt();
            isValid = popB > 0;

            if (!isValid){
                System.out.println("Valor inválido.");
                isValid = false;
            } else {
                isValid = true;
            }
        } while (!isValid);

        System.out.println("Informe a taxa de crescimento (em %) da cidade B: ");
        cresB = scan.nextDouble();


        if (popB > popA){
            if (cresB < cresA) {
                double taxaA = (cresA / 100)+1;
                double taxaB = (cresB / 100)+1;

                int i = 0;
                while (popA < popB) {
                    popA *= taxaA;
                    popB *= taxaB;

/*                    System.out.println("Em " + i + " anos.");
                    System.out.println("PopA = " + popA);
                    System.out.println("PopB = " + popB);
                    System.out.println("-------");*/

                    i++;
                }

                System.out.println("Em " + i + " anos:");
                System.out.println("população A: " + popA);
                System.out.println("população B: " + popB);
            } else {
                System.out.println("A população de B será sempre maior.");
            }
        } else {
            System.out.println("A população de A já é maior que a de B");
        }



    }
}
