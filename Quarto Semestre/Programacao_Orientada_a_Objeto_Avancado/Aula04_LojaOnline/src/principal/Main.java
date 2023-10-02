package principal;

import models.Produto;
import models.Tamanho;
import services.CalcularFrete;
public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 1.5, Tamanho.PEQUENO);
        Produto produto2 = new Produto("Notebook", 2.5, Tamanho.MEDIO);

        CalcularFrete calculadoraFrete = new CalcularFrete();

        double custoFrete1 = calculadoraFrete.calcularFrete(produto1);
        double custoFrete2 = calculadoraFrete.calcularFrete(produto2);

        System.out.println("Custo de frete para " + produto1.getNome() + ": R$" + custoFrete1);
        System.out.println("Custo de frete para " + produto2.getNome() + ": R$" + custoFrete2);
    }
}
