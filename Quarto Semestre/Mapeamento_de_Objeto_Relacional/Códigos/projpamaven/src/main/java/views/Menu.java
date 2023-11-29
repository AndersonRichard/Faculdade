package views;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import models.Carro;
import models.Cliente;
import service.DataBase;



public class Menu {
	public static void menuConcessionaria() {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
	     EntityManager em = emf.createEntityManager();
		 Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("\nMenu Concessionaria:");
	            System.out.println("1. Cliente");
	            System.out.println("2. Carro");
	            System.out.println("3. Transação");
	            System.out.println("4. Sair");

	            System.out.print("Escolha uma opção: ");
	            int opcaoAcoes = scanner.nextInt();
	            switch (opcaoAcoes) {
	            case 1:
	            	menuCliente();
	                break;
	            case 2:
	            	menuCarro();
	                break;
	            case 3:
	            	scanner.nextLine(); 
                    System.out.println("CPF: ");
                    String cpfJoin = scanner.nextLine();

                    
                    Cliente cg = em.find(Cliente.class, cpfJoin);

                    if (cg != null) {
                        System.out.println("Transação encontrado:");
                        System.out.println("Cliente: "+cg.getNome());
                        System.out.println("Veículo(s): ");
                        
                        for (Carro carro : cg.getCarro()) {
                        	System.out.println(carro);
                        }
                        
                    } else {
                        System.out.println("Transação não encontrada.");
                    }      	
                break;
	            case 4:
	            	break;
	            default:
	                System.out.println("Opção inválida. Tente novamente.");
	        }
	    }
	}
	public static void menuCarro() {
		Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu Carro:");
            System.out.println("1. Cadastrar Carro");
            System.out.println("2. Consultar Carro");
            System.out.println("3. Atualizar Carro");
            System.out.println("4. Sair");
            System.out.println("0. Voltar para o Menu Concessionaria");

            System.out.print("Escolha uma opção: ");
            int opcaoCliente = scanner.nextInt();

            switch (opcaoCliente) {
                case 1:
                	DataBase.cadastrarCarro();
                    break;
                case 2:
                    DataBase.consultarCarro();
                    break;
                case 3:
                    DataBase.atualizarCarro();
                    break;
                case 4:
	            	break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
	}
	}
	
	public static void menuCliente() {
		Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu Cliente:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Consultar Cliente");
            System.out.println("3. Atualizar Cliente");
            System.out.println("4. Sair");
            System.out.println("0. Voltar para o Menu Concessionaria");

            System.out.print("Escolha uma opção: ");
            int opcaoCliente = scanner.nextInt();

            switch (opcaoCliente) {
                case 1:
                	DataBase.cadastrarCliente();
                    break;
                case 2:
                    DataBase.consultarCliente();
                    break;
                case 3:
                    DataBase.atualizarCliente();
                    break;
                case 4:
	            	break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
	}
	}
}

