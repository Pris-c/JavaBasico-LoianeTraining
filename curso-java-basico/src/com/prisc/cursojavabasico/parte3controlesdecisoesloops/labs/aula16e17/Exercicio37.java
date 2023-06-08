package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio37 {
/*Uma academia deseja fazer um senso entre seus clientes para
descobrir o mais alto, o mais baixo, a mais gordo e o mais magro, para
isto você deve fazer um programa que pergunte a cada um dos
clientes da academia seu código, sua altura e seu peso. O final da
digitação de dados deve ser dada quando o usuário digitar 0 (zero) no
campo código. Ao encerrar o programa também deve ser informados
os códigos e valores do clente mais alto, do mais baixo, do mais gordo
e do mais magro, além da média das alturas e dos pesos dos clientes*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String cod;
        String codMaisAlto = "";
        String codMaisBaixo = "";
        String codMaisPesado = "";
        String codMaisLeve = "";

        int cont = 0;

        double alt;
        double maiorAlt =0;
        double menorAlt =0;
        double peso;
        double maiorPeso = 0;
        double menorPeso = 0;
        double somaAlt = 0;
        double somaPeso = 0;
        double medAlt;
        double medPeso;

        System.out.println("ACADEMIA");

        do {

            System.out.print("Digite o código do aluno: ");
            cod = scanner.next();

            if (!cod.equals("0")) {
                System.out.print("Digita a altura do aluno " + cod + " em (m): ");
                alt = scanner.nextDouble();

                System.out.print("Digite o peso do aluno " + cod + " em (kg): ");
                peso = scanner.nextDouble();

                somaAlt += alt;
                somaPeso += peso;

                if (cont==0){
                    codMaisAlto = codMaisBaixo = cod;
                    codMaisPesado = codMaisLeve = cod;
                    maiorPeso = menorPeso = peso;
                    maiorAlt = menorAlt = alt;
                } else {

                    if (alt > maiorAlt){
                        codMaisAlto = cod;
                        maiorAlt = alt;
                    }

                    if (alt < menorAlt){
                        codMaisBaixo = cod;
                        menorAlt = alt;
                    }

                    if (peso > maiorPeso){
                        codMaisPesado = cod;
                        maiorPeso = peso;
                    }

                    if (peso < menorPeso){
                        codMaisLeve = cod;
                        menorPeso = peso;
                    }


                }
                cont++;
            }

        } while (!cod.equals("0"));

        medAlt = somaAlt / cont;
        medPeso = somaPeso / cont;


//         códigos e valores do clente mais alto, do mais baixo, do mais gordo
//e do mais magro, além da média das alturas e dos pesos dos clientes*/
        System.out.println("---------");
        System.out.println("Cliente mais alto: " + codMaisAlto + " - " + maiorAlt + "m." );
        System.out.println("Cliente mais baixo: " + codMaisBaixo + " - " + menorAlt + "m." );
        System.out.println("Cliente mais pesado: " + codMaisPesado + " - " + maiorPeso + "kg." );
        System.out.println("Cliente mais leve: " + codMaisLeve + " - " + menorPeso + "kg." );
        System.out.println("----------");
        System.out.println("A média de pesos dos clientes é: " + medPeso + "kg.");
        System.out.println("A média de altura dos clientes é: " + medAlt + "m.");


    }
}
