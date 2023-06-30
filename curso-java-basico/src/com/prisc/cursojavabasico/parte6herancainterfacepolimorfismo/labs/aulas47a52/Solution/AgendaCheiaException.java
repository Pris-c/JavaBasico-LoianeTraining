package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas47a52.Solution;

public class AgendaCheiaException extends Exception{

    @Override
    public String getMessage() {
        return "A agenda já está cheia!\n";
    }



}
