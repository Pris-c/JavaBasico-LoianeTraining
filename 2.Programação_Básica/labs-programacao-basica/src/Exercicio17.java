import java.util.Scanner;

public class Exercicio17 {
/*
Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados
da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados
e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros,
que custam R$ 25,00. Informe ao usuário as quantidades de tinta a serem compradas e os respectivos
preços em 3 situações:
comprar apenas latas de 18 litros;
comprar apenas galões de 3,6 litros;
misturar latas e galões, de forma que o preço seja o menor.

Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
 */

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double litros = 0;
        int latas = 0;
        int galoes = 0;
        int volLata = 18;
        int precoLata = 80;
        double volGalao = 3.6d;
        int precoGalao = 25;

        System.out.println("LOJA DE TINTAS");
        System.out.print("Área a ser pintada (m²): ");
        double area = scan.nextDouble();

        if (area <= 0){
            System.out.println("Área inválida");
        }
        else{
            System.out.println("Escolha a opção desejada:");
            System.out.println("(1) Apenas latas de 18L");
            System.out.println("(2) Apenas galões de 3,60L");
            System.out.println("(3) Misturar embalagens para minimizar o custo");
            int opcao = scan.nextInt();

            if ((opcao < 1) || (opcao >3)) {
                System.out.println("Opçao inválida.");
            }
            else {

                litros = (area / 6) * 1.1;       //10% de folga.

                switch (opcao){
                    case 1:
                        latas = (int) (litros/volLata);

                        double lataParc = litros % volLata;
                        if (lataParc > 0){
                            latas++;
                        }
                        break;


                    case 2:
                        galoes = (int) (litros/volGalao);
                        double galParc = litros % volGalao;
                        if (galParc > 0){
                            galoes++;
                        }
                        break;


                    case 3:
                        latas = (int) (litros / volLata);
                        double resto = litros % volLata;

                        if (resto > 0){
                            galoes = (int) (resto / volGalao);
                            double galPar = resto % volGalao;

                            if (galPar > 0){
                                galoes++;
                            }
                        }
                        break;

                }

                double preco = (latas * precoLata) + (galoes * precoGalao);

                System.out.println("Você deve comprar " + latas + " lata(s) e " + galoes + " galão(ões) de tinta.");
                System.out.println("O valor da sua compra será R$ " + preco);

            }
        }

    }

}
