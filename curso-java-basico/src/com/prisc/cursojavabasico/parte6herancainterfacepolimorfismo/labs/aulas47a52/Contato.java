package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas47a52;

public class Contato {
/*. Escreva	uma	classe Contato que	contenha	nome,	telefone	e	um
identificador. Esse	identificador	deve	ser	gerado	automaticamente	pela
classe	através	de	um	contador	(cada	vez	que	um	Contato	é	criado	o
contador	é	incrementado	e	atribuído	ao	identificador).*/

    private String nome;
    private String telefone;
    private int id;

    public Contato() {
        this.id = this.getId() + 1;
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.id =+ 1;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "----------------" + "\n" +
                "Contato " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Telefone: " + telefone;
    }
}
