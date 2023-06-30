package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas47a52.Res;

import com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas47a52.Solution.AgendaCheiaException;

import java.util.Arrays;
import java.util.Scanner;

public class Agenda {

    private Contato[] contatos;

    public Agenda() {}
    public Agenda(int tam){
        this.contatos = new Contato[tam];
    }

    public int getLenght() {
        return contatos.length;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public boolean agendaCheia() {
        boolean cheia = true;
        for (int i=0; i<contatos.length; i++) {
            if (contatos[i] == null){
                cheia = false;
                break;
            }
        }
        return cheia;
    }

    public void adicionarContato(Scanner scanner) throws AgendaCheiaExeption{
        if (!agendaCheia()) {
        System.out.println("Entre com as informações do novo contato:");
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Telefone");
        String telefone = scanner.nextLine();

        Contato contato = new Contato(nome, telefone);


            for (int i = 0; i < contatos.length; i++) {
                if (contatos[i] == null) {
                    contatos[i] = contato;
                    break;
                }
            }
        } else {
            throw new AgendaCheiaExeption();
        }
    }




    public void adicionarContato(Contato c) throws AgendaCheiaException {
        boolean cheia = true;
        for (int i=0; i<contatos.length; i++){
            if (contatos[i] == null){
                contatos[i] = c;
                cheia = false;
                break;
            }
        }
        if (cheia) {
            throw new  AgendaCheiaException();
        }
    }

    public boolean agendaVazia() {
        boolean vazia = true;
        for (int i=0; i<contatos.length; i++) {
            if (contatos[i] != null){
                vazia = false;
                break;
            }
        }
        return vazia;
    }

    public Contato consultarContato(String nome) throws ContatoNaoExisteException{
            if (contatos != null) {
                for (Contato c : contatos) {

                    if ((c != null) && c.getNome().equalsIgnoreCase(nome)) {
                        return c;
                    }
                }
        } else {
            System.out.println("A agenda está vazia.");
            throw new ContatoNaoExisteException();
        }
            throw new ContatoNaoExisteException();
    }


    @Override
    public String toString() {
        String s = "";
        if(contatos != null) {
            for (Contato c : contatos) {
                if (c != null) {
                    s += c.toString();
                }
            }
        }
        if (s.equalsIgnoreCase("")){
            s = "A agenda está vazia.\n";
        }
        return s;
    }
}
