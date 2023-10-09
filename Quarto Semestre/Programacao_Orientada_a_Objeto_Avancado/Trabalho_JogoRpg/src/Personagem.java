import java.util.ArrayList;
import java.util.List;

public class Personagem {
    private String nome;
    private int nivel;
    private int saude;
    private int energia;
    private List<Habilidade> habilidades;
    private List<Item> itens;
    private List<Missao> missoes;

    public Personagem(String nome, int nivel, int saude, int energia) {
        this.nome = nome;
        this.nivel = nivel;
        this.saude = saude;
        this.energia = energia;
        this.habilidades = new ArrayList<>();
        this.itens = new ArrayList<>();
        this.missoes = new ArrayList<>();
    }

    public void atacar(Inimigo inimigo) {
        System.out.println("Você atacou o inimigo " + inimigo.getNome());
        int dano = 50;
        int energiaAtual = inimigo.getEnergia();
        energiaAtual -= dano;

        if (energiaAtual < 0) {
            energiaAtual = 0;
        }

        inimigo.setEnergia(energiaAtual);
        System.out.println("Energia atual do inimigo " + inimigo.getNome() + ": " + inimigo.getEnergia());
    }

    public void pegarItem(Item item) {
        System.out.println("Você pegou o item " + item.getNome());
        itens.add(item);
    }

    public void caminhar(double x, double y) {
        System.out.println("Você foi para o ponto (" + x + ", " + y + ")");
    }

    public void usarHabilidade(Habilidade habilidade) {
        try {
            habilidade.ativar(this);
        } catch (HabilidadeSemEnergiaException e) {
            System.out.println("Não há energia suficiente para usar essa habilidade.");
        }
    }

    public void adicionarHabilidade(Habilidade habilidade) {
        habilidades.add(habilidade);
    }

    public void adicionarItens(List<Item> itens) {
        this.itens.addAll(itens);
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public void adicionarMissao(Missao missao) {
        missoes.add(missao);
    }

    public void iniciarMissao(Missao missao) {
        System.out.println("A missão " + missao.getTitulo() + " foi iniciada por " + nome);
    }

    public void completarMissao(Missao missao) {
        System.out.println("A missão " + missao.getTitulo() + " foi completada");
        adicionarItens(missao.getRecompensa());
        missoes.remove(missao);
    }
    public void usarItem(Item item) {
        item.usar(this);
    }
    public List<Item> getItens() {
        return itens;
    }
}