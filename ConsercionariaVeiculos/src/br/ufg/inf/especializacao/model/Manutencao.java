/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.especializacao.model;

import java.sql.Date;

/**
 *
 * @author casa
 */
public class Manutencao {
    
    private String cpf_func;
    private String chassi;
    private int cod_servico;
    private Date data_manutencao;
    private boolean aberto;
    private boolean em_andamento;
    private boolean encerrado;    

    public String getCpf_func() {
        return cpf_func;
    }

    public void setCpf_func(String cpf_func) {
        this.cpf_func = cpf_func;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getCod_servico() {
        return cod_servico;
    }

    public void setCod_servico(int cod_servico) {
        this.cod_servico = cod_servico;
    }

    public Date getData_manutencao() {
        return data_manutencao;
    }

    public void setData_manutencao(Date data_manutencao) {
        this.data_manutencao = data_manutencao;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean isEm_andamento() {
        return em_andamento;
    }

    public void setEm_andamento(boolean em_andamento) {
        this.em_andamento = em_andamento;
    }

    public boolean isEncerrado() {
        return encerrado;
    }

    public void setEncerrado(boolean encerrado) {
        this.encerrado = encerrado;
    }
    
    
    
    
}
