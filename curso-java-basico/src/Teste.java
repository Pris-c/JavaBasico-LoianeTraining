import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Teste {

            public static void main(String[] args) throws IOException {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

                int n = Integer.parseInt(bufferedReader.readLine().trim());

                String binario = Integer.toBinaryString(n);
                System.out.println(binario);

                int cont = 1;
                int contMax = 0;
                for(int i=1; i<binario.length(); i++){
                    char l1 = binario.charAt(i);
                    char l2 = binario.charAt(i-1);

                    if((l1=='1') && (l2=='1')){
                        cont++;
                    } else if (cont > contMax) {
                        contMax = cont;
                        cont = 1;
                    } else {
                        cont = 1;
                    }
                }

                if (cont>contMax){
                    System.out.print(cont);
                } else {
                    System.out.print(contMax);
                }



                bufferedReader.close();
            }

}
