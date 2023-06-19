package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.aula45;

public class Pessoa {

    public String nomePublico;
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    public Pessoa(String nome, String endereco, String telefone) {
        super();                        // seta classe Object
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String obterEtiquedaEndereco(){
        return getEndereco();
    }
}
