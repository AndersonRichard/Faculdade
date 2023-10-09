import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MundoVirtual mundo = new MundoVirtual();

        Personagem jogador1 = new Personagem("Herói", 1, 100, 100);
        Inimigo inimigo1 = new Inimigo("Vilão", 1, 100, 100);

        Habilidade habilidade1 = new Habilidade("Ataque Poderoso", "Um ataque poderoso", 20);
        Habilidade habilidade2 = new Habilidade("Curar", "Cura pequena", 10);

        jogador1.adicionarHabilidade(habilidade1);
        jogador1.adicionarHabilidade(habilidade2);

        Item poçãoCura = new Item("Poção de Cura", "Cura 50 de saúde", "Consumível", List.of("Aumento de Saúde"));
        Item espada = new Item("Espada Mágica", "Aumenta o dano de ataque", "Arma", List.of());

        jogador1.pegarItem(poçãoCura);
        jogador1.pegarItem(espada);

        List<Item> recompensaMissao = new ArrayList<>();
        recompensaMissao.add(poçãoCura);
        Missao missao1 = new Missao("Derrotar o Dragão", "Derrote o dragão maligno", recompensaMissao, "Derrotar o dragão");

        jogador1.adicionarMissao(missao1);


        mundo.adicionarPersonagem(jogador1);
        mundo.adicionarInimigo(inimigo1);
        mundo.adicionarMissao(missao1);

        jogador1.atacar(inimigo1);
        jogador1.usarHabilidade(habilidade1);
        jogador1.usarItem(poçãoCura);

        System.out.println("Energia atual do inimigo: " + inimigo1.getEnergia());

        jogador1.iniciarMissao(missao1);
        jogador1.completarMissao(missao1);
        System.out.println("Itens do jogador após completar a missão: " + jogador1.getItens());
    }
}
