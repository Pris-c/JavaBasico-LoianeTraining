 package com.prisc.cursojavabasico.parte5orientacaoaobjetos.labs.aula34;

public class ConversorUnidadesTempo {
/*Escreva a classe ConversaoDeUnidadesDeTempo com métodos estáticos para conversão aproximada das
unidades de velocidade segundo a lista abaixo.
• 1 minuto = 60 segundos
• 1 hora = 60 minutos
• 1 dia = 24 horas
• 1 semana = 7 dias
• 1 mês = 30 dias
• 1 ano = 365.25 dias*/

    public static int MinutoEmSegundo(int min){
        return min * 60;
    }
    public static int HoraEmMinuto(int hora){
        return hora * 60;
    }
    public static int DiaEmHoras(int dia){
        return dia * 24;
    }
    public static int SemanaEmDias(int semana){
        return semana * 7;
    }
    public static int MesEmDias(int mes){
        return mes * 30;
    }
    public static int AnoEmDias(int ano){
        return ano * 365;
    }



}
