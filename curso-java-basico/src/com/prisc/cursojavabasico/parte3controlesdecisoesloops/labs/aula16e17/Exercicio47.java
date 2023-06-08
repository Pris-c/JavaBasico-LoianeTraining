package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio47 {
/*Em uma competição de ginástica, cada atleta recebe votos de sete
jurados. A melhor e a pior nota são eliminadas. A sua nota fica sendo
a média dos votos restantes. Você deve fazer um programa que
receba o nome do ginasta e as notas dos sete jurados alcançadas pelo
atleta em sua apresentação e depois informe a sua média, conforme a
descrição acima informada (retirar o melhor e o pior salto e depois
calcular a média com as notas restantes). As notas não são
informados ordenadas. Um exemplo de saída do programa deve ser
conforme o exemplo abaixo:
Atleta: Aparecido Parente
Nota: 9.9
Nota: 7.5
Nota: 9.5
Nota: 8.5
Nota: 9.0
Nota: 8.5
Nota: 9.7
Resultado final:
Atleta: Aparecido Parente
Melhor nota: 9.9
Pior nota: 7.5
Média: 9,04*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        double nota;
        double maior = 0;
        double menor = 0;
        double soma = 0;
        double media = 0;
        ArrayList<Double> saltos = new ArrayList<>();


        do {
            saltos.clear();
            soma = 0;
            System.out.println("\nDigite o nome do atleta ou (0) para sair: ");
            nome = scanner.next();

            for (int i = 1; i <= 7; i++) {
                System.out.println("Nota " + i + ": ");
                nota = scanner.nextDouble();
                soma += nota;

                if (i == 1) {
                    maior = menor = nota;
                } else {
                    if (nota > maior) {
                        maior = nota;
                    } else if (nota < menor) {
                        menor = nota;
                    }
                }
                saltos.add(nota);
            }

            media = (soma - maior - menor) / 5;


            System.out.println("Atleta: " + nome);
            System.out.println("Nota 1 : " + saltos.get(0));
            System.out.println("Nota 2 : " + saltos.get(1));
            System.out.println("Nota 3 : " + saltos.get(2));
            System.out.println("Nota 4 : " + saltos.get(3));
            System.out.println("Nota 5 : " + saltos.get(4));
            System.out.println("Nota 6 : " + saltos.get(5));
            System.out.println("Nota 7 : " + saltos.get(6));

            System.out.println("RESULTADO FINAL");
            System.out.println("Atleta: " + nome);
            System.out.println("Melhor nota: " + maior);
            System.out.println("Pior nota: " + menor);
            System.out.println("Média: " + media);


        } while (!nome.equals("0"));





    }







}
