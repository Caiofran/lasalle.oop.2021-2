package Semana5.TrabalhoRefatoracao;

// 1-Utilizando os padrões e conceitos de encapsulamento vistos em sala de aula, 
// refatorar as classes Jogador.java, Time.java
public class Time {
    // atributos
    private String nome;
    // private String escudo;

    public Time() {
        this.nome = "Flamengo";
        // this.escudo = "fluminese.jpg";
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
}
