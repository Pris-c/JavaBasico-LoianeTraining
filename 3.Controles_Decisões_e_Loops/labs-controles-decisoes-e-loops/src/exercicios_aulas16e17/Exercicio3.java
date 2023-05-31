package exercicios_aulas16e17;

import java.util.Scanner;

public class Exercicio3 {
/*
Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        String nome = "";
        int idade = 0;
        double salario = 0;
        String sexo = "";
        String estadoC = "";

        System.out.println("Insira seus dados abaixo");

        do {
            System.out.print("Nome: ");
            nome = scanner.next();

            if (nome.length() < 3) {
                System.out.println("ERRO! O nome deve ter no mínimo 3 caracteres.");
                isValid = false;
            } else {
                isValid = true;
            }

        } while (!isValid);


        do {
            System.out.print("Idade: ");
            idade = scanner.nextInt();

            if ((idade < 0) || (idade > 150)) {
                System.out.println("ERRO! " + idade + " não é uma idade válida.");
                isValid = false;
            } else {
                isValid = true;
            }
        } while (!isValid);


        do {
            System.out.print("Salário: ");
            salario = scanner.nextDouble();

            if (salario <= 0) {
                System.out.println("ERRO! " + salario + " não é um valor válido.");
                isValid = false;
            } else {
                isValid = true;
            }
        } while (!isValid);


        do {
            System.out.print("Sexo: ");
            sexo = scanner.next();

            if ((!sexo.equalsIgnoreCase("f")) && (!sexo.equalsIgnoreCase("m"))) {
                System.out.println("ERRO! Digite (f) ou (m).");
                isValid = false;
            } else {
                isValid = true;
            }
        } while (!isValid);


        do {
            System.out.print("Estado Civil: ");
            estadoC = scanner.next();

            if (    (!estadoC.equalsIgnoreCase("s")) &&
                    (!estadoC.equalsIgnoreCase("c")) &&
                    (!estadoC.equalsIgnoreCase("v")) &&
                    (!estadoC.equalsIgnoreCase("d"))) {

                System.out.println("ERRO! Digite (s)- soleiro\n" +
                        "           (c) - casado\n" +
                        "           (v) - viúvo\n" +
                        "           (d) - divorciado.");
                isValid = false;
            } else {
                isValid = true;
            }
        } while (!isValid);

            System.out.println("-------------");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Salário: R$ " + salario);
            System.out.println("Sexo: " + sexo);
            System.out.println("Estado civil: " + estadoC);

    }

}
