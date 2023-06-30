package com.prisc.cursojavabasico.parte6herancainterfacepolimorfismo.labs.aulas47a52.Solution;

public class Contato {

    private static int cont = 0;
    // o tipo estático possibilita que todos os objetos compartilhem a mesma informação.
    private int id;
    private String nome;
    private String telefone;
    private String email;



    public Contato(){
        this.cont++;
        this.id = cont;
    }




    public int getId() {
        return id;
    }

    //Sem método set para o ID


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String s = "[";
        s+= "Id: " + id;
        s+= ", Nome: " + nome;
        s+= ", Telefone: " + telefone;
        s+= ", E-mail: " + email;
        s+= "]\n";


        return s;
    }
}
