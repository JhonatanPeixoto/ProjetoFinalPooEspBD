<<<<<<< HEAD
package consercionariaveiculos;

import br.ufg.inf.especializacao.model.Funcionario;
import br.ufg.inf.especilizacao.data.FuncionarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConsercionariaVeiculosMain {

    FuncionarioDAO dao = new FuncionarioDAO();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   FuncionarioDAO dao = new FuncionarioDAO();
          
        List<Funcionario>lista = new ArrayList<>();
        try {
            lista = dao.listarFuncionario();
           System.out.print("Os funcionarios são. \n" + lista);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
      
    }
} 
               /************** EXCLUIR FUNCIONARIO VIA CPF ***********
        
        
         pessoa.setCpf("037814331");
        
        
        try {
            dao.excluirFuncionario(pessoa);
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro na operação: " 
                    + ex.getMessage());
        } 
         System.out.println("pessoa excluida com sucesso! ");
       
        /*************** ADCIONAR PESSOA ********************
               
        pessoa.setCpf("030.815.331-04");
        pessoa.setNome("MARCOS RODRIGUES");
        pessoa.setSexo("M");
        pessoa.setSalario(300.00);
        pessoa.setDatanasc(new Date(11-05-1990));
              
        try {
            dao.incluirFuncionario(pessoa);
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro na operação: " 
                    + ex.getMessage());
        }     System.out.println("Funcionario incluido com sucesso! ");
        
        /************ alterar *********************
        
       pessoa.setCpf("037.814.331-02");
        pessoa.setNome("MARCIEL RODRIGUES");
        pessoa.setSexo("M");
        pessoa.setSalario(30.000);
        pessoa.setDatanasc(new Date(11-01-1992));
              
        try {
            dao.atualizarFuncionario(pessoa);
=======

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
>>>>>>> 866c406d2527f52e965c16514fe3005c33bcf700
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro na operação: " 
                    + ex.getMessage());
        }
<<<<<<< HEAD
                  
         
    */
=======
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
>>>>>>> 866c406d2527f52e965c16514fe3005c33bcf700
