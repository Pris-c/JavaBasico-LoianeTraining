package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.aula52;

public class UsandoMinhaException {
    public static void main(String[] args) {

        try {
            teste();
        } catch (DivisaoNaoExata e) {
            e.printStackTrace();
        }


    }

    public static void teste() throws DivisaoNaoExata{
        int[] numeros = {4, 8, 5, 16, 32, 21,  64, 128};
        int[] denominadores = {2, 0, 4, 8 ,0, 2 , 3};

        for(int i=0; i<numeros.length;i++){

            try {
                if((numeros[i] % denominadores[i]) != 0){
                    //Lançar a exception aqui
                    //throw new Exception("Numero impar, divisão não exata");
                    throw new DivisaoNaoExata(numeros[i], denominadores[i]);
                }
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));

            }  catch (ArithmeticException | ArrayIndexOutOfBoundsException e1){
                System.out.println("Aconteceu um erro.");
                e1.printStackTrace();
            }
        }



    }



}
