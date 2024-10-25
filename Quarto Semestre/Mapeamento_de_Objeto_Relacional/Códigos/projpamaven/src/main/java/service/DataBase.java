package service;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import models.Carro;
import models.Cliente;

public class DataBase {
	public static void cadastrarCarro() {
		Scanner scanner = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		System.out.println("Chassi: ");
		String chassi = scanner.nextLine();
		
		System.out.println("Fabricante: ");
		String fabricante = scanner.nextLine();
		
		System.out.println("Descrição: ");
		String descricao = scanner.nextLine();
		
		System.out.println("Ano: ");
		Integer ano = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Modelo: ");
		String modelo = scanner.nextLine();
		
		System.out.println("Cor: ");
		String cor = scanner.nextLine();
		
		System.out.println("Digite o CPF do Cliente:");
		String cpfClient = scanner.nextLine();
		
		Cliente cliente = em.find(Cliente.class, cpfClient);
		
		Carro carro = new Carro(chassi, fabricante, descricao, ano, modelo, cor, cliente);
		
		em.getTransaction().begin();
		em.persist(carro);
		em.getTransaction().commit();
		
		cliente.adicionaCarro(carro);
		
		em.getTransaction().begin();
		em.merge(cliente);
		em.getTransaction().commit();

		
		System.out.println("Carro Adicionado:");
		System.out.println("Chassi: " + chassi);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Descrição: " + descricao);
        System.out.println("Ano: " + ano);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor:" + cor);
	}
	
	public static void consultarCarro() {
		Scanner scanner = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
        try {
        	System.out.println("Digite o Chassi: ");
            String chassi = scanner.nextLine();
            
            Carro carro = em.find(Carro.class, chassi);

            if (carro != null) {
            	System.out.println("Carro encontrado: ");
                System.out.println("Chassi: " + carro.getChassi());
                System.out.println("Fabricante: " + carro.getFabricante());
                System.out.println("Descrição: " + carro.getDescricao());
                System.out.println("Ano: " + carro.getAno());
                System.out.println("Modelo: " + carro.getModelo());
                System.out.println("Cor: " + carro.getCor());
            } else {
                System.out.println("Carro com o Chassi " + chassi + " não encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro durante a consulta: " + e.getMessage());
        } finally {
            em.close();
        }
    }
	
	public static void atualizarCarro() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Chassi: ");
		String chassi = scanner.nextLine();
			
		em.getTransaction().begin();
			
		Carro carro = em.find(Carro.class, chassi);
		
		if(carro != null) {		
			System.out.println("Digite o novo Fabricante: ");
			String novoFabricante = scanner.nextLine();
			
			System.out.println("Digite a nova Descrição: ");
			String novoDescricao = scanner.nextLine();
			
			System.out.println("Digite o novo Ano: ");
			Integer novoAno = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Digite o novo Modelo: ");
			String novoModelo = scanner.nextLine();
			
			System.out.println("Digite a nova Cor: ");
			String novoCor = scanner.nextLine();
			
			try {
				carro.setFabricante(novoFabricante);
				carro.setDescricao(novoDescricao);
				carro.setAno(novoAno);
				carro.setModelo(novoModelo);
				carro.setCor(novoCor);
				em.merge(carro);
				
				em.getTransaction().commit();
				
                System.out.println("Carro Atualizado: ");
				System.out.println("Chassi: " + carro.getChassi());
                System.out.println("Fabricante: " + carro.getFabricante());
                System.out.println("Descrição: " + carro.getDescricao());
                System.out.println("Ano: " + carro.getAno());
                System.out.println("Modelo: " + carro.getModelo());
                System.out.println("Cor: " + carro.getCor());
          
			} catch(NumberFormatException e) {
				System.out.println("Carro Invalido");
			}
		} else {
			System.out.println("Carro com o Chassi " + chassi + " não encontrado.");
		}
		em.close();
	}
	
	public static void removerCarro() {
		 Scanner scanner = new Scanner(System.in);
	     EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
	     EntityManager em = emf.createEntityManager();
	     
	     try {
	           	System.out.print("Informe o Chassi do Carro a ser deletado: ");
	            String chassi = scanner.nextLine();

	            em.getTransaction().begin();
	            Carro carro = em.find(Carro.class, chassi);

	            if (carro != null) {
	                System.out.println("Detalhes do Carro ");
	                System.out.println("Chassi: " + carro.getChassi());
	                System.out.println("Fabricante: " + carro.getFabricante());
	                System.out.println("Descrição: " + carro.getDescricao());
	                System.out.println("Ano: " + carro.getAno());
	                System.out.println("Modelo: " + carro.getModelo());
	                System.out.println("Cor: " + carro.getCor());
	                
	                System.out.print("Tem certeza de que deseja deletar este carro? (S/N): ");
	                String confirmacao = scanner.next();

	                if (confirmacao.equalsIgnoreCase("S")) {
	                    em.remove(carro);
	                    em.getTransaction().commit();
	                    System.out.println("Carro deletado com sucesso.");
	                } else {
	                    System.out.println("Operação de exclusão cancelada.");
	                }
	            } else {
	                System.out.println("\nCarro com o chassi " + chassi + " não encontrado. Operação de exclusão cancelada.");
	            }
	        } catch (Exception e) {
	            System.out.println("Ocorreu um erro durante a exclusão: " + e.getMessage());
	        } finally {
	            em.close();
	        }
	}
	
	static void addEm(Carro carro) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(carro);
        em.getTransaction().commit();
        em.close();
    }
	
	public static void cadastrarCliente() {
		Scanner scanner = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		System.out.println("CPF: ");
		String cpf = scanner.nextLine();
		
		System.out.println("Nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Telefone: ");
		String telefone = scanner.nextLine();
		
		System.out.println("Endereço: ");
		String endereco = scanner.nextLine();
		
		Cliente cliente = new Cliente(cpf, nome, telefone, endereco);
		
		addEm(cliente);
		
		
		System.out.println("Cliente Adicionado: ");
		System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);

	}
	
	public static void consultarCliente() {
		Scanner scanner = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
        try {
        	System.out.println("Digite o CPF: ");
            String cpf = scanner.nextLine();
            
            Cliente cliente = em.find(Cliente.class, cpf);

            if (cliente != null) {
            	System.out.println("Cliente encontrado: ");
                System.out.println("CPF: " + cliente.getCpf());
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("Telefone: " + cliente.getTelefone());
                System.out.println("Endereço: " + cliente.getEndereco());
            } else {
                System.out.println("Cliente com o CPF " + cpf + " não encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro durante a consulta: " + e.getMessage());
        } finally {
            em.close();
        }
    }
	
	public static void atualizarCliente() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o CPF: ");
		String cpf = scanner.nextLine();
			
		em.getTransaction().begin();
			
		Cliente c = em.find(Cliente.class, cpf);
		
		if(c != null) {		
			System.out.println("Digite o novo Nome: ");
			String novoNome = scanner.nextLine();
			
			System.out.println("Digite o novo Telefone: ");
			String novoTelefone = scanner.nextLine();
			
			System.out.println("Digite o novo Endereço: ");
			String novoEndereco = scanner.nextLine();
			
			try {
				c.setNome(novoNome);
				c.setTelefone(novoTelefone);
				c.setEndereco(novoEndereco);
								
				em.merge(c);
				
				em.getTransaction().commit();
				
                System.out.println("Cliente Atualizado: ");
				System.out.println("CPF: " + c.getCpf());
                System.out.println("Nome: " + c.getNome());
                System.out.println("Telefone: " + c.getTelefone());
                System.out.println("Endereço: " + c.getEndereco());
          
			} catch(NumberFormatException e) {
				System.out.println("Cliente Invalido");
			}
		} else {
			System.out.println("Cliente com o CPF " + cpf + " não encontrado.");
		}
		em.close();
	}
	
	public static void removerCliente() {
		 Scanner scanner = new Scanner(System.in);
	     EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
	     EntityManager em = emf.createEntityManager();
	     
	     try {
	           	System.out.print("Informe o CPF do Cliente a ser deletado: ");
	            String cpf = scanner.nextLine();

	            em.getTransaction().begin();
	            Cliente c = em.find(Cliente.class, cpf);

	            if (c != null) {
	                System.out.println("Detalhes do Cliente ");
	                System.out.println("CPF: " + c.getCpf());
	                System.out.println("Nome: " + c.getNome());
	                System.out.println("Telefone: " + c.getTelefone());
	                System.out.println("Endereço: " + c.getEndereco());

	                System.out.print("Tem certeza de que deseja deletar este Cliente? (S/N): ");
	                String confirmacao = scanner.next();

	                if (confirmacao.equalsIgnoreCase("S")) {
	                    em.remove(c);
	                    em.getTransaction().commit();
	                    System.out.println("Cliente deletado com sucesso.");
	                } else {
	                    System.out.println("Operação de exclusão cancelada.");
	                }
	            } else {
	                System.out.println("\nCliente com o CPF " + cpf + " não encontrado. Operação de exclusão cancelada.");
	            }
	        } catch (Exception e) {
	            System.out.println("Ocorreu um erro durante a exclusão: " + e.getMessage());
	        } finally {
	            em.close();
	        }
	}
	
	static void addEm(Cliente cliente) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }
}
