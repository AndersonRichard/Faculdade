package views;

import java.util.Scanner;

public class Menu {
    public void menuInicial() {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("Bem-vindo ao sistema de eventos!");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Visão empresa");
            System.out.println("2. Visão Cliente");
            System.out.println("3. Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    iniciarVisaoEmpresa();
                    break;
                case 2:
                    iniciarVisaoCliente();
                    break;
                case 3:
                    sair = true;
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void iniciarVisaoCliente() {
        System.out.println("***REALIZA EVENTOS***");
        Scanner scanner = new Scanner(System.in);
        boolean voltarMenu = false;

        while (!voltarMenu) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Solicitar orçamento");
            System.out.println("2. Contato Realiza Eventos");
            System.out.println("3. Voltar ao menu anterior");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Solicitar orçamento");
                    solicitarOrcamento();
                    break;
                case 2:
                    System.out.println("Contato Realiza Eventos");

                    break;
                case 3:
                    voltarMenu = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }

    public static void iniciarVisaoEmpresa() {
        System.out.println("***REALIZA EVENTOS***");

    }

    public static void solicitarOrcamento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Solicitar Orçamento");
        System.out.println("Digite os detalhes do evento:");

        System.out.print("Tipo de evento: ");
        String tipoEvento = scanner.nextLine();

        System.out.print("Data do evento: ");
        String dataEvento = scanner.nextLine();

        System.out.print("Número de convidados: ");
        int numConvidados = scanner.nextInt();

        System.out.println("Orçamento solicitado com sucesso!");
    }
}
