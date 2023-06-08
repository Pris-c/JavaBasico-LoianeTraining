package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula14e15;

import java.util.Scanner;

public class Exercicio11 {
/*
As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
o Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o
aumento ser realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento.
 */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double salario, reajuste;

        System.out.println("CALCULO DE REAJUSTE SALARIAL");
        System.out.print("Salário atual: ");
        salario = scanner.nextDouble();


        if ( (salario > 0) && (salario <= 280)){
            reajuste = 0.2d;
        } else if (salario < 700) {
            reajuste = 0.15d;
        } else if (salario < 1500) {
            reajuste = 0.1d;
        } else {
            reajuste = 0.05d;
        }

        System.out.println("Salário atual = R$ " + salario);
        System.out.println("Percentual de aumento aplicado = " + (reajuste*100) + "%");
        System.out.println("Valor do aumento = R$ " + (salario*reajuste));
        System.out.println("Salário após aumento = R$ " + salario * (1+reajuste));

    }
}
