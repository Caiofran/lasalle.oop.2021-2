package Semana5.TrabalhoRefatoracao;
// 3-Incluir nesse sistema uma classe nova chamada de Escalacao.java
// - A escalação de um time pode ter no máximo 5 jogadores e 1 Time
// - A escalação também deverá ter um método imprimir() que imprime o time e a escalação atual exemplo:
// Time: Flamengo
// -------------------------
// 1-Raul
// 2-Zico
// 3-Junior
// 4-Andrade
// 5-Nunes
public class Escalacao {
    
    
    private Integer qtdJogadores;
    private Integer jogadorAtual = 1;
    // Time time = new Time();
    private Time time;
    
    public Escalacao(){
        this.qtdJogadores = 5;
    }
    
    public void criacaoJogardor()
    {
        if(this.jogadorAtual==this.qtdJogadores)
        {
            System.out.println("Já estou no limite máximo de jogadores." );
        }
        else
        {
            this.jogadorAtual++;
        }
    }

    public void imprimir()
    {
        
    }

    // public void diminuirMarcha()
    // {
    //     if(this.jogadorAtual == 1)
    //         System.out.println("Já estou na marcha mínima.");
    //     else
    //         this.jogadorAtual--;
    // }
}
