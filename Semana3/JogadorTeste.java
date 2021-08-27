package Semana3;

public class JogadorTeste {
    public static void main(String[] args) {
        Jogador jog1 = new Jogador(); //criar um objetos jog1 do tipo jogador

        jog1.nome = "Caio";
        jog1.sobreNome = " Franca";
        jog1.idade = 24;
        jog1.time.nome = "PSG";
        jog1.time.escudo = "psg.jpg";

        jog1.mostrarNomeSobrenome();
    }
}
