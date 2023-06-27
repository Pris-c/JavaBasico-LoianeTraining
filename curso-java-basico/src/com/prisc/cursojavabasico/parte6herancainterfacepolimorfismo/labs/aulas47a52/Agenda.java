package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas47a52;

import java.util.Arrays;
import java.util.LinkedList;

public class Agenda {
/*	Crie	uma	classe Agenda	que	irá	funcionar	para	gerenciar	os	Contatos.
Essa	classe	precisa de	ter	um	método	para	adicionar	um	Contato	e	também	para	consultar.*/

/*Se o contato não existir, o programa deve lançar uma exceção de ContatoNaoExisteException.
Caso a agenda esteja cheia quando o usuário quiser adicionar um novo contato, o programa deve
lançar uma exceção AgendaCheiaExeption.*/


    private Contato[] contatos;
    private Contato contato;
    private int cont;



    public Agenda(Contato[] contatos) {
        this.contatos = contatos;
        this.cont = 0;
    }

    public void adicionarContato(String nome, String telefone){
        contato = new Contato();
        contato.setId(cont);
        contato.setNome(nome);
        contato.setTelefone(telefone);

        if (this.cont < this.contatos.length) {
            contatos[contato.getId()] = contato;
            cont++;

        } else {
            System.out.println("AGENDA CHEIA!" +
                    "\nO contato " +contato.getNome()+ " "+ contato.getTelefone() +
                   "\nnão foi adicionado!");
        }

    }

    public void consultarContatoById(int id){
        for (Contato c: contatos) {
            if (c.getId() == id) {
                System.out.println(c.toString()+"\n");
                return;
            }
        }

        System.out.println("ID=" + id + " não encontrado.\n");
    }
    public void consultarContatoByNome(String nome){
        boolean found = false;
        for (Contato c: contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                System.out.println(c.toString()+"\n");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Nome " + nome + " não encontrado.\n");
        }
    }
    public void consultarContatoByTelefone(String telefone){
        boolean found = false;
        for (Contato c: contatos) {
            if (c.getTelefone().equalsIgnoreCase(telefone)) {
                System.out.println(c.toString()+"\n");
                found=true;
                break;
            }
        }
        if (!found) {
            System.out.println("Telefone " + telefone + " não encontrado.\n");
        }
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    @Override
    public String toString() {

        String text = "";
            for (Contato c: this.contatos) {
                text += c.toString()+"\n---------";
        };
            return text;
    }
}
