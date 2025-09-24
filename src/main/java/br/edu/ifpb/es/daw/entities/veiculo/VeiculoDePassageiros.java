package br.edu.ifpb.es.daw.entities.veiculo;

import jakarta.persistence.Entity;

@Entity
public abstract class VeiculoDePassageiros extends Veiculo{

    private Integer numeroMaximoPassageiros;

    public VeiculoDePassageiros() {
    }

    public VeiculoDePassageiros(String nome, String construtora, Integer numeroMaximoPassageiros) {
        super(nome, construtora);
        this.numeroMaximoPassageiros = numeroMaximoPassageiros;
    }

    public Integer getNumeroMaximoPassageiros() {
        return numeroMaximoPassageiros;
    }

    public void setNumeroMaximoPassageiros(Integer numeroMaximoPassageiros) {
        this.numeroMaximoPassageiros = numeroMaximoPassageiros;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((numeroMaximoPassageiros == null) ? 0 : numeroMaximoPassageiros.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        VeiculoDePassageiros other = (VeiculoDePassageiros) obj;
        if (numeroMaximoPassageiros == null) {
            if (other.numeroMaximoPassageiros != null)
                return false;
        } else if (!numeroMaximoPassageiros.equals(other.numeroMaximoPassageiros))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "VeiculoDePassageiros [numeroMaximoPassageiros=" + numeroMaximoPassageiros + ", toString()="
                + super.toString() + "]";
    }
}