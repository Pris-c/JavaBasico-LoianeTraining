package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs;

public class TesteContaCorrente {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.numConta = 12345;
        conta.agencia = 100;
        conta.saldo = 10.50;
        conta.limiteEspecial = 2000;
        conta.saldoEspecial = conta.limiteEspecial;
        conta.especial = true;

        conta.consultarSaldo();
        conta.depositar(1200.00);
        conta.consultarSaldo();
        conta.sacar(200);
        conta.consultarSaldo();
        conta.sacar(1300);
        conta.consultarSaldo();

        ///conta.sacar(400);
        //conta.consultarUsoChequeEspecial();

    }
}
