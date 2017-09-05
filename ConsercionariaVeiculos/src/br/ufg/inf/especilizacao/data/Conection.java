/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.especilizacao.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jhonatan
 */
public class Conection {
    
       
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
