package br.edu.ifpb.es.daw;

import java.util.List;

import br.edu.ifpb.es.daw.dao.VeiculoDAO;
import br.edu.ifpb.es.daw.dao.impl.VeiculoDAOImpl;
import br.edu.ifpb.es.daw.entities.veiculo.Veiculo;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainVeículoDeleteAll {

	public static void main(String[] args) throws DawException {
		try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			VeiculoDAO veiculoDAO = new VeiculoDAOImpl(emf);

			List<Veiculo> veiculos = veiculoDAO.getAll();

			for (Veiculo veiculo : veiculos) {
				System.out.println("Removendo veiculo: " + veiculo);

				veiculoDAO.delete(veiculo.getId());
			}
		}

	}
}