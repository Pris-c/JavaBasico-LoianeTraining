package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas47a52.Solution;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao = 1;

        do {
            opcao = obterOpcaoMenu(scan);

            switch (opcao) {
                //Consultar contato
                case 1: novaConsultaContato(scan, agenda); break;
                //Adicionar contato
                case 2: novaAdicaoContato(scan, agenda); break;
                //Finaliza programa
                case 3: System.exit(0);
            }

        } while (opcao!=3);

    }




    //Métodos
    public static int obterOpcaoMenu(Scanner scan){

        boolean entradaValida = false;
        int opcao = 0;

        while(!entradaValida) {

            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Consultar contato ");
            System.out.println("2 - Adicionar contato ");
            System.out.println("3 - SAIR ");


            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 1   ||    opcao <= 3){
                    entradaValida = true;
                } else{
                    throw new Exception("Opçao inválida.\n");
                }

            } catch (Exception e){
                System.out.println("Entrada inválida. Digite a opçao novamente.\n");
            }

        }
        return opcao;
    }



    public static String lerInformacaoString(Scanner scan, String msg){
        System.out.println(msg);
        String entrada = scan.nextLine();

        return entrada;
    }


    public static void novaConsultaContato(Scanner scan, Agenda agenda){
        try {
            String nomeContato = lerInformacaoString(scan, "Entre com o nome do contato a ser pesquisado:");
            if (agenda.consultarContato(nomeContato)>0){
                System.out.println("Contato existe.");
            }
        } catch (ContatoNaoExisteException e){
            System.out.println(e.getMessage());
        }
    }


    public static void novaAdicaoContato(Scanner scan, Agenda agenda){
        try{
            System.out.println("Criando um contato, entre com as informações:");
            String nome = lerInformacaoString(scan, "Nome: ");
            String telefone = lerInformacaoString(scan, "Telefone: ");
            String email = lerInformacaoString(scan, "E-mail: ");

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setTelefone(telefone);
            contato.setEmail(email);

            System.out.println("Contato a ser adicionado: ");
            System.out.println(contato);

            agenda.adicionarContato(contato);

        } catch (AgendaCheiaException e){
            System.out.println(e.getMessage());

            System.out.println("Contatos da agenda: ");
            System.out.println(agenda);
        }
    }






}
