package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula35;

public class SomatorioRecursivo {


    public static int somatorioRec(int n){
        if (n==1){
            return 1;
        }

        return n+somatorioRec(n-1);
    }
}
