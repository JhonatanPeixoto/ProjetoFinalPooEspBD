
package br.ufg.inf.especilizacao.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexao {
    
  public Connection conectarNoBancoDeDados() throws ClassNotFoundException, SQLException {
      
      
      
	
		Class.forName("org.sqlite.JDBC");
		String url = "jdbc:sqlite:test.db";
                
		/*String usaruario = "root";
		String senha = "1525";*/
		Connection conexao = DriverManager.getConnection(url);
                
		return conexao;
	}
   
}   