/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.especializacao.databaseexample.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author marceloquinta
 */
public class ConnectionUtils {

    public static void executeVoidQuery(String sql) throws SQLException {
        Connection connection = null;
        Statement comando = null;
        
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:test.db");
            connection.setAutoCommit(false);
            comando = connection.createStatement();
            comando.execute(sql);//varios Execute

            connection.commit();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        } finally {
            if(comando != null){
                comando.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
    
    public static ResultSet executeResultSetQuery(String sql) throws Exception {
        Connection connection = null;
        Statement comando = null;
        
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:test.db");
            connection.setAutoCommit(false);
            comando = connection.createStatement();
            return comando.executeQuery(sql);//varios Execute

        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            if(comando != null){
                comando.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
    
    public static Connection getConnection() throws RuntimeException{
        Connection connection = null;
        Statement comando = null;
        ResultSet resultado = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:test.db");
            connection.setAutoCommit(false);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Não foi possivel conectar com o banco");
        }
        return connection;
    }
    
    
}
