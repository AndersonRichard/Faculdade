import java.util.List;

class Item {
    private String nome;
    private String descricao;
    private String tipo;
    private List<String> efeitos;

    public Item(String nome, String descricao, String tipo, List<String> efeitos) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.efeitos = efeitos;
    }

    public String getNome() {
        return nome;
    }

    public void usar(Personagem personagem) {
        for (String efeito : efeitos) {
            System.out.println(efeito);

            if (efeito.equals("Aumento de Saúde")) {
                int saudeAtual = personagem.getSaude();
                saudeAtual += 20;
                personagem.setSaude(saudeAtual);
            } else if (efeito.equals("Aumento de Energia")) {
                int energiaAtual = personagem.getEnergia();
                energiaAtual += 10;
                personagem.setEnergia(energiaAtual);
            }

            System.out.println("Efeito aplicado em " + personagem.getNome());
        }
    }
}
