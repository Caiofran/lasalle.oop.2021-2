package Semana5.TrabalhoRefatoracao;

// 3-Incluir nesse sistema uma classe nova chamada de Escalacao.java
// - A escalação de um time pode ter no máximo 5 jogadores e 1 Time
// - A escalação também deverá ter um método imprimir() que imprime o time e a escalação atual exemplo:
// Time: Flamengo
// -------------------------
// 1-Raul
// 2-Zico
// 3-Junior
// 4-Andrade
// 5-Nunes

public class Escalacao {

    public void imprimir(Time time, Jogador jogador) {
        System.out.println("Time: " + time.getNome() + "\n-----------------");

        for (int i = 0; i < jogador.getJogadores().length; i++) {
            System.out.println(jogador.toString(i));
        }
    }
}