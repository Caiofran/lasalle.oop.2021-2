package Semana6;

public class Funcionario extends Pessoa {
    private String setor;
    private String trabalhando;

    public void mudarTrabalho()
    {

    }

    //Metodos acessores: getters/setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(String trabalhando) {
        this.trabalhando = trabalhando;
    }

    @Override
    public void saudacao() {
        // TODO Auto-generated method stub
        
    }    
}
