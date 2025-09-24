package br.edu.ifpb.es.daw;

import java.math.BigDecimal;

import br.edu.ifpb.es.daw.entities.empregado.Empregado;
import br.edu.ifpb.es.daw.dao.EmpregadoDAO;
import br.edu.ifpb.es.daw.dao.impl.EmpregadoDAOImpl;
import br.edu.ifpb.es.daw.entities.empregado.concreto.EmpregadoTempoIntegral;
import br.edu.ifpb.es.daw.entities.empregado.concreto.EmpregadoTempoParcial;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainEmpregadoSave {

	public static void main(String[] args) throws DawException {
		try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			EmpregadoDAO empDAO = new EmpregadoDAOImpl(emf);

			Empregado ETI = new EmpregadoTempoIntegral("Jose Biserra", new BigDecimal(1412.10));
			empDAO.save(ETI);
			System.out.printf("Empregado em tempo integral: ", ETI);
			System.out.println();

			Empregado ETP = new EmpregadoTempoParcial("Hugo Vitor", new BigDecimal(5));
			empDAO.save(ETP);
			System.out.printf("Empregado em tempo parcial: ", ETP);
		}
	}
}
