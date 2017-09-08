
package br.ufg.inf.especializacao.databaseexample.data;

import br.ufg.inf.especializacao.databaseexample.model.Veiculo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class VeiculoDAO {

    private final String TABLE_NAME = "PESSOA";
    private final String COLUMN_ID = "ID";
    private final String COLUMN_NAME = "NOME";
    private final String COLUMN_MARCA = "MARCA";
    private final String COLUMN_CHASSI = "CHASSI";

    public void create(Veiculo veiculo) throws SQLException {
        final String SQL = "INSERT INTO " +TABLE_NAME +"(" + COLUMN_ID + ","+ COLUMN_NAME +"," + COLUMN_MARCA +"," + COLUMN_CHASSI + ") VALUES"
                + " (" + veiculo.getId() + ",\'" + veiculo.getModelo() + ",\'"  + veiculo.getMarca()+ ",\'" + veiculo.getChassi() + "\')";
        Connection connection = ConnectionUtils.getConnection();
        Statement comando = null;
        ResultSet resultado = null;
        try { 
            comando = connection.createStatement();
            comando.executeUpdate(SQL);
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            if(comando !=null) {
                comando.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    public Veiculo getByName(String nome) throws SQLException {
        final String QUERY = "SELECT * FROM " + TABLE_NAME + " WHERE "+
                COLUMN_NAME+ "=\'" + nome + "\';";
        Connection connection = ConnectionUtils.getConnection();
        Statement comando = null;
        ResultSet resultado = null;
        try {
            comando = connection.createStatement();
            resultado = comando.executeQuery(QUERY);

            if (!resultado.next()) {
                throw new RuntimeException("Não foi encontrada a veiculo com o "
                        + " nome determinado");
            }
        

            Veiculo veiculo = new Veiculo();
            
            veiculo.setId(resultado.getInt(COLUMN_ID));
            veiculo.setModelo(resultado.getString(COLUMN_NAME));
            veiculo.setMarca(resultado.getString(COLUMN_MARCA));
            veiculo.setChassi(resultado.getString(COLUMN_CHASSI));
            
            return veiculo;
        } catch (SQLException e) {
            throw new RuntimeException("Veiculo não encontrada");
        } finally {
            if(comando != null){
                comando.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
///////////////////////////////
    
    public Veiculo getByMarca(String marca) throws SQLException {
        final String QUERY = "SELECT * FROM " + TABLE_NAME + " WHERE "+
                COLUMN_MARCA+ "=\'" + marca + "\';";
        Connection connection = ConnectionUtils.getConnection();
        Statement comando = null;
        ResultSet resultado = null;
        try {
            comando = connection.createStatement();
            resultado = comando.executeQuery(QUERY);

            if (!resultado.next()) {
                throw new RuntimeException("Não foi encontrada a veiculo com a "
                        + " marca determinado");
            }
        

            Veiculo veiculo = new Veiculo();
            
            veiculo.setId(resultado.getInt(COLUMN_ID));
            veiculo.setModelo(resultado.getString(COLUMN_NAME));
            veiculo.setMarca(resultado.getString(COLUMN_MARCA));
            veiculo.setChassi(resultado.getString(COLUMN_CHASSI));
            
            return veiculo;
        } catch (SQLException e) {
            throw new RuntimeException("Veiculo não encontrada");
        } finally {
            if(comando != null){
                comando.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }  
    
      public Veiculo getByChassi(String chassi) throws SQLException {
        final String QUERY = "SELECT * FROM " +
                TABLE_NAME + " WHERE "+
                COLUMN_CHASSI+ "=\'" +
                chassi + "\';";
        Connection connection = ConnectionUtils.getConnection();
        Statement comando = null;
        ResultSet resultado = null;
        try {
            comando = connection.createStatement();
            resultado = comando.executeQuery(QUERY);

            if (!resultado.next()) {
                throw new RuntimeException("Não foi encontrada a veiculo com o "
                        + " chassi determinado");
            }
        

            Veiculo veiculo = new Veiculo();
            
            veiculo.setId(resultado.getInt(COLUMN_ID));
            veiculo.setModelo(resultado.getString(COLUMN_NAME));
            veiculo.setMarca(resultado.getString(COLUMN_MARCA));
            veiculo.setChassi(resultado.getString(COLUMN_CHASSI));
            
            return veiculo;
        } catch (SQLException e) {
            throw new RuntimeException("Veiculo não encontrada");
        } finally {
            if(comando != null){
                comando.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }  
    
    public Veiculo getByCod(int cod) throws SQLException {
        final String QUERY = "SELECT * FROM " + TABLE_NAME + " WHERE "
                + COLUMN_ID + "=" + cod + ";";
        Connection connection = ConnectionUtils.getConnection();
        Statement comando = null;
        ResultSet resultado = null;
        try {
            comando = connection.createStatement();
            resultado = comando.executeQuery(QUERY);

            if (!resultado.next()) {
                throw new RuntimeException("Não foi encontrada a veiculo com o "
                        + "código determinado");
            }

            Veiculo veiculo = new Veiculo();
            veiculo.setId(resultado.getInt(COLUMN_ID));
            veiculo.setModelo(resultado.getString(COLUMN_NAME));
            veiculo.setMarca(resultado.getString(COLUMN_MARCA));
            veiculo.setChassi(resultado.getString(COLUMN_CHASSI));
            return veiculo;
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
        
        throw new SQLException("Pessoa não encontrada com o identificador"
                + cod);
    }

    public void delete(Veiculo veiculo) throws SQLException {
        String query = "DELETE from " + TABLE_NAME
                + " where " + COLUMN_ID + "=" + veiculo.getId() + ";";

        ConnectionUtils.executeVoidQuery(query);
    }
    
    public List<Veiculo> getAll() throws SQLException{
        final String sql = "SELECT * from " + TABLE_NAME;
        Connection connection = null;
        PreparedStatement statement = null;
        
        List<Veiculo> veiculos = new ArrayList();
        
        try{
            connection = ConnectionUtils.getConnection();
            statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                int id = result.getInt(COLUMN_ID);
                String nome = result.getString(COLUMN_NAME);
                 String marca = result.getString(COLUMN_MARCA);
                  String chassi = result.getString(COLUMN_CHASSI);
                  
                Veiculo veiculo = new Veiculo();
                veiculo.setId(id);
                veiculo.setModelo(nome);
                 veiculo.setMarca(marca);
                  veiculo.setChassi(chassi);
                
                veiculos.add(veiculo);
            }
        } catch (SQLException e){
            throw e;
        } finally{
            if(statement != null){
                statement.close();
            }
            if(connection != null){
                connection.close();
            }
        }
        
        return veiculos;
        
    }
    
    public boolean update(Veiculo veiculo) throws SQLException {
        String sqlUpdate = "UPDATE " + TABLE_NAME + " SET " + COLUMN_NAME + 
                                 " = ?" + COLUMN_MARCA + " = ?" + COLUMN_CHASSI + " = ?" +
                            " WHERE " + COLUMN_ID + "= ?";
        Connection connection = null;
        PreparedStatement procedure = null;
            connection = ConnectionUtils.getConnection();
            try { 
                procedure = connection.prepareStatement(sqlUpdate);
                 procedure.setString(4, veiculo.getChassi());
                 procedure.setString(3, veiculo.getMarca());
                procedure.setString(1, veiculo.getModelo());
                procedure.setInt(2, veiculo.getId());
                int result = procedure.executeUpdate();
                if(result == 1){
                    connection.commit();
                    return true;
                }     
            }catch (SQLException e) {
                throw new SQLException(e.getMessage());
            } finally {
                if(procedure != null){
                    procedure.close();
                }
                if(connection != null){
                    connection.close();
                }
            }
            return false;
    }
}
