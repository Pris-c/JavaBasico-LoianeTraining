package com.prisc.cursojavabasico.parte3controlesdecisoesloops.labs.aula16e17;

import java.util.Scanner;

public class Exercicio40 {
/*Foi feita uma estatística em cinco cidades brasileiras para coletar
dados sobre acidentes de trânsito. Foram obtidos os seguintes dados:
. Código da cidade;
a. Número de veículos de passeio (em 1999);
b. Número de acidentes de trânsito com vítimas (em
1999). Deseja-se saber:
c. Qual o maior e menor índice de acidentes de transito e a que
cidade pertence;
d. Qual a média de veículos nas cinco cidades juntas;
e. Qual a média de acidentes de trânsito nas cidades com menos
de 2.000 veículos de passeio.*/

    public static void main(String[] args) {

        int cod;
        int veic;
        int acidentes;
        int cont = 1;

        int maior = 0;
        int codMaior=0;
        int menor = 0;
        int codMenor =0;
        int somaAc = 0;     // cidades menos 2000vei.
        int somaVeic = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i< 5; i++){

            System.out.println("Digite o codigo da " + (i+1) + "ª cidade: ");
            cod = scanner.nextInt();

            System.out.println("Digite o número de veículos na cidade (" + cod + ") em 2023: ");
            veic = scanner.nextInt();

            System.out.println("Digite o número de acidentes com vítima na cidade (" + cod + ") em 2023: ");
            acidentes = scanner.nextInt();

            if (i==0){
                maior = acidentes;
                menor = acidentes;
                codMaior = cod;
                codMenor = cod;
            } else {
                if (acidentes > maior){
                    maior = acidentes;
                    codMaior = cod;
                }

                if (acidentes<menor){
                    menor = acidentes;
                    codMenor = cod;
                }
            }

            if (veic<2000){
                somaAc += acidentes;
                cont++;
            }

            somaVeic += veic;
        }

        System.out.println("Maior íncide de acidentes:  cidade " + codMaior + " com " + maior + " acidentes.");
        System.out.println("Menor íncide de acidentes:  cidade " + codMenor + " com " + menor + " acidentes.");
        System.out.println("Média de veículos: " + (somaVeic/5));
        System.out.println("Média de acidentes em cidades com menos de 2.000 veículos: " + (somaAc/(cont-1)));




    }






}
