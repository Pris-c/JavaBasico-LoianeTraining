package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula14e15;

import java.util.Scanner;

public class Exercicio24 {
/*
Faça um Programa que leia 2 números e em seguida pergunte ao
usuário qual operação ele deseja realizar. O resultado da operação
deve ser acompanhado de uma frase que diga se o número é:
a. par ou ímpar;
b. positivo ou negativo;
c. inteiro ou decimal.
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double n1, n2, n3;
        char operacao;
        boolean isValid = true;
        double  result = 0;
        String par = "impar";
        String positivo = "negativo";
        String inteiro = "decimal";

        System.out.println("REALIZA OPERAÇÕES MATEMÁTICAS");
        System.out.print("Digite o primeiro numero: ");
        n1 = scan.nextDouble();
        System.out.print("Digite o segundo numero: ");
        n2 = scan.nextDouble();
        System.out.println("Qual operação deseja realizar?");
        System.out.println("(+) soma");
        System.out.println("(-) subtração");
        System.out.println("(*) multiplicação");
        System.out.println("(/) divisão");
        operacao = scan.next().charAt(0);


        switch (operacao){

            case '+': result = n1 + n2; break;
            case '-': result = n1 - n2; break;
            case '*': result = n1 * n2; break;
            case '/': result = n1 / n2; break;
            default:
                isValid = false;
                System.out.println("Operação inválida.");
        }

        if(isValid){
            //teste inteiro
            n3 = Math.ceil(result);
            if (result == n3){
                inteiro = "inteiro";
                //teste par
                if ((result % 2) == 0 ){
                    par = "par";
                }
            }

            //teste positivo
            if (result == 0){
                par = "nulo";
            } else if (result > 0) {
                positivo = "positivo";

            }

            System.out.println("O resultado é: " + result);
            if (inteiro == "inteiro"){
                System.out.println(par + ", " + positivo + " , e " + inteiro);
            } else {
                System.out.println(positivo + ", e " + inteiro);
            }
        }


    }
}
