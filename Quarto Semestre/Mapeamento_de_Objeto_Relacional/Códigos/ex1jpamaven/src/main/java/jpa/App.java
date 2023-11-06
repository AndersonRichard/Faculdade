package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p1 = new Produto(null, "Produto 1", 1);
		Produto p2 = new Produto(null, "Produto 2", 2);
		Produto p3 = new Produto(null, "Produto 3", 3);
		Produto p4 = new Produto(null, "Produto 4", 4);
		Produto p5 = new Produto(null, "Produto 5", 5);
		Produto p6 = new Produto(null, "Produto 5", 5);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.persist(p5);
		em.persist(p6);
		
		em.find(Produto.class, 1);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}