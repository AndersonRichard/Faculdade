package orm2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
public static void main(String[] args) {
	// Exemplo 1
	Veiculo v1 = new Veiculo("Toyota", "Corolla", "2.0", "Sedan", "2023", 10);

	// Exemplo 2
	Veiculo v2 = new Veiculo("Chevrolet", "Cruze", "1.8", "Sedan", "2022", 8);

	// Exemplo 3
	Veiculo v3 = new Veiculo("Honda", "Civic", "1.5", "Sedan", "2023", 12);

	// Exemplo 4
	Veiculo v4 = new Veiculo("Volkswagen", "Golf", "1.4", "Hatch", "2022", 6);

	// Exemplo 5
	Veiculo v5 = new Veiculo("Hyundai", "Elantra", "2.0", "Sedan", "2023", 15);
	
	// Exemplo 6
	Veiculo v6 = new Veiculo("Ford", "Mustang", "5.0", "Coupé", "2022", 3);

	// Exemplo 7
	Veiculo v7 = new Veiculo("Nissan", "Altima", "2.5", "Sedan", "2023", 9);

	// Exemplo 8
	Veiculo v8 = new Veiculo("Mazda", "CX-5", "2.5", "SUV", "2022", 7);

	// Exemplo 9
	Veiculo v9 = new Veiculo("Kia", "Soul", "1.6", "Crossover", "2023", 11);

	// Exemplo 10
	Veiculo v10 = new Veiculo("Subaru", "Outback", "2.4", "Wagon", "2022", 4);
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
	EntityManager em = emf.createEntityManager();
	
	em.getTransaction().begin();

	em.persist(v1);
	em.persist(v2);
	em.persist(v3);
	em.persist(v4);
	em.persist(v5);
	em.persist(v6);
	em.persist(v7);
	em.persist(v8);
	em.persist(v9);
	em.persist(v10);
	
	em.getTransaction().commit();
	
	em.close();
	
	System.out.println(v1);
	System.out.println(v2);
	System.out.println(v3);
	System.out.println(v4);
	System.out.println(v5);
	System.out.println(v6);
	System.out.println(v7);
	System.out.println(v8);
	System.out.println(v9);
	System.out.println(v10);
}
}
