package Semana2.Atividade;

import java.util.Arrays;
import java.util.Scanner;

// Caio França Ricciardi 0050015558

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];

        //ler numeros pelo teclado
        for(int i=0; i<num.length; i++)
        {
            //System.out.println("Entre com o numero " + (i+1) + ":");
            System.out.printf("\nEntre com o número %d :" , (i+1));
            num[i] = sc.nextInt();
        }

        // Coloca o Array em ordem crescente
        Arrays.sort(num);

        // Lista o Array em ordem crescente
        System.out.print("\nOrdem crescente: "); 
        for (int j = 0; j < num.length; j++) 
        {
            System.out.print(num[j]+ "  ");       		
        }

        System.out.print("\n");
        sc.close();
    }
}
