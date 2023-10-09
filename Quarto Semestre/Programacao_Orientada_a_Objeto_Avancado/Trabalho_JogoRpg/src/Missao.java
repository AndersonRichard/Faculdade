import java.util.List;

class Missao {
    private String titulo;
    private String descricao;
    private List<Item> recompensa;
    private String objetivos;

    public Missao(String titulo, String descricao, List<Item> recompensa, String objetivos) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.recompensa = recompensa;
        this.objetivos = objetivos;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Item> getRecompensa() {
        return recompensa;
    }
    public String getDescricao() {
        return descricao;
    }


}
