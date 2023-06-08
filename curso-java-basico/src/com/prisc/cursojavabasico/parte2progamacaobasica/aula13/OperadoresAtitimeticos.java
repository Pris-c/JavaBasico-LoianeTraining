package com.prisc.cursojavabasico.parte2progamacaobasica.aula13;

public class OperadoresAtitimeticos {
    public static void main(String[] args) {

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado);
        //5

        System.out.println(resultado++);
        /*
        igual a:
        System.out.println(resultado);
        resultado = resultado +1;
        ou
        resultado += 1;
         */


        System.out.println(++resultado);
        /*
        o mesmo que:
        resultado += 1;
        ou
        resultado = resultado + 1;
        System.out.println(resultado);
         */

        resultado--;
        System.out.println(resultado);

        System.out.println(resultado--);
        System.out.println(--
                resultado);


        String primeiroNome = "Esta é";
        String segundoNome = " uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);


    }
}
