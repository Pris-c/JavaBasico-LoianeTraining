package aula19;

import java.util.Scanner;

public class Exercicio19 {
    /*Ler as duas notas bimestrais para um conjunto de 10 alunos.
Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
tipo real. Escreva um programa que calcule a média aritmética simples
das notas informadas armazenando o resultado em um vetor “Result”
de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
estará “aprovado”, caso contrário, a situação do aluno será
“reprovado”.*/

    public static void main(String[] args) {

        double[] notas1 = new double[10];
        double[] notas2 = new double[notas1.length];
        double[] result = new double[notas1.length];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i< notas1.length; i++) {
            System.out.println("Aluno " + (i + 1));
            System.out.println("Insira a primeira nota: ");
            notas1[i] = scanner.nextDouble();
            System.out.println("Insira a segunda nota: ");
            notas2[i] = scanner.nextDouble();

        }

        for (int i = 0; i<notas1.length; i++) {
            result[i] = (notas1[i] + notas2[i]) / 2;
            System.out.println("Média do aluno " + (i + 1) + " = " + result[i]);

            if (result[i] >= 7) {
                System.out.println("Aluno " + (i + 1) + " aprovado!");
            } else {
                System.out.println("Aluno " + (i + 1) + " reprovado!");
            }
        }

    }
}
