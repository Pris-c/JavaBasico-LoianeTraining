package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula34;

public class ConversorUnidadesArea {
/*Escreva a classe ConversaoDeUnidadesDeArea com métodos estáticos para conversão das
unidades de área segundo a lista abaixo.
• 1 metro quadrado = 10.76 pés quadrados
• 1 pé  quadrado = 929 centímetros quadrados
• 1 milha  quadrada = 640 acres
• 1 acre = 43.560 pés quadrados*/

    public static double convM2emPes2(double m2){
        return m2 * 10.76d;
    }

    public static double convPes2emCm2(double pes2){
        return pes2 * 929;
    }

    public static double convMilha2emAcre(double milha2){
        return milha2 * 640;
    }

    public static double convAcreEmPes2(double acre){
        return acre * 43.560;
    }







}
