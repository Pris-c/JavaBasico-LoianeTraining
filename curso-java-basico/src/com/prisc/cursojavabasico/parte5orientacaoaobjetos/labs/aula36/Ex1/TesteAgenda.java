package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula36.Ex1;

import java.util.Scanner;

public class TesteAgenda {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        Contato[] contatos = new Contato[3];

        /*Crie um programa teste que peça para o usuário entrar com  o nome da
        Agenda e em seguida 3 contatos*/

        System.out.println("Digite o nome da Agenda: ");
        String nomeAgenda = scan.nextLine();

        for (int i = 0; i < contatos.length; i++){
            System.out.println("CONTATO " + (i+1));

            Contato contato = new Contato();
            System.out.print("Nome: ");
            contato.setNome(scan.nextLine());

            System.out.print("Telefone: ");
            contato.setTelefone(scan.nextLine());

            System.out.print("E-mail: ");
            contato.setEmail(scan.nextLine());

            contatos[i] = contato;
        }

        agenda.setContatos(contatos);

        agenda.listarContatos();
        System.out.println("\n");
        agenda.listarInfosContatos();





    }

}
