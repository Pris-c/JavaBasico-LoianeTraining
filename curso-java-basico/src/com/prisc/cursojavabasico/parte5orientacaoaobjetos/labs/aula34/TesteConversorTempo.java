package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula34;

public class TesteConversorTempo {

    public static void main(String[] args) {

        int a = ConversorUnidadesTempo.AnoEmDias(10);
        int b = ConversorUnidadesTempo.MesEmDias(12);
        int c =  ConversorUnidadesTempo.SemanaEmDias(4);
        int d = ConversorUnidadesTempo.DiaEmHoras(1);
        int e = ConversorUnidadesTempo.MinutoEmSegundo(1);
        int f = ConversorUnidadesTempo.HoraEmMinuto(5);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
