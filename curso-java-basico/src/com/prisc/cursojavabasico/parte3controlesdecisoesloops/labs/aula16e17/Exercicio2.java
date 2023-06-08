package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio2 {
/*
Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.
 */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userName;
        String password;
        boolean valid = false;

        do {
            System.out.println("Digite seu nome de usuário: ");
            userName = scan.next();
            System.out.println("Digite sua senha: ");
            password = scan.next();

            if (userName.equals(password)) {
                System.out.println("Erro! Senha deve ser diferente do nome de usuário.");
            } else {
                valid = true;
                System.out.println("Login efetuado");
            }
        } while (!valid);

    }
}