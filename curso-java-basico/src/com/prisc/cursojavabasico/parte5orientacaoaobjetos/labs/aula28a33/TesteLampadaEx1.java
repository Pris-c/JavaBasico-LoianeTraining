package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula28a33;

public class TesteLampadaEx1 {
    public static void main(String[] args) {

        LampadaEx1 lamp = new LampadaEx1();

        lamp.mostrarEstado();
        lamp.mudarEstado();
        lamp.mostrarEstado();

        lamp.desligar();
        lamp.ligar();
        lamp.mostrarEstado();
        lamp.desligar();
        lamp.mostrarEstado();
    }

}
