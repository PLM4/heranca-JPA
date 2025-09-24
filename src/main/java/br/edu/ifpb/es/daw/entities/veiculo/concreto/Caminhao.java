package br.edu.ifpb.es.daw.entities.veiculo.concreto;

import br.edu.ifpb.es.daw.entities.veiculo.VeiculoDeTransporte;
import jakarta.persistence.Entity;

@Entity
public class Caminhao extends VeiculoDeTransporte {

    private Integer numeroDeVagoes;

    public Caminhao() {
    }

    public Caminhao(String nome, String construtora, Integer cargaMaximaKg, Integer numeroDeVagoes) {
        super(nome, construtora, cargaMaximaKg);
        this.numeroDeVagoes = numeroDeVagoes;
    }

    public Integer getNumeroDeVagoes() {
        return numeroDeVagoes;
    }

    public void setNumeroDeVagoes(Integer numeroDeVagoes) {
        this.numeroDeVagoes = numeroDeVagoes;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((numeroDeVagoes == null) ? 0 : numeroDeVagoes.hashCode());
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
        Caminhao other = (Caminhao) obj;
        if (numeroDeVagoes == null) {
            if (other.numeroDeVagoes != null)
                return false;
        } else if (!numeroDeVagoes.equals(other.numeroDeVagoes))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Caminhao [numeroDeVagoes=" + numeroDeVagoes + ", toString()=" + super.toString() + "]";
    }
}