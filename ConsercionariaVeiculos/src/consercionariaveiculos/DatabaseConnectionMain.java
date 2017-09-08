
package br.ufg.inf.especializacao.databaseexample;

import br.ufg.inf.especializacao.databaseexample.data.VeiculoDAO;
import br.ufg.inf.especializacao.databaseexample.model.Veiculo;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * APrenda o tutorial aqui: http://www.tutorialspoint.com/sqlite/sqlite_java.htm
 */
public class DatabaseConnectionMain {

    public static void main(String[] args) {
        VeiculoDAO veiculoDAO = new VeiculoDAO();
        
        // criar veiculo no banco de dados
        
      Veiculo veiculo = new Veiculo();
       
        veiculo.setId(2);
        veiculo.setModelo("camaro s");
        veiculo.setMarca("chevro");
        veiculo.setChassi("ADFGO123hje");
        
        try {
            veiculoDAO.create(veiculo);
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro na operação: " 
                    + ex.getMessage());
        }
        
        /* Metodo de Update*/
       /* 
        ve  veiculo.setId(2);
        veiculo.setModelo("camaro s");
        veiculo.setMarca("chevrolet");
        veiculo.setChassi("ADFGO123hje");
         
        try {
            veiculoDAO.update(veiculo);
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro na operação: " 
                    + ex.getMessage());
        }
        */
        //remover veiculo
        
        veiculo.setId(1);
        veiculo.setModelo("fithonda");
        veiculo.setMarca("honda");
        veiculo.setChassi("qwer1234qwoe");
         try {
            veiculoDAO.delete(veiculo);
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro na operação: " 
                    + ex.getMessage());
        }
        
        //Listar todos do banco de dados
        
        try {
            List<Veiculo> veiculos = veiculoDAO.getAll();
            for(Veiculo umaVeiculo : veiculos){
                System.out.println(umaVeiculo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }

}
