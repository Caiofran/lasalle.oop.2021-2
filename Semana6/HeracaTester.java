package Semana6;

import javax.swing.AbstractAction;

public class HeracaTester {
    public static void main(String[] args) {
        // Pessoa pessoa = new Pessoa("Caio");
        // Pessoa pessoa = new Pessoa();

        // pessoa.setNome("Caio");
        // pessoa.setSexo("m");
        // pessoa.fazerAniversario();

        //aluno
        Aluno aluno = new Aluno("s");
        // aluno.setNome("Aluno novo");;
        aluno.fazerAniversario();
        // aluno.cancelarMatricula();

        //Professor
        Professor professor = new Professor();
        professor.setSalario(100.0f);
        professor.setNome("Alex");

        System.out.println("Salario: " + professor.getSalario());
        professor.receberAumento();

        //Funcionario
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setSetor("estoque");
        // funcionario.setTrabalhando("trabalhando");
        funcionario.mudarTrabalho();

        aluno.saudacao();
    }
}
