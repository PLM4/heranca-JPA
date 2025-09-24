package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.VeiculoDAO;
import br.edu.ifpb.es.daw.dao.impl.VeiculoDAOImpl;
import br.edu.ifpb.es.daw.entities.veiculo.Veiculo;
import br.edu.ifpb.es.daw.entities.veiculo.concreto.Bicicleta;
import br.edu.ifpb.es.daw.entities.veiculo.concreto.Caminhao;
import br.edu.ifpb.es.daw.entities.veiculo.concreto.Carro;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainVeículoSave {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			VeiculoDAO veiculoDAO = new VeiculoDAOImpl(emf);

			Veiculo carro = new Carro("Clio","Ford",5,4);
			Veiculo caminhao = new Caminhao("Bus","Mercedes",3,1);
			Veiculo bike = new Bicicleta("Monark","ocley",1,20);
			
			veiculoDAO.save(carro); 
			veiculoDAO.save(caminhao); 
			veiculoDAO.save(bike); 

			System.out.printf("O carro: ",carro);
			System.out.printf("O caminhao: ",caminhao);
			System.out.printf("A bicicleta: ",bike);
		}
	}

}
