package exercicios_aulas14e15;

import java.util.Scanner;

import static java.lang.System.exit;

public class Exercicio18 {
/*
Faça um Programa que peça uma data no formato dd/mm/aaaa e
determine se a mesma é uma data válida.
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String data;
        int dia, mes, ano;
        String validade = "inválida";

        System.out.println("VALIDADOR DE DATA");
        System.out.println("Digite uma data no formato dd/mm/aaaa");
        data = scanner.nextLine();

        String[] data2 = data.split("/", 3);

       if(data2[0].length() == 2 &&
          data2[1].length() == 2 &&
          data2[2].length() == 4)  {

               dia = Integer.parseInt(data2[0]);
               mes = Integer.parseInt(data2[1]);
               ano = Integer.parseInt(data2[2]);

               if ((ano>0) && (mes>0) && (dia>0)) {

                   switch (mes) {
                       case 4:
                       case 6:
                       case 9:
                       case 11:
                           if (dia <= 30) {
                               validade = "válida";
                           }
                           break;
                       case 1:
                       case 3:
                       case 5:
                       case 7:
                       case 8:
                       case 10:
                       case 12:
                           if (dia <= 31) {
                               validade = "válida";
                           }
                           break;

                       case 2:
                           if ((((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0))    //ano bissexto
                                   && (dia <= 29)) {
                               validade = "válida";
                           } else if (dia < 28) {
                               validade = "válida";
                           }
                           break;
                   }
               }

            System.out.println("A data digitada é " + validade);

       } else {
           System.out.println("Formato inválido");
       }

    }
}
