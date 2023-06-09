package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula28a33;

public class TesteContaCorrenteEx2 {

    public static void main(String[] args) {

        ContaCorrenteEx2 conta = new ContaCorrenteEx2();
        conta.setSaldo(2000.00);
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
        conta.setSaldoEspecial(500);

        conta.consultarSaldo();
        conta.consultarSaldoChequeEsp();

        conta.sacar(500);
        conta.consultarSaldo();

        conta.depositar(100);
        conta.consultarSaldo();
        conta.consultarSaldoChequeEsp();

        conta.sacar(1900);
        conta.consultarSaldo();
        conta.consultarSaldoChequeEsp();



    }
}
