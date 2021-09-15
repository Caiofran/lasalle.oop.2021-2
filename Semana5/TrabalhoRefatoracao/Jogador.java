package Semana5.TrabalhoRefatoracao;

// 1-Utilizando os padrões e conceitos de encapsulamento vistos em sala de aula, refatorar as classes 
// Jogador.java, Time.java

public class Jogador {

    private String jogadores[] = new String[5];

    public String[] getJogadores() {
        return this.jogadores;
    }

    public String toString(int i) {
        return (i + 1) + " - " + jogadores[i];
    }

    public void setJogadores(String nome[]) {
        this.jogadores = nome;
    }
}