package jpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Atualiza {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Id do produto: ");
	    Integer id = scanner.nextInt();
		
		em.getTransaction().begin();
		
		Produto x = em.find(Produto.class, id);
		
		if(x != null) {
			System.out.println("Novo nome: ");
			scanner.nextLine();
			String novoNome = scanner.nextLine();
			
			System.out.println("Nova categoria: ");
			String novaCategoriaStr = scanner.nextLine();
			
			try {
				int novaCategoria = Integer.parseInt(novaCategoriaStr);
				x.setNome(novoNome);
				x.setCategoria(novaCategoria);
				
				em.merge(x);
				
				em.getTransaction().commit();
				System.out.println("Atualizado com sucesso.");
			} catch(NumberFormatException e) {
				System.out.println("Categoria inválida");
			}
		} else {
			System.out.println("Produto não encontrado.");
		}
		
		em.close();
		
		
	}

}

