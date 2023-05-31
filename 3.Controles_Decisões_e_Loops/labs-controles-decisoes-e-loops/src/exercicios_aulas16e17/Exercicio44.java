package exercicios_aulas16e17;

import java.util.Scanner;

public class Exercicio44 {
/*Em uma eleição presidencial existem quatro candidatos. Os votos são
informados por meio de código. Os códigos utilizados são:
o 1, 2, 3, 4 - Votos para os respectivos candidatos
o (você deve montar a tabela ex: 1 - Jose/ 2- João/etc)
o 5 - Voto Nulo
o 6 - Voto em Branco
Faça um programa que calcule e mostre:
o O total de votos para cada candidato;
o O total de votos nulos;
o O total de votos em branco;
o A percentagem de votos nulos sobre o total de votos;
o A percentagem de votos em branco sobre o total e votos. Para
finalizar o conjunto de votos tem-se o valor zero.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ELEIÇÕES");

        int voto;
        double cont = 1;
        int votoN = 0;
        int votoB = 0;
        int voto1 = 0;
        int voto2 = 0;
        int voto3 = 0;
        int voto4 = 0;


        do {

            System.out.println("Voto do eleitor " + (cont) + ": ");
            System.out.println("(1) - Haroldo Ferreti");
            System.out.println("(2) - Samuel Rosa");
            System.out.println("(3) - Henrique Portugal");
            System.out.println("(4) - Lelo Zaneti");
            System.out.println("(5) - NULO");
            System.out.println("(6) - BRANCO");
            voto = scanner.nextInt();

            if ( (voto==1) || (voto==2) || (voto==3) || (voto==4) || (voto==5) || (voto==6)){
                switch (voto){
                    case 1: voto1++; break;
                    case 2: voto2++; break;
                    case 3: voto3++; break;
                    case 4: voto4++; break;
                    case 5: votoN++; break;
                    case 6: votoB++; break;
                }
                cont++;
                //System.out.println(cont);

            }else if (voto!=0){
                System.out.println("voto inválido.");
            }
        } while (voto!=0);

        double pBranco = ( ( votoB/(cont-1) ) * 100 ) ;
        double pNulo = (votoN/(cont-1))*100;

        System.out.println("----------");
        System.out.println("Contagem de votos:");
        System.out.println("Haroldo Ferreti: " + voto1);
        System.out.println("Samuel Rosa: " + voto2);
        System.out.println("Henrique Portugal: " + voto3);
        System.out.println("Lelo Zaneti: " + voto4);
        System.out.println("NULOS: " + votoN + " (" + pNulo + " %)");
        System.out.println("BRANCOS: " + votoB + " (" + pBranco + " %)");
    }

}
