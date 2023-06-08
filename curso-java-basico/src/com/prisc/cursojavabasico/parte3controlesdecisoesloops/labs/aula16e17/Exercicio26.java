package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio26 {
/*
* Numa eleição existem três candidatos. Faça um programa que peça o
número total de eleitores. Peça para cada eleitor votar e ao final
mostrar o número de votos de cada candidato.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ELEIÇÕES");
        System.out.print("Digite o numero de eleitores: ");
        int nEleitores = scanner.nextInt();
        int voto;
        int votoNulo = 0;
        int voto10 = 0;
        int voto20 = 0;
        int voto30 = 0;


        for (int i = 0; i < nEleitores; i++){

            System.out.println("Voto do eleitor " + (i+1) + ": ");
            System.out.println("(10) - Candidato Padre");
            System.out.println("(20) - Padre Kelson");
            System.out.println("(30) - Padre Kleber");
            voto = scanner.nextInt();


            if ( (voto==10) || (voto==20) || (voto==30)){
                switch (voto){
                    case 10: voto10++; break;
                    case 20: voto20++; break;
                    case 30: voto30++; break;
                }

            }else{
                votoNulo++;
            }
        }

        System.out.println("----------");
        System.out.println("Contagem de votos:");
        System.out.println("Candidato Padre: " + voto10);
        System.out.println("Padre Kelson: " + voto20);
        System.out.println("Padre Kleber: " + voto30);
        System.out.println("Votos nulos: " + votoNulo);

    }
}
