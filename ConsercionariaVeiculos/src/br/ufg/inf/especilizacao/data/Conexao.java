
package br.ufg.inf.especilizacao.data;
import java.sql.*;
public class Conexao{
    
         public static void main(String[] args) throws Exception {
         }
         
          public static Connection conectarNoBancoDeDados() {
        
                   Connection conexao = null;
                   try {
                            Class.forName("oracle.jdbc.driver.OracleDriver");
                            conexao = DriverManager.getConnection(
                            "jdbc:oracle:thin:@localhost:1521:XE", "system", "123");
                            
                   } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                   } catch (SQLException e) {
                            e.printStackTrace();
                   }
                   return conexao;
         }

}
