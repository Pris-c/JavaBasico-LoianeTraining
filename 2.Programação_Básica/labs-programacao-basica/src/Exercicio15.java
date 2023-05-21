import java.util.Scanner;

public class Exercicio15 {
/*
Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados:
11% para Imposto de Renda,
8% para o INSS e
5% para o sindicato,  faça um programa que nos dê:
a. salário bruto.
b. quanto pagou ao INSS.
c. quanto pagou ao sindicato.
d. o salário líquido.

 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double valorHr;
        double horasTrab;

        System.out.println("CALCULA SALARIO E TAXAS");
        System.out.println("Quanto você ganha por hora?");
        valorHr = scan.nextDouble();
        System.out.println("Quantas horas você trabalhou no ultimo mês?");
        horasTrab = scan.nextDouble();

        double salarioBruto = valorHr * horasTrab;
        double ir = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sind = salarioBruto * 0.05;
        double descontos = ir + inss + sind;
        double salarioLiq = salarioBruto - descontos;

        System.out.println("O seu salário bruto foi R$: " + salarioBruto);
        //System.out.println("Você pagou: R$ " + ir + " de IR");
        System.out.println("Você pagou: R$ " + inss + " ao INSS");
        System.out.println("Você pagou: R$ " + sind + " ao sindicato");
        //System.out.println("Total de descontos: R$" + descontos);
        System.out.println("O seu salário liquido foi: R$ " + salarioLiq);

    }
}
