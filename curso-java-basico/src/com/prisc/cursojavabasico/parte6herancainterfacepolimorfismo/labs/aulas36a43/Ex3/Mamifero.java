package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas36a43.Ex3;

public class Mamifero extends Animal {

    private String alimento;

    public Mamifero() {
        super();
        setAmbiente("terra");
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        if (alimento!=null){
            return super.toString() + '\n' +
            "Alimento: " + this.alimento;
        } else {
            return super.toString();
        }

    }
}
