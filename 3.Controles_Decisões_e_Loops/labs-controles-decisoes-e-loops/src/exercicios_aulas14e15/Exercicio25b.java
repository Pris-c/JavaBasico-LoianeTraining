package exercicios_aulas14e15;

import java.util.Scanner;

import static java.lang.System.exit;

public class Exercicio25b {
/*
Faça um programa que faça 5 perguntas para uma pessoa sobre um
crime. As perguntas são:
. "Telefonou para a vítima?"
a. "Esteve no local do crime?"
b. "Mora perto da vítima?"
c. "Devia para a vítima?"
d. "Já trabalhou com a vítima?" O programa deve no final emitir
uma classificação sobre a participação da pessoa no crime.
Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
como "Assassino". Caso contrário, ele será classificado como
"Inocente".
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String resp;
        int cont = 0;
        boolean isValid = true;

        System.out.println("Questionário");

        //Pergunta 1
        System.out.println("Você telefonou para a vítima?");
        System.out.println("(s) - sim    (n) - não");
        resp = scanner.next();
        if (resp.equalsIgnoreCase("n")   || resp.equalsIgnoreCase("s")) {
            if (resp.equalsIgnoreCase("s")) {
                cont++;
            }

            //Pergunta 2
            System.out.println("Esteve no local do crime?");
            System.out.println("(s) - sim    (n) - não");
            resp = scanner.next();
            if (resp.equalsIgnoreCase("n")   || resp.equalsIgnoreCase("s")) {
                if (resp.equalsIgnoreCase("s")) {
                    cont++;
                }

                //Pergunta 3
                System.out.println("Mora perto da vítima?");
                System.out.println("(s) - sim    (n) - não");
                resp = scanner.next();
                if (resp.equalsIgnoreCase("n")   || resp.equalsIgnoreCase("s")) {
                    if (resp.equalsIgnoreCase("s")) {
                        cont++;
                    }

                    //Pergunta 4
                    System.out.println("Devia para a vítima?");
                    System.out.println("(s) - sim    (n) - não");
                    resp = scanner.next();
                    if (resp.equalsIgnoreCase("n")   || resp.equalsIgnoreCase("s")) {
                        if (resp.equalsIgnoreCase("s")) {
                            cont++;
                        }

                        //Pergunta 5
                        System.out.println("Já trabalhou com a vítima?");
                        System.out.println("(s) - sim    (n) - não");
                        resp = scanner.next();
                        if (resp.equalsIgnoreCase("n")   || resp.equalsIgnoreCase("s")) {
                            if (resp.equalsIgnoreCase("s")) {
                                cont++;
                            }

                            //Pergunta 5
                        } else{
                            isValid = false;
                        }


                        //Pergunta 4
                    } else{
                        isValid = false;
                    }

                    //Pergunta 3
                } else{
                    isValid = false;
                }

                //Pergunta 2
            } else{
                isValid = false;
            }

            //Pergunta 1
        } else{
            isValid = false;
        }


        if (isValid) {
            if (cont < 2) {
                System.out.println("Inocente");
            } else if (cont == 2) {
                System.out.println("Suspeita");
            } else if (cont <= 4) {
                System.out.println("Cumplice");
            } else {
                System.out.println("Assassina");
            }
        } else {
            System.out.println("Resposta inválida.");
        }

    }
}
