package orm2;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataBase {

	static void Consulta() {
		Scanner scanner = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		try {
			System.out.println("*------------------------*");
			System.out.println("|                        |");
            System.out.println("|    Consultar Veículo   |");
            System.out.println("|                        |");
            System.out.println("*------------------------*");
            System.out.println("Qual o ID? ");
            Integer id = scanner.nextInt();
            
            Veiculo veiculo = em.find(Veiculo.class, id);

            if (veiculo != null) {
            	System.out.println("*------------------------*");
            	System.out.println("|                        |");
                System.out.println("| Veículo encontrado:    |");
                System.out.println("| ID: " + veiculo.getChassi());
                System.out.println("| Fabricante: " + veiculo.getFabricante());
                System.out.println("| Descrição: " + veiculo.getDescricao());
                System.out.println("| Versão: " + veiculo.getVersao());
                System.out.println("| Modelo: " + veiculo.getModelo());
                System.out.println("| Ano: " + veiculo.getAno());
                System.out.println("| Quantidade: " + veiculo.getQuantidade());
                System.out.println("|                        |");
                System.out.println("*------------------------*");
            } else {
                System.out.println("Veículo com ID " + id + " não encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro durante a consulta: " + e.getMessage());
        } finally {
            em.close();
        }
    }
	
	 static void Atualizar() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		Scanner scanner = new Scanner(System.in);
	    
		System.out.println("*------------------------*");
		System.out.println("|                        |");
        System.out.println("|    Atualizar Veículo   |");
        System.out.println("|                        |");
        System.out.println("*------------------------*");
		
	    System.out.print("Id do Veiculo: ");
	    Integer id = scanner.nextInt();
		
		em.getTransaction().begin();
		
		Veiculo x = em.find(Veiculo.class, id);
		
		if(x != null) {
			System.out.println("Novo Fabricante: ");
			scanner.nextLine();
			String novoFabri = scanner.nextLine();
			
			System.out.println("Nova Descrição: ");
			String novoDisc = scanner.nextLine();
			
			System.out.println("Nova Versão: ");
			String novoVer = scanner.nextLine();
			
			System.out.println("Novo Modelo: ");
			String novoModel = scanner.nextLine();
			
			System.out.println("Novo Ano: ");
			String novoAno = scanner.nextLine();
			
			System.out.println("Nova Quantidade: ");
			String novoQtdeStr = scanner.nextLine();
			
			try {
				int novaQuantidade = Integer.parseInt(novoQtdeStr);
				x.setFabricante(novoFabri);
				x.setDescricao(novoDisc);
				x.setVersao(novoVer);
				x.setModelo(novoModel);
				x.setAno(novoAno);
				x.setQuantidade(novaQuantidade);
				
				em.merge(x);
				
				em.getTransaction().commit();
				System.out.println("*------------------------*");
            	System.out.println("|                        |");
                System.out.println("| Veículo Atualizado:    |");
				System.out.println("| ID: " + x.getChassi());
                System.out.println("| Fabricante: " + x.getFabricante());
                System.out.println("| Descrição: " + x.getDescricao());
                System.out.println("| Versão: " + x.getVersao());
                System.out.println("| Modelo: " + x.getModelo());
                System.out.println("| Ano: " + x.getAno());
                System.out.println("| Quantidade: " + x.getQuantidade());
                System.out.println("|                        |");
                System.out.println("*------------------------*");
			} catch(NumberFormatException e) {
				System.out.println("Veículo Invalido");
			}
		} else {
			System.out.println("Veículo com ID " + id + " não encontrado.");
		}
		em.close();
		
	}
	 
	 static void Deletar() {
	        Scanner scanner = new Scanner(System.in);
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
	        EntityManager em = emf.createEntityManager();

	        try {
	            System.out.println("*------------------------*");
	            System.out.println("|      Deletar Veículo   |");
	            System.out.println("*------------------------*");

	            System.out.print("Informe o ID do Veículo a ser deletado: ");
	            Integer id = scanner.nextInt();

	            em.getTransaction().begin();
	            Veiculo veiculo = em.find(Veiculo.class, id);

	            if (veiculo != null) {
	            	System.out.println("*------------------------*");
	                System.out.println("|  Detalhes do Veículo   |");
	                System.out.println("| ID:         " + veiculo.getChassi());
	                System.out.println("| Fabricante: " + veiculo.getFabricante());
	                System.out.println("| Descrição:  " + veiculo.getDescricao());
	                System.out.println("*------------------------*");

	                System.out.print("Tem certeza de que deseja deletar este veículo? (S/N): ");
	                String confirmacao = scanner.next();

	                if (confirmacao.equalsIgnoreCase("S")) {
	                    em.remove(veiculo);
	                    em.getTransaction().commit();
	                    System.out.println("Veículo deletado com sucesso.");
	                } else {
	                    System.out.println("Operação de deleção cancelada.");
	                }
	            } else {
	                System.out.println("\nVeículo com ID " + id + " não encontrado. Operação de deleção cancelada.");
	            }
	        } catch (Exception e) {
	            System.out.println("Ocorreu um erro durante a deleção: " + e.getMessage());
	        } finally {
	            em.close();
	        }
	    }
	}