package Semana8.Atividade;
// Caio França Ricciardi 0050015558
import java.util.List;
// Faça um programa em java para ler um arquivo texto qualquer, calcular a nuvem de palavras e exibir 
// as 10 maiores na tela.

public class NuvemTester {
    public static void main(String[] args) {
        Arquivo arq = new Arquivo("Semana8/Atividade/palavra.txt");
        List<Palavra> palavras = arq.lerPalavras();

        for (Palavra palavra : palavras) {
            System.out.println(palavra);
        }
    }
}
