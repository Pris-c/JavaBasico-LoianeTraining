package com.prisc.cursojavabasico.parte4vetoresematrizes.labs.aula20;

import java.util.Scanner;

public class Exercicio4 {
/*Faça um programa para armazenar em uma matriz os
compromissos de uma agenda pessoal.
Cada dia do mês deve conter 24 horas, onde para cada uma destas 24 horas podemos
associar um tarefa específica (compromisso agendado).

O programa deve ter um menu onde o usuário indica o dia do mês
que deseja alterar e a hora, entrando em seguida com o
compromisso, ou então, o usuário pode também consultar a
agenda, fornecendo o dia e a hora para obter o
compromisso armazenado.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[][] agenda = new String[30][24];
        int diaPos = 0;
        int hora = 0;
        int escolha = -1;

        do {
            System.out.println("Digite:\n[1] para adicionar um compromisso,\n[2] para fazer consulta ou \n[0] para sair:");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 0: break;
                case 1:
                    //System.out.println("1");
                    System.out.println("Dia do compromisso: ");
                    diaPos = scanner.nextInt() - 1;
                    if (diaPos<0 || diaPos>30){
                        System.out.println("Dia inválido");
                        break;
                    }

                    System.out.println("Hora do compromisso: ");
                    hora = scanner.nextInt();
                    if (hora<0 || hora>23){
                        System.out.println("Hora inválida");
                        break;
                    }

                    scanner.nextLine();
                    if (agenda[diaPos][hora] == null) {
                        System.out.println("Insira o seu compromisso: ");
                        agenda[diaPos][hora] = scanner.nextLine();

                    } else {
                        System.out.println("Você já tem um compromisso agendado neste horário.");
                    }

                    break;

                case 2:
                    //System.out.println("2");
                    System.out.println("Digite o dia para a busca: ");
                    diaPos = scanner.nextInt() - 1;
                    if (diaPos<1 || diaPos>30){
                        System.out.println("Dia inválido");
                        break;
                    }


                    System.out.println("Digite a hora para a busca: ");
                    hora = scanner.nextInt();
                    if (hora<0 || hora>23){
                        System.out.println("Hora inválida");
                        break;
                    }

                    if (agenda[diaPos][hora] == null) {
                        System.out.println("\nVocê não tem nenhum compromisso agendado às " + hora + " do dia " + (diaPos + 1));
                    } else {
                        System.out.println("\nCompromisso agendado: " + agenda[diaPos][hora]);
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println("");
        } while (escolha!=0);


    }
}
