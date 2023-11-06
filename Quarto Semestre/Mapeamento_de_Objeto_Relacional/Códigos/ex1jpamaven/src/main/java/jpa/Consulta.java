package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Consulta {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		System.out.println(em.find(Produto.class, 1));
		
		Produto x = em.find(Produto.class, 1);
		
		System.out.println("Nome: "+ x.getNome());
		
		em.close();

	}

}
