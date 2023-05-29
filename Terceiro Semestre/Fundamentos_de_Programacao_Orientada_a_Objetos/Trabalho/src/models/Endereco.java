package models;

public class Endereco {
    private String id;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String complemento;

    public Endereco(String id, String rua, String numero, String bairro, String cidade, String estado, String pais, String cep, String complemento) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.complemento = complemento;
    }

    public String getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }

    public String getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }
    public String toString(){
        return  "ID: " + id + "\n" +
                "Rua: " + rua + "\n" +
                "Número: " + numero + "\n" +
                "Bairro: " + bairro + "\n" +
                "Cidade: " + cidade + "\n" +
                "Estado: " + estado + "\n" +
                "País: " + pais + "\n" +
                "CEP: " + cep + "\n" +
                "Complemento: " + complemento;
    }

    public String getIdEnde() {
        return this.id;
    }
    public boolean equals(Object obj) {
        Endereco aux = (Endereco) obj;
        return this.id == aux.getIdEnde();
    }
}
