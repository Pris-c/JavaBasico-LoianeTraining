package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio46 {
    /*Em uma competição de salto em distância cada atleta tem direito a
cinco saltos. No final da série de saltos de cada atleta, o melhor e o
pior resultados são eliminados. O seu resultado fica sendo a média
dos três valores restantes. Você deve fazer um programa que receba o
nome e as cinco distâncias alcançadas pelo atleta em seus saltos e
depois informe a média dos saltos conforme a descrição acima
informada (retirar o melhor e o pior salto e depois calcular a média).
Faça uso de uma lista para armazenar os saltos. Os saltos são
informados na ordem da execução, portanto não são ordenados. O
programa deve ser encerrado quando não for informado o nome do
atleta. A saída do programa deve ser conforme o exemplo abaixo:

Atleta: Rodrigo Curvêllo
Primeiro Salto: 6.5 m
Segundo Salto: 6.1 m
Terceiro Salto: 6.2 m
Quarto Salto: 5.4 m
Quinto Salto: 5.3 m
Melhor salto: 6.5 m
Pior salto: 5.3 m
Média dos demais saltos: 5.9 m
Resultado final:
Rodrigo Curvêllo: 5.9 m*/

    public static void main(String[] args) {
        //5saltos
        //Elimina pior e melhor
        //resultado media dos 3


        Scanner scanner = new Scanner(System.in);
        String nome;
        double salto;
        double maior = 0;
        double menor = 0;
        double soma = 0;
        double media = 0;
        //ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> saltos = new ArrayList<>();


        do {
            saltos.clear();
            System.out.println("\nDigite o nome do atleta ou (0) para sair: ");
            nome = scanner.next();
            //nomes.add(nome);

            for (int i = 1; i <= 5; i++) {
                System.out.println("Salto " + i + ": ");
                salto = scanner.nextDouble();
                soma += salto;

                if (i == 1) {
                    maior = menor = salto;
                } else {
                    if (salto > maior) {
                        maior = salto;
                    } else if (salto < menor) {
                        menor = salto;
                    }
                }
                saltos.add(salto);
            }

            media = (soma - maior - menor) / 3;


            System.out.println("Atleta: " + nome);
            System.out.println("Salto 1 : " + saltos.get(0) + " m.");
            System.out.println("Salto 2 : " + saltos.get(1) + " m.");
            System.out.println("Salto 3 : " + saltos.get(2) + " m.");
            System.out.println("Salto 4 : " + saltos.get(3) + " m.");
            System.out.println("Salto 5 : " + saltos.get(4) + " m.");
            System.out.println("Melhor salto: " + maior  + " m.");
            System.out.println("Pior salto: " + menor + " m.");
            System.out.println("Média dos demais saltos: " + media + " m.");
            System.out.println("RESULTADO FINAL");
            System.out.println(nome + ": " + media + " m.");

        } while (!nome.equals("0"));






    }
}


