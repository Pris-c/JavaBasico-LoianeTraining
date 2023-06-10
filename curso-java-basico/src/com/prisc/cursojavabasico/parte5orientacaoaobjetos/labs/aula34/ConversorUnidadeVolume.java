package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula34;

public class ConversorUnidadeVolume {
/*Escreva a classe ConversaoDeUnidadesDeVolume com métodos estáticos para conversão das unidades de volume
segundo a lista abaixo.
• 1 litro = 1000 centímetros cúbicos
• 1 metro cúbico = 1000 litros
• 1 metro cúbico = 35.32 pés cúbicos
• 1 galão americano = 231 polegadas cúbicas
• 1 galão americano = 3.785 litros*/

    public static double conLitroEmCm3(double l){
        return l * 1000;
    }

    public static double conM3EmLitro(double m3){
        return m3 * 1000;
    }


    public static double conM3EmPe3(double m){
        return m * 35.32;
    }

    public static double conGalAmEmPol3(double gal){
        return gal * 231;
    }
    public static double conGalAmEmLitro(double gal){
        return gal * 3.785;
    }

}
