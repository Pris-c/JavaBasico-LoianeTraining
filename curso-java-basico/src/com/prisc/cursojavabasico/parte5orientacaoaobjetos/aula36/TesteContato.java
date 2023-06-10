package com.prisc.cursojavabasico.parte5orientacaoaobjetos.aula36;

public class TesteContato {

    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setNome("Tyrion");
        //contato.setEndereco("Kings Landing");

        //Relacionamento TEM UM endereço
        Endereco ender = new Endereco();
        ender.setNomeRua("Game Of Thrones");
        ender.setNumero("n/a");
        ender.setComplemento("-");
        ender.setCidade("Kings Landing");
        ender.setEstado("Westeros");
        ender.setCep("90090-009");

        contato.setEndereco(ender);

        //Relacionamento TEM UM telefone
        Telefone tel = new Telefone();
        tel.setTipo("celular");
        tel.setDdd("55");
        tel.setNumero("55555-5555");

        Telefone tel2 = new Telefone();
        tel2.setTipo("trabalho");
        tel2.setDdd("22");
        tel2.setNumero("33333-3333");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel2;

        contato.setTelefones(telefones);

        //Exibindo infos
        System.out.println(contato.getNome());

        if( contato != null && contato.getEndereco() != null  ){
            System.out.println(contato.getEndereco().getCidade());
            System.out.println(contato.getEndereco().getEstado());
        }

        if (contato != null && contato.getTelefones() !=null){
            for (Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }



    }
}
