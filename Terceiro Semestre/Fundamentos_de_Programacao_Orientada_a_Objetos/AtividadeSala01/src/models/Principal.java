package models;

public class Principal {
    public static void main(String[] args) {
        Automovel a = new Automovel();
        a.setPeso(2.50);
        a.setMarca("Chevolet");
        a.setVelocidade(0);
        System.out.println(a);
        a.acelerar();
        System.out.println(a);



        Carro c = new Carro();
        c.setMarca("BMW");
        c.setPeso(580);
        c.setVelocidade(0);
        c.setTamPortaMalas(60);
        c.addPortaMlas(5);
        System.out.println(c);

    }
}
