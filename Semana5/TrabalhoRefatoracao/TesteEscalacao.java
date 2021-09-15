package Semana5.TrabalhoRefatoracao;

// 4-Criar uma classe para testar. Nesse TesteEscalacao.java, deve conter:
// - Criação de 5 jogadores
// - Criação de 1 Time
// - Escalação do Time, com os 5 jogadores e a data do jogo
// - Imprimir a escalação criada

import java.util.Scanner;

public class TesteEscalacao {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        Time time = new Time();
        Escalacao escalacao = new Escalacao();
        String nomeJogador[] = new String[5];
        Scanner sc = new Scanner(System.in);

        // Criação de 1 Time
        System.out.print("Digite o nome do time: ");
        time.setNome(sc.nextLine());

        // Criação de 5 jogadores
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do jogador: ");
            nomeJogador[i] = sc.nextLine();
            jogador.setJogadores(nomeJogador);
        }

        // Escalação do Time, com os 5 jogadores e a data do jogo
        System.out.print("Digite o dia do jogo: ");
        int diaJogo = sc.nextInt();
        System.out.print("Digite o mês do jogo: ");
        int mesJogo = sc.nextInt();
        System.out.print("Digite o ano do jogo: ");
        int anoJogo = sc.nextInt();

        // imprimir data
        System.out.println("Data do jogo: " + diaJogo + "/" + mesJogo + "/" + anoJogo);

        // Imprimir a escalação criada
        escalacao.imprimir(time, jogador);

        sc.close();
    }
}