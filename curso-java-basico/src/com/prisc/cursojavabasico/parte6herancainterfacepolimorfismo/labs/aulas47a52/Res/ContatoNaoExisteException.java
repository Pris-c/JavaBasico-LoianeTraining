package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas47a52.Res;

public class ContatoNaoExisteException extends Exception{

    public String getMessage(String nome) {
        return  "Contato " + nome + " não existe na agenda.\n";

    }
}
