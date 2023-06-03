package aula19;

public class Exercicio38 {
    /*Ler um vetor A com 10 elementos. Construir um vetor B de mesmo tipo
e tamanho, sendo que cada elemento de B deverá ser o seguinte
somatório: Bi = Somatório de Aj, para todo j variando de i até 10.*/

    public static void main(String[] args) {

        int[] A = new int[15];
        int[] B = new int[A.length];

        int soma = 0;

        for (int i = 0; i < A.length; i++) {
            A[i] = i;
        }

        for (int n : A) {
            soma = 0;
            for (int j = 1; j <= n; j++) {
                soma += j;
                //System.out.println(j);
                //System.out.println(fat);
            }

            System.out.println("Somatório de " + n + " = " + soma);
        }

    }
}
