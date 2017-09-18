
package br.ufg.inf.especilizacao.data;
<<<<<<< HEAD
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
=======

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexao {
    
  public Connection conectarNoBancoDeDados() throws ClassNotFoundException, SQLException {     
      
      
	
		Class.forName("org.sqlite.JDBC");
		String url = "jdbc:sqlite:test.db";               
		
		Connection conexao = DriverManager.getConnection(url);
                
		return conexao;
	}
   
}   
>>>>>>> 866c406d2527f52e965c16514fe3005c33bcf700
