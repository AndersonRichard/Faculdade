import java.util.ArrayList;

public class GerenciadorProdutos {
    private ArrayList<Produto> produtos;

    public GerenciadorProdutos() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {

        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso.");
    }

    public void removerProduto(int id) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == id) {
                produtos.remove(i);
                System.out.println("Produto removido com sucesso.");
                return;
            }
        }
        System.out.println("Produto com ID " + id + " não encontrado. Não foi possível remover o produto.");
    }

    public void listarProdutos() {

        System.out.println("Lista de produtos:");
        for (Produto produto : produtos) {
            System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
    }
}
