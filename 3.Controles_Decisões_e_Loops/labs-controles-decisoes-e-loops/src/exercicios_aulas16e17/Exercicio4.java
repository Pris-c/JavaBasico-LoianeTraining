package exercicios_aulas16e17;

public class Exercicio4 {
/*
Supondo que a população de um país A seja da ordem de 80000
habitantes com uma taxa anual de crescimento de 3% e que a
população de B seja 200000 habitantes com uma taxa de crescimento
de 1.5%.
Faça um programa que calcule e escreva o número de anos
necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantidas as taxas de crescimento.
 */
public static void main(String[] args) {


    int popA = 80000;
    int popB = 200000;
    double cresA = 1.03d;
    double cresB = 1.015d;

    int i = 0;
    while (popA < popB){
        popA *= cresA;
        popB *= cresB;

       /* System.out.println("Em " + i + " anos.");
        System.out.println("PopA = " + popA);
        System.out.println("PopB = " + popB);
        System.out.println("-------");*/
        i++;
    }

    System.out.println("Em " + i + " anos:");
    System.out.println("população A: " + popA);
    System.out.println("população B: " + popB);


}


}
