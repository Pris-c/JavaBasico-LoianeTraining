import java.util.Scanner;

public class Exercicio16 {
/*
Faça um programa para uma loja de tintas.
O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados
e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int latas = 0;
        int litrosLata = 18;
        int precoLata = 80;

        System.out.println("LOJA DE TINTAS");
        System.out.print("Informe o tamanho da área a ser pintada (m²): ");
        double area = scan.nextDouble();

        if (area <= 0){
            System.out.println("Área inválida");
        }

        double litros = area / 3;

        if (litros < litrosLata){
            latas = 1;
        }
        else{
            latas = (int) (litros/18);
            double lataParc = litros % 18;

            if (lataParc > 0){
                latas++;
            }
        }

        double valorTotal = latas * precoLata;

        System.out.println("Você precisará de " + latas + " latas.");
        System.out.println("O valor total ficará em R$ " + valorTotal);

    }

}
