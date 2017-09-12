
package br.ufg.inf.especializacao.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class CriarTabela {
    public static void main(String[] args) {
        
        
        /*criar tabela veiculo*/
     /*
      Connection c = null;
      Statement stmt = null;
      
      try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:test.db");
         System.out.println("Opened database successfully");

         stmt = c.createStatement();
         String sql = "CREATE TABLE VEICULOS " +
                        "(ID INT PRIMARY KEY     NOT NULL," +
                        " CHASSI          TEXT    NOT NULL, " + 
                        " NAME            TEXT    NOT NULL, " + 
                        " MARCA            TEXT    NOT NULL, " + 
                        " MODELO           TEXT    NOT NULL, " + 
                        " COR              TEXT    NOT NULL, " + 
                        " ANO              TEXT(4), " + 
                        " VALOR       FLOT NOT NULL)"; 
         stmt.executeUpdate(sql);
         stmt.close();
         c.close();
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
      System.out.println("Table created successfully");
   */
     
     Connection c = null;
      Statement stmt = null;
      
      try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:test.db");
         System.out.println("Opened database successfully");

         stmt = c.createStatement();
         String sql = "CREATE TABLE VENDA " +
                        "(ID_CLIENTE   INT PRIMARY KEY NOT NULL," +
                        " CPF_FUNC          TEXT    NOT NULL, " + 
                        " CHASSI          TEXT    NOT NULL, " + 
                        " DATA_VENDA           DATE   NOT NULL, " + 
                        " QTDE                 INT    NOT NULL, " + 
                        " VALOR_UNITARIO       FLOT NOT   NULL, " +
                        " DESCONTO           FLOAT    NOT NULL, " + 
                        " VALORTOTAL       FLOT NOT NULL)"; 
          
         
         stmt.executeUpdate(sql);
         stmt.close();
         c.close();
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
      System.out.println("Table created successfully");
   
    } 
    } 
