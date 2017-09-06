/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.especializacao.model;

/**
 *
 * @author casa
 */
public class Departamento {
    
    private int num_depto;
    private String nome_depto;
    private String local_depto;
    private String cpf_gerente;
    

    public int getNum_depto() {
        return num_depto;
    }

    public void setNum_depto(int num_depto) {
        this.num_depto = num_depto;
    }

    public String getNome_depto() {
        return nome_depto;
    }

    public void setNome_depto(String nome_depto) {
        this.nome_depto = nome_depto;
    }

    public String getLocal_depto() {
        return local_depto;
    }

    public void setLocal_depto(String local_depto) {
        this.local_depto = local_depto;
    }

    public String getCpf_gerente() {
        return cpf_gerente;
    }

    public void setCpf_gerente(String cpf_gerente) {
        this.cpf_gerente = cpf_gerente;
    }
    
    
    
}
