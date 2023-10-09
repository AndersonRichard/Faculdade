class Inimigo {
    private String nome;
    private int nivel;
    private int saude;
    private int energia;

    public Inimigo(String nome, int nivel, int saude, int energia) {
        this.nome = nome;
        this.nivel = nivel;
        this.saude = saude;
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int novaEnergia) {
        this.energia = novaEnergia;
    }

    public void atacar(Personagem personagem) {
        System.out.println("Você atacou o personagem " + personagem.getNome());
        int dano = 15;
        int energiaAtual = personagem.getEnergia();
        energiaAtual -= dano;

        if (energiaAtual < 0) {
            energiaAtual = 0;
        }

        personagem.setEnergia(energiaAtual);
        System.out.println("Energia atual do personagem " + personagem.getNome() + ": " + personagem.getEnergia());
    }
}
