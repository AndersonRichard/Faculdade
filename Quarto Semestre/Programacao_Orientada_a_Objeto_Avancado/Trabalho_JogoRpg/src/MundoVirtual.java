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
    public List<Missao> getMissoes() {
        return missoes;
    }
    public Missao encontrarMissaoPorTitulo(String titulo) {
        for (Missao missao : missoes) {
            if (missao.getTitulo().equalsIgnoreCase(titulo)) {
                return missao;
            }
        }
        return null;
    }
}
