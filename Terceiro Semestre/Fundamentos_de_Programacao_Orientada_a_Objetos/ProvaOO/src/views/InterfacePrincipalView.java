package views;

import java.text.ParseException;
import java.util.Scanner;

public class InterfacePrincipalView {


    private void exibirMenuPrincipal() {
        System.out.println("Selecione uma opcao");
        System.out.println("1. Realizar Venda");
        System.out.println("2. Gerar Relatório");
        System.out.println("0. Sair");
    }
    private Scanner scanner;
    public void executar(){
        int opcao = 0;

        while(opcao != 0) {
            this.exibirMenuPrincipal();
            opcao = this.scanner.nextInt();
            this.scanner.nextLine();


            switch(opcao) {
                case 1:
                    System.out.println("Insira os dados:");
                    break;
                case 2:

                    break;
                case 0:
                    break;
            }
        }

        this.scanner.close();
    }
}
