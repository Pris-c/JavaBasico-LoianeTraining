package aula11;

public class VariaveisLiterais {
    public static void main(String[] args) {

        /*
        LITERAIS INTEGER
        Decimais
        Hexadecimais
        Octais
        Binários
         */

        int decVal = 26;
        int octVal = 032;       //OCTAL: inicia com 0
        int hexVal = 0x1a;      //HEXADECIMAL: inicia com 0x
        int binVal = 0b11010;   //BINARIO: inicia com 0b
                                //binário a partir do JDK7

        System.out.println(decVal);
        System.out.println(hexVal);
        System.out.println(octVal);
        System.out.println(binVal);

        //Pode ser usado _ para melhorar legibilidade de numeros
        int intMax =  2_147_483_647;
        System.out.println(intMax);

        /*
        Há excessoes
        O "_" não pode:
        estar junto a um "."
        ficar no ínicio/antes do numero
        ficar no no final do numero
        estar junto aos sufixos "l" e "f" (float e long)
        estar junto aos prefixos "0", "0x", "0b"
        usar mais de um em sequencia "___"





         */

    }
}
