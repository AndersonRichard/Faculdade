public class Principal {
    public static void main(String[] args) {
        GerenciadorProdutos gerenciador = new GerenciadorProdutos();

        Produto produto1 = new Produto(1, "Camiseta", 29.90);
        Produto produto2 = new Produto(2, "Calça Jeans", 99.90);
        Produto produto3 = new Produto(3, "Tênis", 199.90);
        Produto produto4 = new Produto(3, "Tênis", 199.90);


        gerenciador.adicionarProduto(produto1);
        gerenciador.adicionarProduto(produto2);
        gerenciador.adicionarProduto(produto3);
        gerenciador.adicionarProduto(produto4);


        gerenciador.listarProdutos();


        gerenciador.removerProduto(2);


        gerenciador.listarProdutos();
    }
}
