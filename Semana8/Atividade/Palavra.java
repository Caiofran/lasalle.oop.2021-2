package Semana8.Atividade;
// Caio França Ricciardi 0050015558
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Palavra implements Comparable<Palavra> {
    private String palavra;
    private Integer qtdPalavra;

    public Palavra(String palavra) {
        this.palavra = palavra;
        this.qtdPalavra = obterQuantidadeDePalavras(palavra);
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public Integer getQtdPalavra() {
        return qtdPalavra;
    }

    public void setQtdPalavra(Integer qtdPalavra) {
        this.qtdPalavra = qtdPalavra;
    }

    public int obterQuantidadeDePalavras(String caminho) {

        String linha;
        int contPalavrasPorLinha;
        int contPalavrasArquivo = 0;

        // esse é um try with resources.
        // ele vai fechar o stream assim que terminar
        try (BufferedReader bf = new BufferedReader(new FileReader(caminho))) {

            linha = bf.readLine();

            while (linha != null) {

                System.out.println("Dados da linha: " + linha);

                linha = linha.trim();

                if (!linha.isEmpty()) {

                    contPalavrasPorLinha = 1;

                    linha = linha.replaceAll("\\s+", " ");

                    for (int i = 0; i < linha.length(); i++) {
                        if (linha.charAt(i) == ' ') {
                            contPalavrasPorLinha++;
                        }
                    }

                    System.out.printf("há %d palavras na linha %s\n\n", contPalavrasPorLinha, linha);

                    contPalavrasArquivo += contPalavrasPorLinha;

                }

                linha = bf.readLine();

            }

            System.out.printf("há %d palavras no arquivo\n", contPalavrasArquivo);

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        return contPalavrasArquivo;

    }

    @Override
    public String toString() {
        return palavra;
    }

    @Override
    public int compareTo(Palavra outraPalavra) {
        if (this.qtdPalavra < outraPalavra.getQtdPalavra())
            return 1;
        else if (this.qtdPalavra > outraPalavra.getQtdPalavra())
            return -1;
        else
            return 0;
    }
}
