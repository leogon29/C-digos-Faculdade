package exercicio10.pkg11.pkg2023;


import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10112023 {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        int[] valores = new int[15];
        
        for (int x = 0; x < 15; x++) {
            System.out.printf("Digite o valor para posição %d: ", x+1);
            valores[x] = entrada.nextInt();
        }
        
        int paresAdicionados = 0;
        int imparesAdicionados = 0;
        int[] pares = new int[5];
        int[] impares = new int[5];
        
        for (int x = 0; x < 15; x++) {
            if (valores[x] % 2 != 0) {
                if (imparesAdicionados <= 4) {
                    impares[imparesAdicionados] = valores[x];
                    imparesAdicionados++;
                } else {
//1
        System.out.printf("Vetor de impares está cheio, logando valores: %s\n", Arrays.toString(impares));
                    imparesAdicionados = 0;
                    Arrays.fill(impares, 0); 
                }
            } else {
                if (paresAdicionados <= 4) {
                    pares[paresAdicionados] = valores[x];
                    paresAdicionados++;
                } else {
                    System.out.printf("Vetor de pares está cheio, logando valores: %s\n", Arrays.toString(pares));
                    paresAdicionados = 0;
                    Arrays.fill(pares, 0);
                }
            }
        }
        
        System.out.printf("Restante dos valores impares: %s\n",  Arrays.toString(impares));
        System.out.printf("Restante dos valores pares: %s\n",  Arrays.toString(pares));
    }
      
    }