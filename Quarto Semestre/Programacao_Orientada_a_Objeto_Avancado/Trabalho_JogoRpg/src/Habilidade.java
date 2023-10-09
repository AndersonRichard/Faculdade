class Habilidade {
    private String nome;
    private String descricao;
    private int custoEnergia;

    public Habilidade(String nome, String descricao, int custoEnergia) {
        this.nome = nome;
        this.descricao = descricao;
        this.custoEnergia = custoEnergia;
    }

    public void ativar(Personagem personagem) throws HabilidadeSemEnergiaException {
        if (personagem.getEnergia() < custoEnergia) {
            throw new HabilidadeSemEnergiaException();
        }
        System.out.println("A habilidade " + nome + " foi ativada");
        personagem.setEnergia(personagem.getEnergia() - custoEnergia);
    }
}

class HabilidadeSemEnergiaException extends Exception {
    public HabilidadeSemEnergiaException() {
        super("Não há energia suficiente para usar a habilidade.");
    }
}
