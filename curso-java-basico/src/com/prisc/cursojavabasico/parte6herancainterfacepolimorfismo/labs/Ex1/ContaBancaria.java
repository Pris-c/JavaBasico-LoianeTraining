package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.Ex1;

public class ContaBancaria {

    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void sacar(double valorSaque){
        if (saldo<valorSaque){
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valorSaque;
            System.out.println("Saque efetuado com sucesso");
        }
    }

    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
        System.out.println("Depósito efetuado com sucesso.");
    }


    //@Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numConta='" + numConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
