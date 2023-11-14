package orm2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i = 0;
		
		 try (Scanner scanner = new Scanner(System.in)) {
	            while (i != 1) {
	            	System.out.println("*------------------------*");
	            	System.out.println("|                        |");
	                System.out.println("|          Menu          |");
	                System.out.println("|      1. Consultar      |");
	                System.out.println("|      2. Atualizar      |");
	                System.out.println("|      3. Deletar        |");
	                System.out.println("|      4. Sair           |");
	                System.out.println("|                        |");
	                System.out.println("*------------------------*");
	                int opcao = scanner.nextInt();
	                
	                switch (opcao) {
	                    case 1:
	                        DataBase.Consulta();;
	                        break;
	                    case 2:
	                        DataBase.Atualizar();
	                        break;
	                    case 3:
	                        DataBase.Deletar();
	                        break;
	                    case 4:
	                        i = 1;
	                        break;
	                    default:
	                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
	                }
	            }
	        }
	    }
	}