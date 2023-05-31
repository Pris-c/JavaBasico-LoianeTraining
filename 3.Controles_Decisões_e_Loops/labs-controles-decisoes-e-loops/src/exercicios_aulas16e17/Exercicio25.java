package exercicios_aulas16e17;

import java.util.Scanner;

public class Exercicio25 {

/*Faça um programa que peça para n pessoas a sua idade, ao final o
programa devera verificar se a média de idade da turma varia entre 0 e
25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta
ou idosa, conforme a média calculada.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idade;
        int soma = 0;
        int cont = 0;
        double media = 0;

        System.out.println("FAIXA ETÁRIA DA TURMA");

        do {
            System.out.println("Digite a idade de um aluno ou (0) para encerrar: ");
            idade = sc.nextInt();

            if ( (idade < 0) || (idade > 150)){
                System.out.println("Idade inválida");
            } else {
                soma += idade;
                cont++;
            }

        } while ( idade != 0 );

        media = soma / (cont-1);
        //System.out.println("soma = " + soma + " cont = " + cont);
        //System.out.println(media);

        if (media <= 25){
            System.out.println("Turma Jovem.");
        } else if (media <= 60 ){
            System.out.println("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }

    }

}
