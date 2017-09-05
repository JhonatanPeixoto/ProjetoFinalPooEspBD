/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.especializacao.model;

import java.sql.Date;

/**
 *
 * @author Jhonatan
 */
public class Funcionario {
    
    private String cpf_p_fisica;
    private String nome;
    private String salario;
    private char sexo;
    private Date datanasc;
    private int num_depto;

    public String getCpf_p_fisica() {
        return cpf_p_fisica;
    }

    public void setCpf_p_fisica(String cpf_p_fisica) {
        this.cpf_p_fisica = cpf_p_fisica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Date datanasc) {
        this.datanasc = datanasc;
    }

    public int getNum_depto() {
        return num_depto;
    }

    public void setNum_depto(int num_depto) {
        this.num_depto = num_depto;
    }
    
    
    
}
