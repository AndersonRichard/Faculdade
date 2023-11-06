package jpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Deleta {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Id do produto: ");
	    Integer id = scanner.nextInt();
	    
	    em.getTransaction().begin();
	    Produto x = em.find(Produto.class, id);
	    System.out.println("Nome: "+ x.getNome());
	    
	    em.remove(x);
	    em.getTransaction().commit();
	    
	    em.close();

	}

}
