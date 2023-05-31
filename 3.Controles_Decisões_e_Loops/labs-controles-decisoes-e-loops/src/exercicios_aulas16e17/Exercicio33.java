package exercicios_aulas16e17;

import java.util.Scanner;

public class Exercicio33 {
/*O Departamento Estadual de Meteorologia lhe contratou para
desenvolver um programa que leia as um conjunto indeterminado de
temperaturas, e informe ao final a menor e a maior temperaturas
informadas, bem como a média das temperaturas.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        double menor = 0;
        double maior = 0;

        System.out.println("METEOROLOGIA");
        System.out.println("Quantas medições de temperatura você quer analisar?");
        int qtd = scanner.nextInt();

        double temp;
        for (int i =0; i< qtd; i++){

            System.out.println("Digite a temperatura " + (i+1) + ": ");
            temp = scanner.nextDouble();

            soma+=temp;

            if (i==0){
                maior = temp;
                menor = temp;

            } else if (temp < menor){
                menor = temp;
            } else if (temp > maior) {
                maior = temp;
            }
        }

        double media = soma/qtd;
        System.out.println("-----------");
        System.out.println("Temperatura máxima: " + maior);
        System.out.println("Temperatura mínima: " + menor);
        System.out.println("Temperatura média: " + media);



    }
}
