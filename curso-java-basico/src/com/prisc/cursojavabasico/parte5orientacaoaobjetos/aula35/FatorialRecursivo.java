package com.prisc.cursojavabasico.parte5orientacaoaobjetos.aula35;

public class FatorialRecursivo {

    public static int fatorial(int n){
        if (n==0){
            return 1;
        }
        return n * fatorial(n-1);
    }

}
