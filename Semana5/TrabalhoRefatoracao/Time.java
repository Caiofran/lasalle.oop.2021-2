package Semana5.TrabalhoRefatoracao;

// 1-Utilizando os padrões e conceitos de encapsulamento vistos em sala de aula, refatorar as classes 
// Jogador.java, Time.java

public class Time {
    private String nomeTime;

    public String getNome() {
        return this.nomeTime;
    }

    public void setNome(String nome) {
        this.nomeTime = nome;
    }
}
