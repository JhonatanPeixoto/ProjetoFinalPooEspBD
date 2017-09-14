/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consercionariaveiculos;

import br.ufg.inf.especializacao.model.Veiculo;
import br.ufg.inf.especilizacao.data.VeiculoDao;
import java.sql.SQLException;

/**
 *
 * @author casa
 */
public class ConsercionariaVeiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("OI");
        System.out.println("OI");
        System.out.println("Nada aqui");
        System.out.println("Jhonatan");

        VeiculoDao veiculoDao = new VeiculoDao();

        try {
            // List<Pessoa> pessoas = pessoaDAO.getAll();

            Veiculo veiculo = veiculoDao.getByChassi("WE62358988");

            System.out.println("Nome: " + veiculo.getNome());
            System.out.println("Marca: " + veiculo.getChassi());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Chassi: " + veiculo.getChassi());
            System.out.println("cor: " + veiculo.getCor());
            System.out.println("ano: " + veiculo.getAno());
            System.out.println("valor: " + veiculo.getValor());

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
