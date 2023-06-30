package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas47a52.Res;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Agenda agenda = new Agenda(5);
        //Agenda agenda = preencherAgenda(5);
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        System.out.println(agenda.agendaVazia());


        do {
            opcao = obterEntrada(scan);

            switch (opcao) {
                case 1:
                    buscarContato(scan, agenda);
                    break;
                case 2:
                    adicionarNovoContato(scan, agenda);
                    break;
                case 3:
                    System.out.println(agenda);
                    break;
                case 4:
                    break;
            }
        } while (opcao != 4) ;
    }


    public static int obterEntrada(Scanner scan){
        boolean valido = false;
        int opcao = 0;

        do {
            System.out.println("ESCOLHA A OPÇÃO DESEJADA" +
                    "\n1 - Consultar contato." +
                    "\n2 - Adicionar contato" +
                    "\n3 - Listar contatos" +
                    "\n4 - SAIR");

            try {
                opcao = Integer.parseInt(scan.nextLine());
                System.out.println();

                if (opcao > 0 && opcao <= 4) {
                    valido = true;
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("Entrada inválida. Tente novamente");
            }
        } while (!valido);

        return opcao;

    }

    public static void buscarContato(Scanner scanner, Agenda ag){
        if (!ag.agendaVazia()) {
            System.out.println("Digite o nome para busca: ");
            String nome = scanner.nextLine();
            try {
                System.out.println(ag.consultarContato(nome));

            } catch (ContatoNaoExisteException e) {
                System.out.println(e.getMessage(nome));
            }
        }
        else {
            System.out.println("Ainda não há nenhum contato na agenda.\n");
        }
    }

    public static void adicionarNovoContato(Scanner scanner, Agenda agenda){
            try {
                agenda.adicionarContato(scanner);
            } catch (AgendaCheiaExeption e) {
                System.out.println(e.getMessage());
            }
    }

    public static Agenda preencherAgenda(int tam){
        Agenda agenda = new Agenda(tam);
        Contato c1 = new Contato("Ana", "011");
        Contato c2 = new Contato("Bianca", "021");
        Contato c3 = new Contato("Carine", "031");
        Contato c4 = new Contato("Denise", "041");
        Contato c5 = new Contato("Emma", "051");
        try {
                agenda.adicionarContato(c1);
                agenda.adicionarContato(c2);
                agenda.adicionarContato(c3);
                agenda.adicionarContato(c4);
                agenda.adicionarContato(c5);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return agenda;
    }

}
