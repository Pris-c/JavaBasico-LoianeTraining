package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas47a52.Solution;

public class ContatoNaoExisteException extends Exception{
    private String nome;

    public ContatoNaoExisteException (String nome){
        this.nome = nome;
    }

    @Override
    public String getMessage() {
        return "Contato " + nome + " não existe na agenda!";
    }
}
