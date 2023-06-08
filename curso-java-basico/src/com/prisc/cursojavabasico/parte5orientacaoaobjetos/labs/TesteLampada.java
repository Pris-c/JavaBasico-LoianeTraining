package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs;

public class TesteLampada {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.ligarLampada();
        lampada.mostrarEstado();

        lampada.apagarLampada();
        lampada.mostrarEstado();

        lampada.mudarEstado();
        lampada.mostrarEstado();


    }
}
