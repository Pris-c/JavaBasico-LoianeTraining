import java.util.Scanner;

public class Exercicio13 {
/*Tendo como dados de entrada a altura e o sexo de uma pessoa,
construa um algoritmo que calcule seu "peso ideal", utilizando as seguintes formulas:
Para homens (72.7*h)-58
Para mulheres (62.1*h)-44.7
sendo h=altura
 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double altura;
        double pesoId = 0;
        char sexo;

        System.out.println("CALCULO DE PESO IDEAL");
        System.out.print("Digite sua altura (m): ");
        altura = scan.nextDouble();
        System.out.println("Especifique o seu sexo");
        System.out.println("Use (M) para masculino ou (F) para feminino:");
        sexo = scan.next().charAt(0);

        if ((sexo == 'M') || (sexo == 'm')) {
            pesoId = (72.7 * altura) - 58;
            System.out.println("O seu \"peso ideal\" é: " + pesoId + "kg");
        } else if ((sexo == 'F') || (sexo == 'f')) {
            pesoId = (62.1 * altura) - 44.7;
            System.out.println("O seu \"peso ideal\" é: " + pesoId + "kg");
        }
        else {
            System.out.println("Erro ao identificar o sexo.");
        }

    }
}
