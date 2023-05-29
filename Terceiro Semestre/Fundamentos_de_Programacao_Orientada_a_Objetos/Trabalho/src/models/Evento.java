package models;

public class Evento {
    private String id;
    private String nome;
    //hashmap
    private String descricao;

    //servicos
    //tostring


    public Evento(String id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public String toString() {
        return "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Descrição: " + descricao;
    }
    public String getIdEndeEve() {
        return this.id;
    }
    public boolean equals(Object obj) {
        Evento aux = (Evento) obj;
        return this.id == aux.getIdEndeEve();
    }
}
