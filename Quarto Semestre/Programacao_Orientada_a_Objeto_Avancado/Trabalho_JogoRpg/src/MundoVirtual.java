import java.util.ArrayList;
import java.util.List;

class MundoVirtual {
    private List<Personagem> personagens;
    private List<Missao> missoes;
    private List<Inimigo> inimigos;

    public MundoVirtual() {
        this.personagens = new ArrayList<>();
        this.missoes = new ArrayList<>();
        this.inimigos = new ArrayList<>();
    }

    public void adicionarPersonagem(Personagem personagem) {
        personagens.add(personagem);
    }

    public void adicionarMissao(Missao missao) {
        missoes.add(missao);
    }

    public void adicionarInimigo(Inimigo inimigo) {
        inimigos.add(inimigo);
    }
}
