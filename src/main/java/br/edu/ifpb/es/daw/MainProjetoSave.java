package br.edu.ifpb.es.daw;

import java.math.BigDecimal;
import java.time.LocalDate;
import br.edu.ifpb.es.daw.dao.ProjetoDAO;
import br.edu.ifpb.es.daw.dao.impl.ProjetoDAOImpl;
import br.edu.ifpb.es.daw.entities.projeto.Projeto;
import br.edu.ifpb.es.daw.entities.projeto.concreto.ProjetoGrande;
import br.edu.ifpb.es.daw.entities.projeto.concreto.ProjetoPequeno;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainProjetoSave {

	public static void main(String[] args) throws DawException {
		try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			ProjetoDAO pjDAO = new ProjetoDAOImpl(emf);

			Projeto projetoGrande = new ProjetoGrande("Ruan", new BigDecimal(100));
			pjDAO.save(projetoGrande);
			System.out.printf("Projeto grande: ", projetoGrande);

			Projeto projetoPequeno = new ProjetoPequeno("Carlos", LocalDate.of(2025, 03, 06));
			pjDAO.save(projetoPequeno);
			System.out.printf("Projeto pequeno: ", projetoPequeno);
		}
	}

}
