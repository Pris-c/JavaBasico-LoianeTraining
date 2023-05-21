package aula10;

public class Variaveis {

    public static void main(String[] args){

        int idade = 31;
        String nome = "Priscila";
        String nomeDoCachorro = "Alfredo Wagner";
        String ano2023 = "2023";

        /*
        Má prática: Nome de variáveis sem significado
        int a = 10;
        String b = "Priscila";
        */


        /*
        Aceitos, mas normalmente não se utiliza:
        int _idade;
        int &idade;
        */

        /*
        Válidos, mas não atendem convenção Java:
        String ano2023
        String nome_do_cachorro;
        String NomeDoCachorro;
        String NomeDocachorro;
        */

        idade = 20;
        System.out.println("Idade: " + idade);
        System.out.println("Nome: " + nome);


    }
}
