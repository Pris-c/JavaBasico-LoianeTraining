package exercicios_aulas16e17;

import java.util.Scanner;

public class Exercicio39 {
/*Faça um programa que leia dez conjuntos de dois valores, o primeiro
representando o número do aluno e o segundo representando a sua
altura em centímetros. Encontre o aluno mais alto e o mais baixo.
Mostre o número do aluno mais alto e o número do aluno mais baixo,
junto com suas alturas.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String cod;
        String codMaisAlto = "";
        String codMaisBaixo = "";
        int cont = 0;

        double alt;
        double maiorAlt =0;
        double menorAlt =0;
        double somaAlt = 0;

        System.out.println("ESCOLA");

        for (int i = 0; i <10; i++) {

            System.out.print("Digite o código do aluno: ");
            cod = scanner.next();

            System.out.print("Digita a altura do aluno (" + cod + ") em (m): ");
            alt = scanner.nextDouble();

            if (i == 0) {
                codMaisAlto = codMaisBaixo = cod;
                maiorAlt = menorAlt = alt;

            } else {
                if (alt > maiorAlt) {
                    codMaisAlto = cod;
                    maiorAlt = alt;
                }

                if (alt < menorAlt) {
                    codMaisBaixo = cod;
                    menorAlt = alt;
                }
            }

        }

        System.out.println("---------");
        System.out.println("Aluno mais alto: (" + codMaisAlto + ") - " + maiorAlt + "m." );
        System.out.println("Aluno mais baixo: (" + codMaisBaixo + ") - " + menorAlt + "m." );

    }


}
