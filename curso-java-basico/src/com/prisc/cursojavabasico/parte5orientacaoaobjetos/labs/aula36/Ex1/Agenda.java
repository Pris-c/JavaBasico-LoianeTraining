package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula36.Ex1;

public class Agenda {
/*Escreva uma classe Agenda, que contém vários contatos do tipo Contato. Cada contato possui nome, telefone
e email. A Agenda também possui um nome. Crie um programa teste que peça para o usuário entrar com  o nome da
Agenda e em seguida 3 contatos. Crie métodos que retornem uma String com a informação de cada contato e também de
todos os contatos da agenda.*/

    private String nome;
    private Contato[] contatos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    /*Crie métodos que retornem uma String com a informação de cada contato e também de
    todos os contatos da agenda.*/

    public void listarContatos(){
        System.out.println("\nSeus contatos:\n");
        for (int i = 0; i < contatos.length; i++){
            System.out.println(contatos[i].getNome());
        }
    }

    public void listarInfosContatos(){
        System.out.println("\nInformações dos Contatos:\n");
        for (int i = 0; i < contatos.length; i++){
            System.out.println(contatos[i].getNome());
            System.out.println(contatos[i].getTelefone());
            System.out.println(contatos[i].getEmail());
            System.out.println("");
        }

    }



}
