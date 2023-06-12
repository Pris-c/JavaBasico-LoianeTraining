package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.Ex1;

public class ContaEspecial extends ContaBancaria{

    private double limite;


    public void sacar(double valorSaque){
        if ((super.getSaldo() + this.limite) < valorSaque){
            System.out.println("Saldo insuficiente");
        } else if (super.getSaldo() >= valorSaque){
            super.setSaldo( super.getSaldo() - valorSaque);
            System.out.println("Saque efetuado com sucesso");
        } else {
            this.limite -= (valorSaque - super.getSaldo());
            super.setSaldo( super.getSaldo() - super.getSaldo());
        }
    }


    public ContaEspecial() {
    }

    public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + limite +
                "} " + super.toString();
    }
}
