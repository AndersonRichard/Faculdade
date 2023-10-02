package models;

public class Produto {
    private String nome;
    private double peso;
    private Tamanho tamanho;

    public Produto(String nome, double peso, Tamanho tamanho) {
        this.nome = nome;
        this.peso = peso;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }
}