package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.aula50;

import java.util.Scanner;

public class UsandoThrows {

    public static void main(String[] args) {

        System.out.println("Entre com um número decimal: ");
        try {
            double num = lerNumero();
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }


    }

    public static double lerNumero() throws Exception{
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();
        return numero;
    }


}
