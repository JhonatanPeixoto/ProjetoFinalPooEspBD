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
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro na operação: " 
                    + ex.getMessage());
        }
                  
         
    */
