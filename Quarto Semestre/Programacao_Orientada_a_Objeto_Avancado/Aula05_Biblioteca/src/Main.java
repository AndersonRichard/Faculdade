public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Minha Biblioteca");

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling");

        Autor autor1 = new Autor("J.R.R. Tolkien");
        Autor autor2 = new Autor("J.K. Rowling");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.adicionarAutor(autor1);
        biblioteca.adicionarAutor(autor2);

        String tituloLivro = "O Senhor dos Anéis";
        boolean disponivel = biblioteca.verificarDisponibilidade(tituloLivro);

        if (disponivel) {
            System.out.println("O livro '" + tituloLivro + "' está disponível na biblioteca.");
        } else {
            System.out.println("O livro '" + tituloLivro + "' não está disponível na biblioteca.");
        }

        biblioteca.listarLivrosDisponiveis();
    }
}