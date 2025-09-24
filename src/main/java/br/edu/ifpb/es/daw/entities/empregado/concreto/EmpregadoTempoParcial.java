package br.edu.ifpb.es.daw.entities.empregado.concreto;

import java.math.BigDecimal;
import br.edu.ifpb.es.daw.entities.empregado.Empregado;
import jakarta.persistence.Entity;

@Entity
public class EmpregadoTempoParcial extends Empregado {

    private BigDecimal salarioHora;

    public EmpregadoTempoParcial() {
    }

    public EmpregadoTempoParcial(String nome, BigDecimal salarioHora) {
        super(nome);
        this.salarioHora = salarioHora;
    }

    public BigDecimal getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(BigDecimal salarioHora) {
        this.salarioHora = salarioHora;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((salarioHora == null) ? 0 : salarioHora.hashCode());
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
        EmpregadoTempoParcial other = (EmpregadoTempoParcial) obj;
        if (salarioHora == null) {
            if (other.salarioHora != null)
                return false;
        } else if (!salarioHora.equals(other.salarioHora))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "EmpregadoTempoParcial{" +
                "salarioHora=" + salarioHora +
                ", " + super.toString() +
                '}';
    }

}