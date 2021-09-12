package Semana5.TrabalhoRefatoracao;

// 1-Utilizando os padrões e conceitos de encapsulamento vistos em sala de aula, refatorar as classes 
// Jogador.java, Time.java
public class Jogador extends Time {
    // atributos
    // private String nome;
    // private String sobreNome;
    // private Integer idade;

    private String nomeJogador1;
    private String nomeJogador2;
    private String nomeJogador3;
    private String nomeJogador4;
    private String nomeJogador5;
    private Time time;

    // construtor
    public Jogador() {
        this.nomeJogador1 = "Raul";
        this.nomeJogador2 = "Zico";
        this.nomeJogador3 = "Junior";
        this.nomeJogador4 = "Andrade";
        this.nomeJogador5 = "Nunes";
        time = new Time();
    }

    // metodos
    public void mostrarJogardor() {
        //System.out.println(this.nome + " " + this.sobreNome);
        System.out.println("1-" + this.nomeJogador1);
        System.out.println("2-" + this.nomeJogador2);
        System.out.println("3-" + this.nomeJogador3);
        System.out.println("4-" + this.nomeJogador4);
        System.out.println("5-" + this.nomeJogador5);
    }
}
