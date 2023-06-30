package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas47a52.Res;

public class AgendaCheiaExeption extends Exception{

    @Override
    public String getMessage() {
        return "Agenda cheia. Não é possível adicionar novos contatos.\n";
    }
}
