package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula34;

public class TesteConvAreas {

    public static void main(String[] args) {

        double a = ConversorUnidadesArea.convMilha2emAcre(100);
        System.out.println(a);
        double b = ConversorUnidadesArea.convAcreEmPes2(100);
        System.out.println(b);
        double c = ConversorUnidadesArea.convM2emPes2(100);
        System.out.println(c);
        double d = ConversorUnidadesArea.convPes2emCm2(100);
        System.out.println(d);
    }
}
