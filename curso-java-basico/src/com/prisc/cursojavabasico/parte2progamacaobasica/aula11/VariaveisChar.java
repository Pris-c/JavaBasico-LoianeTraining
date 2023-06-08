package com.prisc.cursojavabasico.parte2progamacaobasica.aula11;

public class VariaveisChar {
    public static void main(String[] args) {

        char o = 'o';
        char i = 'i';
        System.out.println(o+i);   //imprime resultado da soma dos valores de cada caracter
        System.out.println(""+o+i); //Aspas indicam que é para considerar o próprio caracter a não o seu valor

        //declarando com codes
        char o1 = 111;
        char i1 = 105;
        char interrogacao = 0x003F;
        System.out.println(""+o1+i1);
        System.out.println(""+interrogacao);

    }

}
