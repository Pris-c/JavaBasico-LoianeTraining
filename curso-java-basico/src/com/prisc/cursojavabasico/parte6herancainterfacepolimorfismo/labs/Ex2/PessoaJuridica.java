package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.Ex2;

public class PessoaJuridica extends Contribuinte{

    private String cnpj;



    public double calcularImposto(double rendaBruta){
        return rendaBruta * 0.10;
    }


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome) {
        super(nome);
    }

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }
}
