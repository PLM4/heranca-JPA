package br.edu.ifpb.es.daw.entities.veiculo;

import jakarta.persistence.Entity;

@Entity
public abstract class VeiculoDeTransporte extends Veiculo {

    private Integer cargaMaximaKg;

    public VeiculoDeTransporte() {
    }

    public VeiculoDeTransporte(String nome, String construtora, Integer cargaMaximaKg) {
        super(nome, construtora);
        this.cargaMaximaKg = cargaMaximaKg;
    }

    public Integer getCargaMaximaKg() {
        return cargaMaximaKg;
    }

    public void setCargaMaximaKg(Integer cargaMaximaKg) {
        this.cargaMaximaKg = cargaMaximaKg;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((cargaMaximaKg == null) ? 0 : cargaMaximaKg.hashCode());
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
        VeiculoDeTransporte other = (VeiculoDeTransporte) obj;
        if (cargaMaximaKg == null) {
            if (other.cargaMaximaKg != null)
                return false;
        } else if (!cargaMaximaKg.equals(other.cargaMaximaKg))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "VeiculoDeTransporte [cargaMaximaKg=" + cargaMaximaKg + ", toString()=" + super.toString() + "]";
    }

}