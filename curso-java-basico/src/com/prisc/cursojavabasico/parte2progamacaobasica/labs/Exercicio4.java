import java.util.Scanner;

public class Exercicio4 {
//Faça um programa que peça as 4 notas bimenstrais e mostre a média

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double notaB1, notaB2, notaB3, notaB4;
        double media;

        System.out.println("CALCULO DA MÉDIA DO ALUNO");
        System.out.println("Insira as notas abaixo.");
        System.out.print("Nota do primeiro bimestre: ");
        notaB1 = scanner.nextDouble();
        System.out.print("Nota do segundo bimestre: ");
        notaB2 = scanner.nextDouble();
        System.out.print("Nota do terceiro bimestre: ");
        notaB3 = scanner.nextDouble();
        System.out.print("Nota do quarto bimestre: ");
        notaB4 = scanner.nextDouble();

        media = (notaB1 + notaB2 + notaB3 + notaB4)/4;

        System.out.println("\nO aluno teve média " + media);

    }
}
