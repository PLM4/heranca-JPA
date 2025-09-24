package br.edu.ifpb.es.daw.entities.veiculo.concreto;

import br.edu.ifpb.es.daw.entities.veiculo.VeiculoDePassageiros;
import jakarta.persistence.Entity;

@Entity
public class Carro extends VeiculoDePassageiros {

    private Integer quantidadePortas;

    public Carro() {
    }

    public Carro(String nome, String construtora, Integer numeroMaximoPassageiros, Integer quantidadePortas) {
        super(nome, construtora, numeroMaximoPassageiros);
        this.quantidadePortas = quantidadePortas;
    }

    public Integer getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(Integer quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((quantidadePortas == null) ? 0 : quantidadePortas.hashCode());
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
        Carro other = (Carro) obj;
        if (quantidadePortas == null) {
            if (other.quantidadePortas != null)
                return false;
        } else if (!quantidadePortas.equals(other.quantidadePortas))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Carro [quantidadePortas=" + quantidadePortas + ", toString()=" + super.toString() + "]";
    }

}