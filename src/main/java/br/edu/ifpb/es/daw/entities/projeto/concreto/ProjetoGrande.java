package br.edu.ifpb.es.daw.entities.projeto.concreto;

import java.math.BigDecimal;

import br.edu.ifpb.es.daw.entities.projeto.Projeto;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("PROJETO_GRANDE")
public class ProjetoGrande extends Projeto {

    private BigDecimal orcamento;

    public ProjetoGrande() {
    }

    public ProjetoGrande(String nome, BigDecimal orcamento) {
        super(nome);
        this.orcamento = orcamento;
    }

    public BigDecimal getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(BigDecimal orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((orcamento == null) ? 0 : orcamento.hashCode());
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
        ProjetoGrande other = (ProjetoGrande) obj;
        if (orcamento == null) {
            if (other.orcamento != null)
                return false;
        } else if (!orcamento.equals(other.orcamento))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ProjetoGrande{" +
                "orcamento=" + orcamento +
                ", " + super.toString() +
                '}';
    }

}