package com.prisc.cursojavabasico.parte2progamacaobasica.aula11;

public class TesteFloat {
    public static void main(String[] args) {

        float maxFloat = Float.MAX_VALUE;

        System.out.println("maxFloat= " +maxFloat);
        System.out.println("maxFloat + 100 = " + (maxFloat + 100f));  // =maxFloat
        System.out.println("maxFloat + maxFloat = " + (maxFloat + maxFloat)); // = Infinity

    }
}
