package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula25a27;

public class ContaCorrente {
    /*Cria uma classe para representar uma  conta corrente que possui  um número,
um saldo,  um status que  informa se ela é  especial ou não, um limite.*/

/*Desenvolva métodos para realizar saque (verificando se o cliente pode realizar
saques), despositar dinheiro, consultar saldo e  verificar se o cliente está usando
cheque especial ou não. Desenvolva um programa para testar essa classe.*/


    int numConta;
    int agencia;
    boolean especial;
    double limiteEspecial;
    double saldoEspecial;
    double saldo;

    void sacar(double valor) {
        if (saldo > valor) {
            System.out.println("Valor sacado: R$" + valor);
            saldo -= valor;
        } else if (especial) {
            if ( (saldoEspecial+saldo) > valor) {
                saldoEspecial -= (valor-saldo);
                saldo = 0;
                System.out.println("Valor sacado do limite especial: R$" + valor);
            }
        } else {
                System.out.println("Saldo insuficiente");
        }
    }

    void depositar(double valor){
        System.out.println("Valor depositado: R$ " + valor );
        saldo+=valor;
    }

    void consultarSaldo(){
        if (saldo>=0) {
            System.out.println("Saldo atual: R$ " + saldo);
        } else if (especial){
            if (saldoEspecial>0){
                System.out.println("Voce está usando o seu Cheque Especial!");
                System.out.println("Saldo Cheque Especial: R$ " + saldoEspecial);
            }
        }
    }

    void consultarUsoChequeEspecial(){
        if (saldoEspecial<limiteEspecial){
            System.out.println("O seu cheque especial está em uso");
        }
    }

    double checarChequeEsp(){
        return saldoEspecial;
    }


}
