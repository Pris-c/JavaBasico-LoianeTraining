package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula28a33;

public class ContaCorrenteEx2 {
        /*Cria uma classe para representar uma  conta corrente que possui  um número,
um saldo,  um status que  informa se ela é  especial ou não, um limite.*/

/*Desenvolva métodos para realizar saque (verificando se o cliente pode realizar
saques), despositar dinheiro, consultar saldo e  verificar se o cliente está usando
cheque especial ou não. Desenvolva um programa para testar essa classe.*/


    private int numConta;
    private  int agencia;
    private boolean especial;
    private double limiteEspecial;
    private double saldoEspecial;
    private double saldo;

    public ContaCorrenteEx2(){}
    public ContaCorrenteEx2(int numConta, int agencia, boolean especial, double limiteEspecial, double saldoEspecial, double saldo) {
        this.numConta = numConta;
        this.agencia = agencia;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.saldoEspecial = saldoEspecial;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getSaldoEspecial() {
        return saldoEspecial;
    }

    public void setSaldoEspecial(double saldoEspecial) {
        this.saldoEspecial = saldoEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }







    private boolean saldoComumSuficiente(int valorSaque){
        if (getSaldo() > valorSaque ){
            return true;
        } else {
            return false;
        }
    }
    private boolean saldoEspSuficiente(int valorSaque){
        if ( (getSaldo() + getSaldoEspecial()) > valorSaque ){
            return true;
        } else {
            return false;
        }
    }

    private void reduzirSaldo(double valor){
        setSaldo(getSaldo() - valor);
    }
    private void reduzirSaldoEsp(double valor){
        setSaldoEspecial(getSaldoEspecial() - valor);
    }

    private void adicinarValor(double deposito){
        setSaldo(getSaldo() + deposito);
    }



    public void sacar(int valor) {

        if (saldoComumSuficiente(valor)) {
            System.out.println("Valor sacado: R$" + valor);
            reduzirSaldo(valor);

        } else if (especial) {
            if ( saldoEspSuficiente(valor) ){
                reduzirSaldoEsp(valor - getSaldo());
                reduzirSaldo(getSaldo());
                System.out.println("Valor sacado R$" + valor);
            } else {
                System.out.println("Saldo insuficiente C. Especial");
            }
        } else {
            System.out.println("Saldo insuficiente na C.Corrente");
        }
    }


    public void depositar(double valor){
        adicinarValor(valor);
        System.out.println("Valor depositado: R$ " + valor );
    }

    public void consultarSaldo(){
        System.out.println("Saldo = "+ getSaldo());
    }

    void consultarUsoChequeEspecial(){
        if (this.saldoEspecial<this.limiteEspecial){
            System.out.println("O seu cheque especial está em uso");
        }
    }

    public void consultarSaldoChequeEsp(){
        System.out.println("Saldo C.Especial = R$ " + getSaldoEspecial());
    }

}
