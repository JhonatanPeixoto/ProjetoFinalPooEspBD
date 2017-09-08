
package br.ufg.inf.especializacao.databaseexample.model;

import java.util.Objects;

public class Contato {
    
    private TipoContato tipo;
    
    private String valor;

    public Contato() {
    }

    public TipoContato getTipo() {
        return tipo;
    }

    public void setTipo(TipoContato tipo) {
        if(tipo == null){
            throw new ModelException("Tipo do contato não pode "
                    + "ser nulo.");
        }
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        if(valor != null || "".equals(valor)){
            throw new ModelException("Valor do contato não pode ser "
                    + "vazio ou nulo");
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.tipo);
        hash = 79 * hash + Objects.hashCode(this.valor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contato other = (Contato) obj;
        if (!Objects.equals(this.valor, other.valor)) {
            return false;
        }
        return true;
    }
    
}
