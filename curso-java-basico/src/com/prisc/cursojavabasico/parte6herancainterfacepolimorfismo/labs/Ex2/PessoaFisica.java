package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.Ex2;

public class PessoaFisica extends Contribuinte{

    String cpf;

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                "} " + super.toString();
    }

    public double calcularImposto(double rendaBruta){
        if (rendaBruta < 0 ){
            System.out.println("Renda inválida");
            return 0;
        } else if (rendaBruta <= 1400.00) {
            return 0;
        } else if (rendaBruta <= 2100.00) {
            return (rendaBruta * 0.10) - 100;
        } else if (rendaBruta <= 2800) {
            return (rendaBruta * 0.15) - 270;
        } else if (rendaBruta <= 3600.00) {
            return (rendaBruta * 0.25) - 500;
        } else {
            return (rendaBruta * 0.30) - 700;
        }



    }


    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }
}
