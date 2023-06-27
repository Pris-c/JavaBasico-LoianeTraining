package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas36a43.Ex3;

public class Peixe extends Animal{

    String caracteristicas;

    public Peixe() {
        super();
        super.setnPatas(0);
        super.setAmbiente("mar");
        super.setCor("cinzenta");
        this.caracteristicas = "Barbatanas e cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return super.toString() + '\n'+
        "Caracteristicas: " + this.caracteristicas;
    }
}
