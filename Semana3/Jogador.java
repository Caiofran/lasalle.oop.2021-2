package Semana3;


public class Jogador {
    //Atributos
    public String nome;
    public String sobreNome;
    public Integer idade;
    public Time time;

    //construtor
    public Jogador()
    {
        time = new Time();
    }

    //metodos
    public void mostrarNomeSobrenome()
    {
        System.out.println(this.nome + "" + this.sobreNome);
    }
}
