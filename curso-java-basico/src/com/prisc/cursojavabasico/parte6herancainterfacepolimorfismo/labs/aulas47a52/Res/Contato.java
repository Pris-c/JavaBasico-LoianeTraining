package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas47a52.Res;

public class Contato {

    private static int cont;  //Precisa inicializar
    private int id;
    private String nome;
    private String telefone;

    public Contato(){
        cont++;
        this.id = cont;
    }

    public Contato(String nome, String telefone) {
        cont++;
        this.id = cont;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\n[Contato " + id + ", Nome: " + nome + ", Telefone: " + telefone +"]";
    }
}
