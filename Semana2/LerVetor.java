package Semana2;

import java.util.Scanner;

public class LerVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        //ler numeros pelo teclado
        for(int i=0; i<num.length; i++)
        {
            //System.out.println("Entre com o numero " + (i+1) + ":");
            System.out.printf("\nEntre com o número %d :" , (i+1));
            num[i] = sc.nextInt();
        }

        //exibir o vetor
        for (int n : num) {
            System.out.println(n);
        }

        sc.close();
    }
}
