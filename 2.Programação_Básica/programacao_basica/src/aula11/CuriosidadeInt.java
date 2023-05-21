package aula11;

public class CuriosidadeInt {
    public static void main(String[] args) {

        /*
        Quando uma operação extrapola os limites inferior ou superior de uma varíavel do tipo int,
        ela segue os valores disponívies, ou seja, recomeça do limite oposto.
        É como se todos os valores do tipo int estivessem em um circulo,
        começando do -2.147.483.648, indo até 2.147.483.647 - e novamente voltando no -2.147.483.648.
         */

        int intMax = 2147483647;  //valor max de um tipo int
        int var1 = 1;
        System.out.println("Soma ao valor máximo = " + (intMax+var1));

        int intMin = -2147483648;
        int var2 = 100;
        System.out.println("Subtracao ao valor mínimo = " + (intMin - var2));

    }

}
