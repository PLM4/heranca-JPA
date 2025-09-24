package br.edu.ifpb.es.daw.entities.veiculo.concreto;

import br.edu.ifpb.es.daw.entities.veiculo.VeiculoDePassageiros;
import jakarta.persistence.Entity;

@Entity
public class Bicicleta extends VeiculoDePassageiros {

    private Integer alturaDoSelimEmCm;

    public Bicicleta() {
    }

    public Bicicleta(String nome, String construtora, Integer numeroMaximoPassageiros, Integer alturaDoSelimEmCm) {
        super(nome, construtora, numeroMaximoPassageiros);
        this.alturaDoSelimEmCm = alturaDoSelimEmCm;
    }

    public Integer getAlturaDoSelimEmCm() {
        return alturaDoSelimEmCm;
    }

    public void setAlturaDoSelimEmCm(Integer alturaDoSelimEmCm) {
        this.alturaDoSelimEmCm = alturaDoSelimEmCm;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((alturaDoSelimEmCm == null) ? 0 : alturaDoSelimEmCm.hashCode());
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
        Bicicleta other = (Bicicleta) obj;
        if (alturaDoSelimEmCm == null) {
            if (other.alturaDoSelimEmCm != null)
                return false;
        } else if (!alturaDoSelimEmCm.equals(other.alturaDoSelimEmCm))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Bicicleta [alturaDoSelimEmCm=" + alturaDoSelimEmCm + ", toString()=" + super.toString() + "]";
    }

}