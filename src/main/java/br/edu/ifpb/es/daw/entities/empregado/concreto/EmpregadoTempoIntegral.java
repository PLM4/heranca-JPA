package br.edu.ifpb.es.daw.entities.empregado.concreto;

import java.math.BigDecimal;

import br.edu.ifpb.es.daw.entities.empregado.Empregado;
import jakarta.persistence.Entity;

@Entity
public class EmpregadoTempoIntegral extends Empregado{

    private BigDecimal salario;

    public EmpregadoTempoIntegral(){
    }

    public EmpregadoTempoIntegral(String nome,BigDecimal salario) {
        super(nome);
        this.salario = salario;
    }

    public BigDecimal getSalario() {
        return salario;
    }
    
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    
    @Override
     public int hashCode() {
         final int prime = 31;
         int result = super.hashCode();
         result = prime * result + ((salario == null) ? 0 : salario.hashCode());
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
         EmpregadoTempoIntegral other = (EmpregadoTempoIntegral) obj;
         if (salario == null) {
             if (other.salario != null)
                 return false;
         } else if (!salario.equals(other.salario))
             return false;
         return true;
     }

     @Override
     public String toString() {
         return "EmpregadoTempoIntegral{" +
                 "salario=" + salario +
                 ", " + super.toString() +
                 '}';
     }
}
