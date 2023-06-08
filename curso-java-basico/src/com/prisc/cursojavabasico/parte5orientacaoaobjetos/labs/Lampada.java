package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs;

public class Lampada {
/*Escreva uma classe para representar uma lâmpada que
está à venda em um supermercado.*/

 /*Desenvolva métodos para ligar, desligar a lampada.*/

       String marca;
        String modelo;
        String tipoLuz;
        String cor;
        int potencia;
        int tensao;
        int tempoGarantia;
        double preco;
        boolean ligada;

        void ligarLampada(){
         ligada = true;
        }
        void apagarLampada(){
         ligada = false;
        }

        void mudarEstado(){
         if (ligada){
          apagarLampada();
         } else {
          ligarLampada();
         }
 }

        void mostrarEstado(){
          if (ligada){
           System.out.println("A lampada está ligada");
          } else {
           System.out.println("A lampada está desligada.");
          }
 }

}
