package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas36a43.Ex2;

public class TesteContribuinte {

    public static void main(String[] args) {

        PessoaFisica pFisica = new PessoaFisica("Priscila", "10020030040");
        PessoaFisica pFisica2 = new PessoaFisica("Patricia", "20030040010");
        PessoaFisica pFisica3 = new PessoaFisica("Pilar", "30020010040");
        PessoaJuridica pJuridica = new PessoaJuridica("Companhia", "1234561000");
        PessoaJuridica pJuridica2 = new PessoaJuridica("Companhia", "1234561000");
        PessoaJuridica pJuridica3 = new PessoaJuridica("Companhia", "1234561000");


        pFisica.mostrarImposto(5000);
        pJuridica.mostrarImposto(5000);

        System.out.println();
        pFisica2.mostrarImposto(2500);
        pJuridica2.mostrarImposto(2500);
        System.out.println();

        pFisica3.mostrarImposto(2000);
        pJuridica3.mostrarImposto(2000);

    }


}
