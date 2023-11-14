package orm1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Anderson", 125);
		Aluno a2 = new Aluno("Alysson", 120);
		Aluno a3 = new Aluno("Caio", 125);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		
		em.getTransaction().commit();
		em.close();
			
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}

}
