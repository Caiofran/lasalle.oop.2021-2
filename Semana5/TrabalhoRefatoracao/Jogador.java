package Semana5.TrabalhoRefatoracao;
// 1-Utilizando os padrões e conceitos de encapsulamento vistos em sala de aula, refatorar as classes 
// Jogador.java, Time.java
public class Jogador {
    //atributos
    private String nome;
    private String sobreNome;
    private Integer i;
    private Time time;

    //construtor
    public Jogador(){
        time = new Time();
    }

    
    //metodos
    public void mostrarNomeSobrenome()
    {
        System.out.println( this.nome + " " + this.sobreNome);
    }
}
