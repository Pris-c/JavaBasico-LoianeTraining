package com.prisc.cursojavabasico.parte2progamacaobasica.aula13;

public class CurtoCircuito {

    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;


        //Analisa ambas as variveis sempre
        boolean resultado1 = falso &
                verdadeiro;
        System.out.println(resultado1);


        //Já conclui o resultado falso se primeira variável for false (Curto Circuito)
        boolean resultado2 = falso &&
                verdadeiro;
        System.out.println(resultado2);
    }
}
