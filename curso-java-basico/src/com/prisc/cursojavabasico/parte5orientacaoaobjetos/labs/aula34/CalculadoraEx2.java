package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula34;

public class CalculadoraEx2 {
    /*Escreva uma classe Calculadora que tenha os seguintes métodos: somar, subtrair, multiplicar, dividir
(dois números), elevar à  potência n. Desenvolva um programa para testar essa classe.*/


        public static int somar(int num1, int num2){
            return num1 + num2;
        }
        public static double somar(double num1, double num2){
            return num1 + num2;
        }

        public static int multiplicar(int num1, int num2){
            return num1*num2;
        }
        public static double multiplicar(double num1, double num2){
            return num1*num2;
        }
        public static double potencia(double num1, double num2){
            int result = 1;
            for (int i =1; i<=num2; i++){
                result *= num1;
            }
            return result;
        }

        public static int potencia(int num1, int num2){
            int result = 1;
            for (int i =1; i<=num2; i++){
                result *= num1;
            }
            return result;
        }

        public static int fatorial(int n){
            int result = 1;
            if (n==0){

            } else {

                for (int i = n; i > 1; i--) {
                    result *= i;
                }
            }
            return result;
        }






}
