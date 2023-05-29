package models;

import java.util.ArrayList;

public class Cliente {
    private String id;
    private String nome;
    private String telefone;
    private String email;
    private ArrayList<Endereco> listaEnderecos;

    public Cliente(String id, String nome, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.listaEnderecos = new ArrayList<>();
    }
    public void adicionarEndereco(Endereco endereco) {
        listaEnderecos.add(endereco);
    }
    public void removerEndereco(Endereco endereco) {
        listaEnderecos.remove(endereco);
    }
    public ArrayList<Endereco> getEnderecos() {
        return listaEnderecos;
    }
    public String getId() {
        return this.id;
    }
    public boolean equals(Object obj) {
        Cliente aux = (Cliente) obj;
        return this.id == aux.getId();
    }

    public String toString(){
        String texto = "";
        for (Endereco endereco : listaEnderecos) {
            texto += " - " + endereco.toString() + "\n";
        }
        return  "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Telefone: " + telefone + "\n" +
                "Email: " + email + "\n" +
                "Endereços:\n" +
                texto;
    }
}
