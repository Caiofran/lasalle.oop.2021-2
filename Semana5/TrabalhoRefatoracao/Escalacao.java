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
public class Escalacao extends Jogador {

    private Integer maxJogadores;
    private Integer jogadorAtual;
    // Time time = new Time();
    // private Time time;

    Jogador jogador = new Jogador();
    Time time = new Time();

    public Escalacao() {
        this.maxJogadores = 5;
        this.jogadorAtual = 1;
    }

    public void criacaoJogardor() {
        for (int i=0;i<maxJogadores;i++) {
            if (this.jogadorAtual == this.maxJogadores) {
                System.out.println("Já estou no limite máximo de jogadores.");
                // imprimir();
            } else {
                this.jogadorAtual++;
            }
        }
    }

    public void imprimir() {
        System.out.println("Time:" + this.getNome() + "\n-----------------");
        jogador.mostrarJogardor();
    }

    // public void diminuirMarcha()
    // {
    // if(this.jogadorAtual == 1)
    // System.out.println("Já estou na marcha mínima.");
    // else
    // this.jogadorAtual--;
    // }
}
