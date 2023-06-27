package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas47a52;

import java.util.Scanner;

public class Teste {
/*Crie uma classe Teste que informe um menu ao  usuário:
1- para consultar um contato da agenda e
2– para adicionar um contato na agenda.*/


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String opcao;

        Agenda aPessoal = new Agenda(initContatos(4));



        do {
            System.out.println("Escolha a opção desejada:\n"
                                +"1 - Consultar um contato na agenda.\n"
                                +"2 - Adicionar um contato na agenda.\n"
                                +"0 - Sair");
            opcao = scan.nextLine();
            System.out.println();

            switch (opcao){
                case "1": //Consultar contato
                    if (aPessoal.getCont()!=0) {

                        System.out.println("Qual informação você utilizará para a consulta:"
                                + "\n1 - ID"
                                + "\n2 - Nome"
                                + "\n3 - Telefone");
                        opcao = scan.nextLine();

                        switch (opcao) {

                            case "1":
                                int id;
                                System.out.print("ID a ser consultado: ");
                                id = scan.nextInt();
                                aPessoal.consultarContatoById(id);
                                break;
                            case "2":
                                String nome;
                                System.out.print("Nome a ser consultado: ");
                                nome = scan.nextLine();
                                aPessoal.consultarContatoByNome(nome);
                                break;
                            case "3":
                                String tel;
                                System.out.print("Telefone a ser consultado: ");
                                tel = scan.next();
                                aPessoal.consultarContatoByTelefone(tel);
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    } else {
                        System.out.println("Ainda não foi adicionado nenhum contato à Agenda.\n");
                    }
                    break;


                case "2": //Adicionar contato
                    System.out.println("Nome: ");
                    String nome = scan.nextLine();
                    System.out.println(nome);

                    System.out.print("Telefone: ");
                    String tel = scan.nextLine();
                    System.out.println(tel);
                    aPessoal.adicionarContato(nome, tel);

                    //System.out.println(aPessoal.toString());
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (!opcao.equals("0"));







        /*


        aPessoal.adicionarContato("Ana", "1198989898");
        aPessoal.adicionarContato("Beatriz", "2265656565");
        aPessoal.adicionarContato("Carla", "3312121212");
        aPessoal.adicionarContato("Diego", "4475757575");

        aPessoal.adicionarContato("Emilio", "5504040404");

  *//*      for (Contato c: aPessoal.getContatos()) {
            System.out.println(c.toString());
        }*//*

        //System.out.println(aPessoal.consultarContatoById(7));
        //System.out.println(aPessoal.consultarContatoByNome("Bianca"));
        //System.out.println(aPessoal.consultarContatoByTelefone("44"));
*/



    }

    public static Contato[] initContatos(int agendaLength){
        Contato[] contatos = new Contato[agendaLength];
        for (int i =0; i<agendaLength; i++){
            contatos[i] = new Contato();
        }
        return contatos;
    }


}
