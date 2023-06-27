package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.aula52;

public class DivisaoNaoExata extends Exception{

    private int num;
    private int denom;

    public DivisaoNaoExata(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }

    @Override
    public String toString() {
        return "Resultado de " + num + "/" + denom + " não é um inteiro.";
    }
}
