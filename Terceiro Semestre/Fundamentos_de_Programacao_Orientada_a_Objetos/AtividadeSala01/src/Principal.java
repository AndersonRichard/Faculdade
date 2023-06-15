import models.Automovel;
import models.Carro;
import models.Moto;

import java.util.ArrayList;

public class Principal {
        public static void main(String[] args) {
            Moto m = new Moto();
            m.setGarupa(false);
            m.setMarca("Yamaha");
            m.setPeso(140);
            m.setVelocidade(0);

            System.out.println(m);
            System.out.println(m.getPeso());

            Carro c = new Carro();
            c.setMarca("Honda");
            c.setPeso(1000);
            c.setVelocidade(0);

            System.out.println(c);

            ArrayList<Automovel> lista = new ArrayList<>();

            lista.add(c);
            lista.add(m);

            System.out.println(lista);
        }
}