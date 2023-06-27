package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas36a43.Ex1;

public class TesteContas {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Pedro", "100010", 5000.00 );
        ContaPoupanca poupanca = new ContaPoupanca("Paulo", "200020", 3000.00, 5);
        ContaEspecial especial = new ContaEspecial("Peter", "300030", 2000.00, 2000.00);

    /*    System.out.println("Conta Corrente");
        System.out.println(conta.getSaldo());
        conta.sacar(2000.50);
        System.out.println(conta.getSaldo());
        conta.depositar(250.90);
        System.out.println(conta.getSaldo());

        System.out.println("\nConta Poupança");
        System.out.println(poupanca.getSaldo());
        poupanca.sacar(500);
        System.out.println(poupanca.getSaldo());
        poupanca.depositar(700.56);
        System.out.println(poupanca.getSaldo());
        poupanca.calcularNovoSaldo(15);
        System.out.println(poupanca.getSaldo());


        System.out.println("\nConta Especial");
        System.out.println(especial.getSaldo());
        especial.sacar(3000);
        System.out.println(especial.getSaldo());
        especial.depositar(1500);
        System.out.println(especial.getSaldo());*/

        System.out.println(conta.toString());
        System.out.println(poupanca.toString());
        System.out.println(especial.toString());




    }
}
