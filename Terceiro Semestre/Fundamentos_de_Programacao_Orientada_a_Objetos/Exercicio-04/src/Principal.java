public class Principal {
    public static void main(String[] args) {
        GerenciadorDeElementos gerenciador = new GerenciadorDeElementos();
        Triangulo tri = new Triangulo(10, 12, 12, 10, 10);

        gerenciador.obterInformacoes(tri);
    }
}
