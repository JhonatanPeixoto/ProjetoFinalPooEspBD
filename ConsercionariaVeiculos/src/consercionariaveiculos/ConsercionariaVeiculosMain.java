
package consercionariaveiculos;

import br.ufg.inf.especializacao.model.Veiculo;
import br.ufg.inf.especilizacao.data.Conexao;
import br.ufg.inf.especilizacao.data.VeiculoDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConsercionariaVeiculosMain {

    public static void main(String[] args) {
      
     
        VeiculoDao veiculoDAO = new VeiculoDao();
        
        // criar veiculo no banco de dados
        
    
        Veiculo veiculo = new Veiculo();
        veiculo.setId_veiculo(1);
        veiculo.setChassi("welkh123klh");
        veiculo.setNome("fusca");
        veiculo.setMarca("volkswagem");
        veiculo.setModelo("hath");
        veiculo.setCor("preto");
        veiculo.setAno("11-12-2017");
        veiculo.setValor(70.000);
       
        
        try {
          //  veiculoDAO.incluirVeiculo(veiculo);
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro na operação: " 
                    + ex.getMessage());
        }
          Conexao conexao = new Conexao();
		try {
			conexao.conectarNoBancoDeDados();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
        
    }      
 }
}