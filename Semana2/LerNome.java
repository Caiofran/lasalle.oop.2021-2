package Semana2;

import java.util.Scanner;

public class LerNome {
    public static void main(String[] args) {

        String nome = "";
        int idade = 0;
        Scanner teclado = new Scanner(System.in);

        // solicita o nome pelo teclado
        System.out.println("Entre com o nome:");

        // ler nome
        nome = teclado.next();

        // Ler Idade
        System.out.println("Qual sua idade:");
        // idade = Integer.parseInt(teclado.next());
        idade = teclado.nextInt();

        // Imprime saudação
        System.out.println("Olá " + nome + ", boa noite!!!");
        System.out.printf("Você tem %d anos de idade\n", idade);

        // Testa idade
        if (idade < 18) {
            System.out.println("Você não pode entrar!!!");
        } else {
            System.out.println("Acesso permitido.");
        }

        // Teste de Loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        teclado.close();
    }
}
