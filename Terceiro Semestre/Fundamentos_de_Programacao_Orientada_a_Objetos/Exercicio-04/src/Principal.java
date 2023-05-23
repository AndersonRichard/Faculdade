public class Principal {
    public static void main(String[] args) {
        GerenciadorDeElementos gerenciador = new GerenciadorDeElementos();

        Circulo cir = new Circulo(5);
        gerenciador.obterInformacoes(cir);

        Quadrilatero quar = new Quadrilatero(5,4);
        gerenciador.obterInformacoes(quar);

        Triangulo tri = new Triangulo(10, 12, 12);

        gerenciador.obterInformacoes(tri);
    }
}
