package aula16e17;

public class LoopWhile {

    public static void main (String[] args){

        int i = 1;
        int max = 10;

        System.out.println("CONTANDO ATÉ " + max);

        while (i <= max){
            System.out.println("Valor de i: " + i);
            i++;    // ou i = i+1;
                    // ou i += 1;
        }
        System.out.println("i final no \"while\" = " + i);


        do {
            i++;
            System.out.println("i vale: " + i);
        } while (i < 15);

        System.out.println("i final no \"do while\" = " + i);

    }
}
