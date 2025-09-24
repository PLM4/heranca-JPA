package br.edu.ifpb.es.daw.entities.projeto.concreto;

import java.time.LocalDate;

import br.edu.ifpb.es.daw.entities.projeto.Projeto;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("PROJETO_PEQUENO")
public class ProjetoPequeno extends Projeto {
    private LocalDate prazoMaximoDeConclusao;

    public ProjetoPequeno() {
    }

    public ProjetoPequeno(String nome, LocalDate prazoMaximoDeConclusao) {
        super(nome);
        this.prazoMaximoDeConclusao = prazoMaximoDeConclusao;
    }

    public LocalDate getPrazoMaximoDeConclusao() {
        return prazoMaximoDeConclusao;
    }

    public void setPrazoMaximoDeConclusao(LocalDate prazoMaximoDeConclusao) {
        this.prazoMaximoDeConclusao = prazoMaximoDeConclusao;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProjetoPequeno that = (ProjetoPequeno) obj;
        return prazoMaximoDeConclusao != null && prazoMaximoDeConclusao.equals(that.prazoMaximoDeConclusao);
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + (prazoMaximoDeConclusao != null ? prazoMaximoDeConclusao.hashCode() : 0);
    }

    @Override
    public String toString() {
        return "ProjetoPequeno{" +
                "prazoMaximoDeConclusao=" + prazoMaximoDeConclusao +
                ", " + super.toString() +
                '}';
    }
}
