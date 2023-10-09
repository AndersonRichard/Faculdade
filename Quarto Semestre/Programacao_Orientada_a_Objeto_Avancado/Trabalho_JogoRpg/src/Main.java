import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MundoVirtual mundo = new MundoVirtual();

        Personagem personagem = new Personagem("Bardo", 1, 100, 100);
        mundo.adicionarPersonagem(personagem);

        Missao missao1 = new Missao("Derrotar o Arauto do Vale", "O Arauto do Vale é um poderoso monstro Épico em Summoner's Rift", null, "Objetivo derrotar o arauto do vale e soltar seu espirito de forma a ajudar na batalha");
        Missao missao2 = new Missao("Derrotar o Barão de Nashor", "Barão Na'shor era um verme feroz que governava o Rio Serpentine", null, "Objetivo derrotar o barao e pegar seu poder para ganhar vantagem na batalha");


        mundo.adicionarMissao(missao1);
        mundo.adicionarMissao(missao2);

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1. Ver status do personagem");
            System.out.println("2. Ver missões disponíveis");
            System.out.println("3. Iniciar missão");
            System.out.println("4. Caminhar pelo mapa");
            System.out.println("5. Usar item");
            System.out.println("6. Sair do jogo");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Status do Personagem:");
                    System.out.println("Nome: " + personagem.getNome());
                    System.out.println("Nível: " + personagem.getNivel());
                    System.out.println("Saúde: " + personagem.getSaude());
                    System.out.println("Energia: " + personagem.getEnergia());
                    break;
                case 2:
                    System.out.println("Missões Disponíveis:");
                    for (Missao missao : mundo.getMissoes()) {
                        System.out.println(missao.getTitulo() + ": " + missao.getDescricao());
                    }
                    break;
                case 3:
                    System.out.print("Digite o título da missão que deseja iniciar: ");
                    scanner.nextLine();
                    String tituloMissao = scanner.nextLine();
                    Missao missao = mundo.encontrarMissaoPorTitulo(tituloMissao);
                    if (missao != null) {
                        personagem.iniciarMissao(missao);
                    } else {
                        System.out.println("Missão não encontrada.");
                    }
                    break;
                case 4:
                    System.out.print("Digite as coordenadas (x y) para caminhar: ");
                    double x = scanner.nextDouble();
                    double y = scanner.nextDouble();
                    personagem.caminhar(x, y);
                    break;
                case 5:
                    System.out.print("Digite o nome do item que deseja usar: ");
                    scanner.nextLine();
                    String nomeItem = scanner.nextLine();
                    Item item = personagem.encontrarItemPorNome(nomeItem);
                    if (item != null) {
                        personagem.usarItem(item);
                    } else {
                        System.out.println("Item não encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("Saindo do jogo.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        }

    }
}
