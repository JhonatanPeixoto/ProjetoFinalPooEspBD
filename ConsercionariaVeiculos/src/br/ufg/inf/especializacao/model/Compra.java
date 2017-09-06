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
public class Compra {    
    private String cnpj_fornecedor;
    private String cpf_func;
    private String chassi;
    private Date datavenda;
    private double vlrunitario;
    private int qtde;
    private double vlrprodutos;
    private double desconto;
    private double vlrtotal;

    public String getCnpj_fornecedor() {
        return cnpj_fornecedor;
    }

    public void setCnpj_fornecedor(String cnpj_fornecedor) {
        this.cnpj_fornecedor = cnpj_fornecedor;
    }

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

    public Date getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(Date datavenda) {
        this.datavenda = datavenda;
    }

    public double getVlrunitario() {
        return vlrunitario;
    }

    public void setVlrunitario(double vlrunitario) {
        this.vlrunitario = vlrunitario;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getVlrprodutos() {
        return vlrprodutos;
    }

    public void setVlrprodutos(double vlrprodutos) {
        this.vlrprodutos = vlrprodutos;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getVlrtotal() {
        return vlrtotal;
    }

    public void setVlrtotal(double vlrtotal) {
        this.vlrtotal = vlrtotal;
    }
    
    
    
    
    
    
}
