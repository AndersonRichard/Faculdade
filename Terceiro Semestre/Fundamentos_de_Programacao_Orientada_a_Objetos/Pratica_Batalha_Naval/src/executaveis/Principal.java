package executaveis;

import models.Embarcacao;
import models.Jogador;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static Embarcacao[][] tabuleiro;
    public static ArrayList<Jogador> jogadores;

    public static void main(String[] args) {
        tabuleiro = new Embarcacao[10][10];
        jogadores = new ArrayList<Jogador>();
        criarJogador();
        criarJogador();
    }

    public static void criarJogador(){
        if(jogadores.size() < 2){
            Jogador jogador1 = new Jogador(jogadores.size() + 1);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o nome do jogador");
            jogador1.setNome(scanner.nextLine());

            jogadores.add(jogador1);
        }else {
            System.out.println("Limite de jogadores atigido");
        }
    }

    public static void posicionarBarcos(Jogador jogador){
        int start = 0;
        if(jogador.getId() == 2){
            start = 5;
        }

        boolean posicionou = false;

        for(int i = start; i <= start + 4; i++){
            for (int j = 0; j <= 9; j++){
                if(tabuleiro[i][j] != null){
                    posicionou = true;
                }
            }
        }

        Scanner scanner = new Scanner(System.in);
        for (Embarcacao barco : jogador.getBarcos()) {
            System.out.println("insira as coordenadas do barco " + barco.getClass());

            System.out.println("Posição X");
            int linha = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Posição Y");
            int coluna = scanner.nextInt();
            scanner.nextLine();

            boolean podePosicionar = true;
            do {
                podePosicionar = true
                if (linha + barco.getTamanho() < tabuleiro.length) {
                    for (int i = linha; i < linha + barco.getTamanho(); i++) {
                        if (tabuleiro[i][coluna] != null) {
                            podePosicionar = false;
                        }
                    }
                } else {
                    podePosicionar = false;
                }


                if (podePosicionar) {
                    for (int i = linha; i < linha + barco.getTamanho(); i++) {
                        tabuleiro[linha][coluna] = barco;
                    }
                } else {
                    System.out.println("Não pode colocar nesta posição");
                }
            }while (){

            }
        }
    }
}
