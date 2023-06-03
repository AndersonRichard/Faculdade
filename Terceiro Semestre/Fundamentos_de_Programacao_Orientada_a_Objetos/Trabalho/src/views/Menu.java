package views;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de eventos!");
        System.out.println("Escolha uma opção:");
        System.out.println("1. Visão empresa");
        System.out.println("2. Visão Cliente");
        System.out.print("Opção: ");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                iniciarVisaoEmpresa();
                break;
            case 2:
                iniciarVisaoCliente();
                break;
            default:
                System.out.println("Opção inválida. Encerrando o programa.");
        }
    }

    public static void iniciarVisaoCliente() {
        System.out.println("***REALIZA EVENTOS***");

    }

    public static void iniciarVisaoEmpresa() {
        System.out.println("***REALIZA EVENTOS***");

    }

    public void exibirMenuPrincipal() {
    }
}
