package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas47a52.Solution;

import java.util.Arrays;

public class Agenda {

    Contato[] contatos;

    public Agenda(){
        contatos = new Contato[5];
    }


    @Override
    public String toString() {
        String s = "";
        for (Contato c: contatos) {
            if (c != null) {
                s += c.toString();
            }
        }
         return s;
    }


    public void adicionarContato(Contato c) throws AgendaCheiaException {
        boolean cheia = true;
                                                    /* boolean cheia = false;
                                                    if (c.getId() > this.contatos.length){
                                                        throw new AgendaCheiaException();
                                                    } else {
                                                        this.contatos[c.getId()] = c;
                                                    }*/
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

    public int consultarContato(String nome) throws ContatoNaoExisteException{
        for (Contato c: contatos) {
            if (c != null){
                if (c.getNome().equalsIgnoreCase(nome)){
                    return c.getId();
                }
            }
        }
        throw new ContatoNaoExisteException(nome);
    }




}
