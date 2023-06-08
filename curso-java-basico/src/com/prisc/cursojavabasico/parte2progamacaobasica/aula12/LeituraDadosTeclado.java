package com.prisc.cursojavabasico.parte2progamacaobasica.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*System.out.println("Digite seu nome completo:");
        String nomeCompleto = scan.nextLine();              //Lê toda a linha
        System.out.println("Nome Completo: " + nomeCompleto);*/

        /*
        System.out.println("Digite seu primeiro nome:");
        String primeiroNome = scan.next();                  //Lê apenas a primeira informação
        //System.out.println("Primeiro Nome: " + primeiroNome);

        System.out.println("Digite a sua idade:");
        int idade = scan.nextInt();
        //System.out.println("Sua idade é: " + idade);

        System.out.println("Digite a sua altura:");
        double altura = scan.nextDouble();              //Entrada com ","
        System.out.println("Sua altura é: " + altura);

        System.out.println(primeiroNome + " tem " + idade + " anos e mede " + altura + "m");
        */

        System.out.println("Digite: Nome, Idade, Numero de filhos, Altura e se tem animal de estimação (true ou false):");
        String nome = scan.next();
        int idade = scan.nextInt();
        byte nFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();

        System.out.println("Foram informados os seguintes dados:");
        System.out.println("Nome: " + nome
                            +"\nIdade: " + idade
                            +"\nNumero de filhos: " + nFilhos
                            +"\nAltura: " + altura
                            +"\nTem animal de estimação: " + temPet);

    }
}
