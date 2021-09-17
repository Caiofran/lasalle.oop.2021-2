package Semana6;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String nome) {
        super(nome);
    }

    public void cancelarMatricula()
    {
        System.out.println("Matricula cancelada!!!");
    }

    //Metodos acessores: getters/setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void saudacao() {
        // TODO Auto-generated method stub
        
    }

    
}
