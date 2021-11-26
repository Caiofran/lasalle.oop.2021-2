package Semana11.Crudaluno.src.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Semana11.Crudaluno.src.Model.Aluno;
import Semana11.Crudaluno.src.jdbc.ConnectionFactory;

public class AlunoDAO {
    public void create(Aluno aluno)
    {
        Connection conexaoBD;
        PreparedStatement stmt = null;
        String sql = "insert into aluno(matricula, nome, telefone) values (?, ?, ?)";
        try {
            conexaoBD = ConnectionFactory.getConnection();
            stmt = conexaoBD.prepareStatement(sql);
            stmt.setString(1, aluno.getMatricula());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getTelefone());

            stmt.executeUpdate();

            System.out.println("[AlunoDAO]");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
