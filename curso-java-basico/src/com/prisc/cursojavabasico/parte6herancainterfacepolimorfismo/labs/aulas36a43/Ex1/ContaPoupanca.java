package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas36a43.Ex1;

public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;




    public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public ContaPoupanca() {
    }


    public double calcularNovoSaldo(double taxaRendimento){
        double novoSaldo = ( super.getSaldo() +  ((taxaRendimento/100)*super.getSaldo()));
        super.setSaldo(novoSaldo);
        return novoSaldo;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }


    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "diaRendimento=" + diaRendimento +
                "} " + super.toString();
    }
}
