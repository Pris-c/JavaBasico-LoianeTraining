import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Exercicio14 {
/*
João Papo-de-Pescador, homem de bem,  comprou um microcomputador para controlar
o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior
que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
deve pagar uma multa de RS 4,00 por quilo excedente. João precisa que você faça
um programa que leia a variável peso (peso de peixes) e verifique se há excesso.
Se houver, <<gravar na variável excesso e na variável multa o valor da multa>> (sic) que João
deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double peso;
        double pesoMax = 50;
        int taxaMulta = 4;
        double excesso = 0;
        double multa = 0;

        System.out.println("CONTROLE DE PESCA DO JOÃO");
        System.out.print("Peso de peixes: ");
        peso = scan.nextDouble();

        if(peso > pesoMax) {
            excesso = peso - pesoMax;
            multa = excesso * taxaMulta;
        }

        System.out.println("Excesso: " + excesso + "kg");
        System.out.println("Multa: R$" + multa);

    }

}
