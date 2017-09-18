package br.ufg.inf.especilizacao.data;

import br.ufg.inf.especializacao.model.Funcionario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

    Conexao conexao = new Conexao();
    Connection con = conexao.conectarNoBancoDeDados();

    /**
     * ******************* Metodo Incluir funcionario**********************
     */
    public void incluirFuncionario(Funcionario funcionario) throws ClassNotFoundException, SQLException {

        String sql = "INSERT INTO FUNCIONARIO(CPF, NOME, SEXO, DATA_NASC, SALARIO) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, funcionario.getCpf());
        ps.setString(2, funcionario.getNome());
        ps.setString(3, funcionario.getSexo());
        ps.setDate(4, new Date(funcionario.getDatanasc().getTime()));
        ps.setDouble(5, funcionario.getSalario());

        ps.executeUpdate();

        if (ps != null) {
            ps.close();
            if (con != null) {
                con.close();
            }
        }
    }

    /**
     * ******************* Metodo Excluir funcionario**********************
     */

    public void excluirFuncionario(Funcionario funcionario) throws ClassNotFoundException, SQLException {

        String sql = "DELETE FROM FUNCIONARIO WHERE CPF= ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, funcionario.getCpf());

        ps.executeUpdate();
        if (ps != null) {
            ps.close();
            if (con != null) {
                con.close();
            }
        }
    }

    /**
     * ******************* Metodo Atualizar funcionario**********************
     * @throws java.sql.SQLException
     */
    public void atualizarFuncionario(Funcionario funcionario) throws SQLException {

        String sql = "UPDATE FUNCIONARIO SET CPF=?, NOME=?, SEXO=?, DATA_NASC=?, SALARIO=? ";

        PreparedStatement ps = con.prepareStatement(sql);
        try {
            ps.setString(1, funcionario.getCpf());
            ps.setString(2, funcionario.getNome());
            ps.setString(3, funcionario.getSexo());
            ps.setDate(4, new Date(funcionario.getDatanasc().getTime()));
            ps.setDouble(5, funcionario.getSalario());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Error ao enserir funcionario");
        } finally {
            if (ps != null) {
                ps.close();
                if (con != null) {
                    con.close();
                }
            }
        }
    }

    /**
     * ******************* Metodo listar funcionari
     *
     * @return o
     *
     * @throws java.sql.SQLException*********************
     */

    public List<Funcionario>listarFuncionario() throws SQLException {

       Connection conn = Conexao.conectarNoBancoDeDados();

          String sql = "SELECT F.CPF, F.NOME, F.SEXO, F.DATA_NASC, F.SALARIO FROM FUNCIONARIO F ";
         
          PreparedStatement  ps = conn.prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
          
              List<Funcionario> listaRetorno = new ArrayList<Funcionario>();
                
            while (rs.next()) {
                
                Funcionario funcionario = new Funcionario();

			funcionario.setCpf(rs.getString("CPF"));
			funcionario.setNome(rs.getString("NOME"));
			funcionario.setSexo(rs.getString("SEXO"));
			funcionario.setDatanasc(rs.getDate("DATA_NASC"));
                        funcionario.setSalario(rs.getDouble("SALARIO"));

                listaRetorno.add(funcionario);
            
            }
                conn.close();
                 rs.close();
                 ps.close();
                return listaRetorno;
              
    }  
}
