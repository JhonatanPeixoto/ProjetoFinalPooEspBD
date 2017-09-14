package br.ufg.inf.especilizacao.data;

import br.ufg.inf.especializacao.model.Veiculo;
import br.ufg.inf.especializacao.model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VeiculoDao {

    /*
    public void incluirVeiculo(Veiculo veiculo) throws ClassNotFoundException, SQLException {

        Conexao conexao = new Conexao();
        Connection con = conexao.conectarNoBancoDeDados();
        

        String sql = "INSERT INTO VEICULOS(ID, CHASSI, NAME, MARCA, MODELO, COR, ANO, VALOR)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setLong(1, veiculo.getId_veiculo());
        ps.setString(2, veiculo.getChassi());
        ps.setString(3, veiculo.getNome());
        ps.setString(4, veiculo.getMarca());
        ps.setString(5, veiculo.getModelo());
        ps.setString(6, veiculo.getCor());
        ps.setString(7, veiculo.getAno());
        ps.setDouble(8, veiculo.getValor());
        ps.executeUpdate();
        ps.close();
        con.close();

    }

  

    public void incluirVendaVeiculo(Venda venda) throws ClassNotFoundException, SQLException {

        Conexao conexao = new Conexao();
        Connection con = conexao.conectarNoBancoDeDados();
        String sql = "INSERT INTO VENDA(ID_CLIENTE, CPF_FUNC, CHASSI, DATA_VENDA, QTDE, VALOR_UNITARIO, DESCONTO, VALORTOTAL)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setLong(1, venda.getId_cliente());
        ps.setString(2, venda.getCpf_func());
        ps.setString(3, venda.getChassi());
        ps.setDate(4, venda.getDataVenda());
        ps.setInt(5, venda.getQtde());
        ps.setFloat(6, venda.getValorUnitario());
        ps.setFloat(7, venda.getDesconto());
        ps.setFloat(8, venda.getVlrtotal());
        ps.executeUpdate();
        ps.close();
        con.close();
    }
     */
    public Veiculo getByChassi(String chassi) throws SQLException {
        final String QUERY = "SELECT a.id_veiculo,\n"
                + "       nome,\n"
                + "       marca,\n"
                + "       modelo,\n"
                + "       chassi,\n"
                + "       cor,\n"
                + "       ano,\n"
                + "       valor\n"
                + "  FROM veiculo_estoque a\n"
                + "  inner join veiculo b\n"
                + "  on a.id_veiculo = b.id_veiculo where chassi = ?;";

        //System.out.println("SQL: " + QUERY);

        Connection connection = null;
        PreparedStatement ps = null;
        Veiculo veiculo = new Veiculo();
        try {

            connection = ConnectionUtils.getConnection();
            ps = connection.prepareStatement(QUERY);
            ps.setString(1, chassi);

            ResultSet result = ps.executeQuery();

            if (!result.next()) {
                veiculo.setChassi("");
            }else{
            

            veiculo.setId_veiculo(result.getInt("id_veiculo"));
            veiculo.setNome(result.getString("nome"));
            veiculo.setMarca(result.getString("marca"));
            veiculo.setModelo(result.getString("modelo"));
            veiculo.setChassi(result.getString("chassi"));
            veiculo.setCor(result.getString("cor"));
            veiculo.setAno(result.getString("ano"));
            veiculo.setValor(result.getDouble("valor"));
            }

            return veiculo;
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        } finally {
            if (connection != null) {
                connection.close();
            }
        }

        throw new SQLException("Veiculo não encontrado com o chassi"
                + chassi);
    }

}
