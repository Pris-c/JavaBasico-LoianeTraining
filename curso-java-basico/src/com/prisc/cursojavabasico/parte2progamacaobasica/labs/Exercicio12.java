import java.util.Scanner;

public class Exercicio12 {
//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule
//seu peso ideal, usando a seguinte formula (72.7*altura)-58

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double altura, pesoIdeal;

        System.out.println("CALCULO DE PESO IDEAL");
        System.out.print("Digite sua altura (m): ");
        altura = scan.nextDouble();

        pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Peso ideal: " + pesoIdeal + "kg");

    }

}
