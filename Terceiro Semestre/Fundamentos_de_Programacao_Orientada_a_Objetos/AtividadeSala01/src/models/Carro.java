package models;

public class Carro extends Automovel{

    private int tamPortaMalas;

    public int getTamPortaMalas() {
        return tamPortaMalas;
    }

    public void setTamPortaMalas(int tamPortaMalas) {
        this.tamPortaMalas = tamPortaMalas;
    }

    public void addPortaMlas(int alteraNovoTam){
        this.tamPortaMalas = alteraNovoTam;
        System.out.println("Alterado");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "tamPortaMalas=" + tamPortaMalas +
                ", peso=" + getPeso() +
                ", velocidade=" + getVelocidade() +
                ", marca='" + getMarca() + '\'' +
                '}';
    }
}
