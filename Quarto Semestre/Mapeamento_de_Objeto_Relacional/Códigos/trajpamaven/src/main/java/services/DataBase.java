package services;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import models.Carro;
import models.Cliente;
import models.Compra;
import models.Venda;

public class DataBase {
	
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
			
		
	 }
	
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
		
		Carro carro = new Carro(chassi, fabricante, descricao, ano, modelo, cor);
		
		addEm(carro);
		
		
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
			
		
	 }
	
	public static void cadastrarVenda() {
		Scanner scanner = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		System.out.println("NF: ");
		String nf = scanner.nextLine();
		
		System.out.println("CNH: ");
		Integer cnh = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("À vista (S/N): ");
	    boolean aVista = scanner.nextLine().equalsIgnoreCase("S");
		
	    System.out.println("Comprovante de Residência (S/N): ");
	    boolean comprovanteResidencia = scanner.nextLine().equalsIgnoreCase("S");

	    System.out.println("Comprovante de Renda (S/N): ");
	    boolean comprovanteRenda = scanner.nextLine().equalsIgnoreCase("S");

	    System.out.println("Agente Financiador (S/N): ");
	    boolean agenteFinanciador = scanner.nextLine().equalsIgnoreCase("S");

	    Venda venda = new Venda(nf, cnh, aVista, comprovanteResidencia, comprovanteRenda, agenteFinanciador);
	    
	    addEm(venda);

		System.out.println("Venda Adicionada:");
		System.out.println("NF: " + nf);
        System.out.println("CNH: " + cnh);
        System.out.println("Comprovante de Residência? " + comprovanteResidencia);
        System.out.println("Comprovante de Renda? " + comprovanteRenda);
        System.out.println("Agente Financiador? " + agenteFinanciador);
	}
	
	public static void consultarVenda() {
		Scanner scanner = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
        try {
        	System.out.println("Digite a NF: ");
            String nf = scanner.nextLine();
            
            Venda venda = em.find(Venda.class, nf);

            if (venda != null) {
            	System.out.println("Venda encontrada: ");
                System.out.println("NF: " + venda.getNf());
                System.out.println("CNH: " + venda.getCnh());
                System.out.println("À vista: " + venda.isaVista());
                System.out.println("Comprovante de Residência: " + venda.isComprovanteDeResidencia());
                System.out.println("Comprovante de Renda: " + venda.isCompranteDeRenda());
                System.out.println("Agente Financiador: " + venda.isAgenteFinanciador());
            } else {
                System.out.println("Venda com a NF" + venda + " não encontrada.");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro durante a consulta: " + e.getMessage());
        } finally {
            em.close();
        }
    }
	
	public static void atualizarVenda() {
		Scanner scanner = new Scanner(System.in);
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
	    EntityManager em = emf.createEntityManager();

	    System.out.println("Digite a NF da venda: ");
	    String nf = scanner.nextLine();

	    em.getTransaction().begin();

	    Venda venda = em.find(Venda.class, nf);

	    if (venda != null) {
	        System.out.println("Digite a nova CNH: ");
	        Integer novaCnh = scanner.nextInt();
	        scanner.nextLine();

	        System.out.println("A venda foi à vista? (S/N): ");
	        boolean novoAVista = scanner.nextLine().equalsIgnoreCase("S");

	        System.out.println("Possui comprovante de residência? (S/N): ");
	        boolean novoComprovanteResidencia = scanner.nextLine().equalsIgnoreCase("S");

	        System.out.println("Possui comprovante de renda? (S/N): ");
	        boolean novoComprovanteRenda = scanner.nextLine().equalsIgnoreCase("S");

	        System.out.println("É financiado por agente financiador? (S/N): ");
	        boolean novoAgenteFinanciador = scanner.nextLine().equalsIgnoreCase("S");

	        try {
	            venda.setCnh(novaCnh);
	            venda.setaVista(novoAVista);
	            venda.setComprovanteDeResidencia(novoComprovanteResidencia);
	            venda.setCompranteDeRenda(novoComprovanteRenda);
	            venda.setAgenteFinanciador(novoAgenteFinanciador);

	            em.merge(venda);
	            em.getTransaction().commit();

	            System.out.println("Venda Atualizada: ");
	            System.out.println("NF: " + venda.getNf());
	            System.out.println("CNH: " + venda.getCnh());
	            System.out.println("À vista: " + venda.isaVista());
	            System.out.println("Comprovante de Residência: " + venda.isComprovanteDeResidencia());
                System.out.println("Comprovante de Renda: " + venda.isCompranteDeRenda());
                System.out.println("Agente Financiador: " + venda.isAgenteFinanciador());
	        } catch (NumberFormatException e) {
	            System.out.println("Venda Inválida");
	        }
	    } else {
	        System.out.println("Venda com a NF " + nf + " não encontrada.");
	    }
	    em.close();
	}
	
	public static void removerVenda() {
		Scanner scanner = new Scanner(System.in);
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
	    EntityManager em = emf.createEntityManager();

	    try {
	        System.out.print("Informe a NF da Venda a ser deletada: ");
	        String nf = scanner.nextLine();

	        em.getTransaction().begin();
	        Venda venda = em.find(Venda.class, nf);

	        if (venda != null) {
	            System.out.println("Detalhes da Venda ");
	            System.out.println("NF: " + venda.getNf());
	            System.out.println("CNH: " + venda.getCnh());
	            System.out.println("A vista: " + venda.isaVista());
	            System.out.println("Comprovante de Residência: " + venda.isComprovanteDeResidencia());
	            System.out.println("Comprovante de Renda: " + venda.isCompranteDeRenda());
	            System.out.println("Agente Financiador: " + venda.isAgenteFinanciador());

	            System.out.print("Tem certeza de que deseja deletar esta venda? (S/N): ");
	            String confirmacao = scanner.next();

	            if (confirmacao.equalsIgnoreCase("S")) {
	                em.remove(venda);
	                em.getTransaction().commit();
	                System.out.println("Venda deletada com sucesso.");
	            } else {
	                System.out.println("Operação de exclusão cancelada.");
	            }
	        } else {
	            System.out.println("\nVenda com a NF " + nf + " não encontrada. Operação de exclusão cancelada.");
	        }
	    } catch (Exception e) {
	        System.out.println("Ocorreu um erro durante a exclusão: " + e.getMessage());
	    } finally {
	        em.close();
	    }
	}
	
	static void addEm(Venda venda) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(venda);	
		em.getTransaction().commit();
			
	 }

}
