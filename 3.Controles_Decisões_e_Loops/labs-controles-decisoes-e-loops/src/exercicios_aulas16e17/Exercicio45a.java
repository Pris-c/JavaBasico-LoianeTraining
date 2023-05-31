package exercicios_aulas16e17;

import java.util.Scanner;

public class Exercicio45a {
/*Após concluir isto você poderia incrementar o programa
permitindo que o professor digite o gabarito da prova antes dos
alunos usarem o programa.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String q1 = "", q2 = "", q3 = "", q4 = "", q5 = "", q6 = "", q7 = "", q8 = "", q9 = "", q10 = "";
        String resp;
        String opcao = "-1";
        int aluno = 0;
        int maiorNota = 0;
        int menorNota = 0;


        System.out.println("Professor, cadastre o gabarito da prova!");
        for (int j = 1; j <= 10; j++){
            System.out.println("Questão " + j + ":");
            resp = scanner.next();

            switch (j){
                case 1: q1 = resp; break;
                case 2: q2 = resp; break;
                case 3: q3 = resp; break;
                case 4: q4 = resp; break;
                case 5: q5 = resp; break;
                case 6: q6 = resp; break;
                case 7: q7 = resp; break;
                case 8: q8 = resp; break;
                case 9: q9 = resp; break;
                case 10: q10 = resp; break;
            }
        }

        do {
            int acertos = 0;

            System.out.println("\nAluno, preencha suas respostas!");
            System.out.println("Alternativas (A), (B), (C), (D) ou (E)");
            for (int i = 1; i <= 10; i++) {
                System.out.println("Questão " + i + ": ");
                resp = scanner.next();

                if ((i == 1) && (resp.equalsIgnoreCase(q1))) {
                    acertos++;
                } else if ((i == 2) && (resp.equalsIgnoreCase(q2))) {
                    acertos++;
                } else if ((i == 3) && (resp.equalsIgnoreCase(q3))) {
                    acertos++;
                } else if ((i == 4) && (resp.equalsIgnoreCase(q4))) {
                    acertos++;
                } else if ((i == 5) && (resp.equalsIgnoreCase(q5))) {
                    acertos++;
                } else if ((i == 6) && (resp.equalsIgnoreCase(q6))) {
                    acertos++;
                } else if ((i == 7) && (resp.equalsIgnoreCase(q7))) {
                    acertos++;
                } else if ((i == 8) && (resp.equalsIgnoreCase(q8))) {
                    acertos++;
                } else if ((i == 9) && (resp.equalsIgnoreCase(q9))) {
                    acertos++;
                } else if ((i == 10) && (resp.equalsIgnoreCase(q10))) {
                    acertos++;
                }
            }

            aluno++;
            if (aluno==1){
                maiorNota = acertos;
                menorNota = acertos;
            } else {
                if (acertos > maiorNota){
                    maiorNota = acertos;
                }
                if (acertos < menorNota){
                    menorNota = acertos;
                }
            }
            System.out.println("\nNota do aluno (" + aluno + "): " + acertos + "\n");

            do {
                System.out.println("Digite (0) para sair ou (1) se outro aluno for utilizar o sistema");
                opcao = scanner.next();
            } while ( (!opcao.equals("1")) && (!opcao.equals("0")));

        } while (!opcao.equals("0"));

        System.out.println("-----");
        System.out.println("Maior nota = " + maiorNota);
        System.out.println("Menor nota = " + menorNota);

    }


}
