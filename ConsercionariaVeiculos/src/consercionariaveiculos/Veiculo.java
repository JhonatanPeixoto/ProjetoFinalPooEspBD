
package br.ufg.inf.especializacao.databaseexample.model;

import java.util.List;

/**
 *
 * @author marceloquinta
 */
public class Veiculo {
    
    private int id;
    private String modelo;
    private String marca;
    private String chassi;
    
    private List<Contato> contatos;

    public Veiculo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id < 0){
            throw new ModelException("Identificador não pode ser "
                    + "negativo");
        }
        this.id = id;
        
    }

    public String getModelo() {
        return modelo;
    }
    public String getMarca(){
        return marca;
    }
    public String getChassi(){
        return chassi;
    }

    public void setModelo(String modelo) {
        if(modelo == null || "".equals(modelo)){
            throw new ModelException("Modelo do carro não pode ser "
                    + "vazio ou nulo");
        }
        this.modelo = modelo;
    }
    
     public void setMarca(String marca) {
        if(marca == null || "".equals(marca)){
            throw new ModelException("Marca do carro não pode ser "
                    + "vazio ou nulo");
        }
        this.marca = marca;
    }
     
     public void setChassi(String chassi) {
        if(chassi == null || "".equals(chassi)){
            throw new ModelException("Chassi do carro não pode ser "
                    + "vazio ou nulo");
        }
        this.chassi = chassi;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        if(contatos == null){
            throw new ModelException("A lista de contatos não pode ser "
                    + "nula.");
        }
        this.contatos = contatos;
    }
    
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(getId());
        builder.append(" - ");
        builder.append(getModelo());
          builder.append(getMarca());
            builder.append(getChassi());
      
        
        return builder.toString();
    }
}
