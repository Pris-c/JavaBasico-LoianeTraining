package exercicios_aulas14e15;

import java.util.Scanner;

import static java.lang.System.exit;

public class Exercicio19 {
/*
Faça um Programa que leia um número inteiro menor que 1000 e
imprima a quantidade de centenas, dezenas e unidades do mesmo.
o Observando os termos no plural a colocação do "e", da vírgula
entre outros. Exemplo:
o 326 = 3 centenas, 2 dezenas e 6 unidades
o 12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320,
310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = 0, n2, centena = 0, dezena = 0, unidade = 0;
        String cent ="centena", dez = "dezena", un = "unidade";


        System.out.println("SEPARA UNIDADES");
        System.out.print("Digite um numero inteiro positivo e menor do que 1000: ");
        n = scan.nextInt();

        if ((n > 0) && (n < 1000)) {

                centena = n / 100;
                n = n % 100;

                dezena = n / 10;
                n = n % 10;

                unidade = n;

            //c = 0;
            if (centena == 0){

                // c=0 d=0
                if (dezena == 0){

                    //c=0 d=0 u=0
                    if (unidade == 0){
                        System.out.println("0 unidade.");
                        //c=0 d=0 u=1
                    } else if (unidade == 1) {
                        System.out.println("1 unidade.");
                        //c=0 d=0 u>1
                    } else {
                        System.out.println(unidade + " unidades.");
                    }
                }

                //c=0 d=1
                else if (dezena == 1) {
                    //c=0 d=1 u=0
                    if (unidade == 0){
                        System.out.println("1 dezena.");
                        //c=0 d=1 u=1
                    } else if (unidade == 1) {
                        System.out.println("1 dezena e 1 unidade.");
                        //c=0 d=1 u>1
                    } else {
                        System.out.println("1 dezena e " + unidade + " unidades.");
                    }
                }
                //c=0 d>1
                else{
                    //c=0 d>1 u=0
                    if (unidade == 0){
                        System.out.println(dezena + " dezenas");
                        //c=0 d>1 u=1
                    } else if (unidade == 1) {
                        System.out.println(dezena + " dezenas e 1 unidade.");
                        //c=0 d>1 u>1
                    } else {
                        System.out.println(dezena + " dezenas e " + unidade + " unidades.");
                    }
                }
            }
            //c=1
            else if (centena == 1){
                //c=1 d=0
                if (dezena == 0){

                    //c=1 d=0 u=0
                    if (unidade == 0){
                        System.out.println("1 centena.");
                        //c=1 d=0 u=1
                    } else if (unidade == 1) {
                        System.out.println("1 centena e 1 unidade.");
                        //c=1 d=0 u>1
                    } else {
                        System.out.println("1 centena e " + unidade + " unidades.");
                    }
                }

                //c=1 d=1
                else if (dezena == 1) {
                    //c=1 d=1 u=0
                    if (unidade == 0){
                        System.out.println("1 centena e 1 dezena.");
                        //c=1 d=1 u=1
                    } else if (unidade == 1) {
                        System.out.println("1 centena 1 dezena e 1 unidade.");
                        //c=1 d=1 u>1
                    } else {
                        System.out.println("1 centena 1 dezena e " + unidade + " unidades.");
                    }
                }
                //c=1 d>1
                else{
                    //c=1 d>1 u=0
                    if (unidade == 0){
                        System.out.println("1 centena e " + dezena + " dezenas");
                        //c=1 d>1 u=1
                    } else if (unidade == 1) {
                        System.out.println("1 centena " + dezena + " dezenas e 1 unidade.");
                        //c=1 d>1 u>1
                    } else {
                        System.out.println("1 centena " + dezena + " dezenas e " + unidade + " unidades.");
                    }
                }
            }
            //c>1
            else {
                //c>1 d=0
                if (dezena == 0){

                    //c>1 d=0 u=0
                    if (unidade == 0){
                        System.out.println(centena + " centenas.");
                        //c>1 d=0 u=1
                    } else if (unidade == 1) {
                        System.out.println(centena + " centenas e 1 unidade.");
                        //c>1 d=0 u>1
                    } else {
                        System.out.println(centena + " centenas e " +  unidade + " unidades.");
                    }
                }

                //c>1 d=1
                else if (dezena == 1) {
                    //c>1 d=1 u=0
                    if (unidade == 0){
                        System.out.println(centena + " centenas e 1 dezena.");
                        //c>1 d=1 u=1
                    } else if (unidade == 1) {
                        System.out.println(centena + " centenas 1 dezena e 1 unidade.");
                        //c>1 d=1 u>1
                    } else {
                        System.out.println(centena + " centenas 1 dezena e " + unidade + " unidades.");
                    }
                }
                //c>1 d>1
                else{
                    //c>1 d>1 u=0
                    if (unidade == 0){
                        System.out.println(centena + " centenas e " + dezena + " dezenas");
                        //c>1 d>1 u=1
                    } else if (unidade == 1) {
                        System.out.println(centena + " centenas" + dezena + " dezenas e 1 unidade.");
                        //c>1 d>1 u>1
                    } else {
                        System.out.println(centena + " centenas " + dezena + " dezenas e " + unidade + " unidades.");
                    }
                }

            }
        }
        System.out.println("Número fora do intervalo");
    }
}
