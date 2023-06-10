package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula35;

import java.util.Scanner;

public class FibonacciRecursivo {
/*Escreva um método recursivo e estático que calcule e  retorne o N-­‐ésimo termo da sequência Fibonacci.
Algunsnúmeros desta sequência são: 0, 1, 1,  2, 3, 5, 8, 13, 21, 34, 55, 89...*/


    public static int nFibonacci(int n) {
        if (n==1 || n==2){
            return 1;
        }
        return nFibonacci(n-1) + nFibonacci(n-2);
    }

}
