package Semana8.Atividade;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {

    private String nomeArq;

    public Arquivo(String caminho) {
        this.nomeArq = caminho;
    }

    public void imprimir() {
        try (BufferedReader reader = new BufferedReader(new FileReader(this.nomeArq))) {
            String linha = reader.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = reader.readLine();
            }

        } catch (Exception e) {
            System.out.println(("Erro ao tentar ler arquivo!!" + e.getMessage()));
        }
    }

    public List<Palavra> lerPalavras() {

        List<Palavra> listaPalavras = new ArrayList<Palavra>();

        try (BufferedReader reader = new BufferedReader(new FileReader(this.nomeArq))) {
            String linha = reader.readLine();

            while (linha != null) {
                // separar nome de votos (alex,30)
                String[] palavraLista = linha.split(" ");
                Palavra palavra = new Palavra(palavraLista[0]);

                listaPalavras.add(palavra);

                // System.out.println(linha);
                linha = reader.readLine();
            }

        } catch (Exception e) {
            System.out.println(("Erro ao tentar ler arquivo!!" + e.getMessage()));
        }

        return listaPalavras;

    }
}
