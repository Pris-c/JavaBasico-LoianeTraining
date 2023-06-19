package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.aula45;

public class Teste2 {

    public static void main(String[] args) {


        //Exemplo 1: Ok
        //Retorno do método pode referenciar String
        Object obj1 = obterString();
        String s1 = (String) obj1;


        //Exemplo 2: OK
        //obj2 referecia String explicitamente
        Object obj2 = "Minha string";
        String s2 = (String) obj2;


        //Exemplo 3: FALHA em tempo de execução
        //obj3 não referencia String
        Object obj3 = new Object();
        String s3 = (String) obj3;

        //Exemplo 4: FALHA em tempo de compilação
        //obj4 nunca referencia String, pois o retorno é um int
        Object obj4 = obterInteiro();
        String s4 = (String) obj4;


    }


    public static String obterString(){
        return "Minha string";
    }
    public static int obterInteiro(){
        return 1;
    }


}
