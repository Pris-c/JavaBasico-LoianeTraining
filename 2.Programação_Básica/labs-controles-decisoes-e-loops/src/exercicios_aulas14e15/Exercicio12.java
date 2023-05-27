package exercicios_aulas14e15;

import java.util.Scanner;

public class Exercicio12 {
/*
Faça um programa para o cálculo de uma folha de pagamento,
sabendo que os descontos são do
Imposto de Renda, que depende do salário bruto (conforme tabela abaixo)
e 3% para o Sindicato
e que o FGTS corresponde a 11% do Salário Bruto,
mas não é descontado (é a empresa que deposita).
O Salário Líquido corresponde ao Salário
Bruto menos os descontos. O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.
o Desconto do IR:
o Salário Bruto até 900 (inclusive) - isento
o Salário Bruto até 1500 (inclusive) - desconto de 5%
o Salário Bruto até 2500 (inclusive) - desconto de 10%
o Salário Bruto acima de 2500 - desconto de 20%
Imprima na tela as informações, dispostas conforme o exemplo abaixo.

Salário Bruto: (5 * 220) : R$ 1100,00
(-) IR (5%) : R$ 55,00
(-) INSS ( 10%) : R$ 110,00
FGTS (11%) : R$ 121,00
Total de descontos : R$ 165,00
Salário Liquido : R$ 935,00


No exemplo o valor da hora é 5 e a quantidade de hora é 220.
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double valorH, hTrabalhadas, salBruto, salLiq;
        double taxaSind = 0.03d;
        double taxaFgts = 0.11d;
        double taxaInss = 0.10d;
        double taxaIr = 0;
        double ir, inss, sind, fgts, descontos = 0;

        System.out.println("CONTRA-CHEQUE");
        System.out.print("Digite o valor recebido por hora de trabalho: ");
        valorH = scan.nextDouble();
        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        hTrabalhadas = scan.nextDouble();

        salBruto = valorH * hTrabalhadas;

        if (salBruto <= 900){
            taxaIr = 0;
        } else if (salBruto <= 1500) {
            taxaIr = 0.05d;
        } else if (salBruto <= 2500) {
            taxaIr = 0.10d;
        } else {
            taxaIr = 0.20d;
        }

        ir = salBruto * taxaIr;
        inss = salBruto * taxaInss;
        sind = salBruto * taxaSind;
        fgts = salBruto * taxaFgts;

        descontos = ir + inss;              // + sind;
        salLiq = salBruto - descontos;


        System.out.println("-----------");
        System.out.println("Salário Bruto: (" + valorH + " * " + hTrabalhadas + "): R$ " + salBruto);
        System.out.println("(-) IR (" + (taxaIr*100) + "%): R$ " + (ir));
        System.out.println("(-) INSS (" + (taxaInss*100) + "%): R$ " + (inss));
        //System.out.println("(-) Sindicato (" + (taxaSind*100) + "%): R$ " + (sind));
        System.out.println("FGTS (" + (taxaFgts*100) + "): R$ " + fgts);
        System.out.println("Total de descontos: R$ " + descontos);
        System.out.println("Salário Liquido: R$ " + (salLiq));

    }
}
