package aula20;

import java.util.Scanner;

public class Exercicio5 {
/*Modifique o programa anterior de maneira a guardar os
compromissos de todo o ano, organizados por mês, dia e hora
(só 8 horas por dia).*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[][][] agenda = new String[12][30][8];
        int mesPos = 0;
        int diaPos = 0;
        int horaPos = 0;
        int escolha = -1;
        int hora = 0;

        do {
            System.out.println("Digite:\n[1] para adicionar um compromisso,\n[2] para fazer consulta ou \n[0] para sair:");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 0: break;
                case 1:
                    //System.out.println("1");
                    System.out.println("Mês do compromisso: ");
                    mesPos = scanner.nextInt() - 1;

                    if (mesPos<1 || mesPos>12){
                        System.out.println("Mês inválido");
                        break;
                    }

                    System.out.println("Dia do compromisso: ");
                    diaPos = scanner.nextInt() - 1;
                    if (diaPos<1 || diaPos>30){
                        System.out.println("Dia inválido");
                        break;
                    }

                    System.out.println("Hora do compromisso (entre 8h e 16h)");
                    hora = scanner.nextInt();
                    horaPos = hora-8;
                    if (hora<8 || hora>15){
                        System.out.println("Hora inválida");
                        break;
                    }

                    scanner.nextLine();
                    if (agenda[mesPos][diaPos][horaPos] == null) {
                        System.out.println("Insira o seu compromisso: ");
                        agenda[mesPos][diaPos][horaPos] = scanner.nextLine();
                    } else {
                        System.out.println("Você já tem um compromisso agendado neste horário.");
                    }
                    break;

                case 2:
                    //System.out.println("2");
                    System.out.println("Digite o mês para a busca: ");
                    mesPos = scanner.nextInt() - 1;
                    if (mesPos<1 || mesPos>12){
                        System.out.println("Mês inválido");
                        break;
                    }


                    System.out.println("Digite o dia para a busca: ");
                    diaPos = scanner.nextInt() - 1;
                    if (diaPos<1 || diaPos>30){
                        System.out.println("Dia inválido");
                        break;
                    }


                    System.out.println("Digite a hora para a busca: ");
                    hora = scanner.nextInt();
                    horaPos = hora-8;
                    if (hora<8 || hora>15){
                        System.out.println("Hora inválida");
                        break;
                    }

                    if (agenda[mesPos][diaPos][horaPos] == null) {
                        System.out.println("Você não tem nenhum compromisso agendado às " + hora + " do dia " + (diaPos + 1) + " do mês " + mesPos);
                    } else {
                        System.out.println("Compromisso agendado: " + agenda[mesPos][diaPos][horaPos]);
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println("");
        } while (escolha!=0);

    }
}
