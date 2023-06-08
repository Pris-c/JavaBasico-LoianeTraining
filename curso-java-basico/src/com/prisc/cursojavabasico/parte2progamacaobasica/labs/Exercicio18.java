import java.util.Scanner;

public class Exercicio18 {
/*
    Faça um programa que peça o tamanho de um arquivo para download (em MB)
    e a velocidade de um link de internet (em Mbps), calcule e informe
    o tempo aproximado de download do arquivo utilizando este link (em minutos).
*/
/*
    Mbps : Megabit per second (Mbit/s or Mb/s)
    MB/s : Megabyte per second,
    1 Mbps = 0.125 MB/s

 */

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("CALCULA TEMPO DE DOWNLOAD");
        System.out.print("Tamanho do arquivo (em MB): ");
        double MB = scan.nextDouble();
        System.out.print("Velocidade da internet (em Mbps): ");
        double velMbps = scan.nextDouble();

        double velMBsec = velMbps * 0.125;

        double tempoDown = (MB / velMBsec) / 60;

        System.out.println("O tempo aproximado para o download é de " + tempoDown + " minuto(s)");

    }
}
