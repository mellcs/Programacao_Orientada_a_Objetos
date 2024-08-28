import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> livros;

    // Construtor para inicializar a lista de livros
    public Biblioteca() {
        livros = new ArrayList<>();
    }

    // Método para adicionar um livro à biblioteca
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    // Método para remover um livro da biblioteca pelo título
    public void removerLivro(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).titulo.equals(titulo)) {
                livros.remove(i);
                break;
            }
        }
    }

    // Método para buscar livros por título ou autor
    public void buscarLivro(String termo) {
        for (Livro livro : livros) {
            if (livro.titulo.contains(termo) || livro.autor.contains(termo)) {
                System.out.println("Título: " + livro.titulo + ", Autor: " + livro.autor + ", Ano: " + livro.anoPublicacao);
            }
        }
    }

    public static void main(String[] args) {
        // Criando uma biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell", 1949));
        biblioteca.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis", 1899));

        // Buscando livros por autor
        System.out.println("Buscando livros de 'George Orwell':");
        biblioteca.buscarLivro("George Orwell");

        // Buscando livros por título
        System.out.println("\nBuscando livros com 'Dom' no título:");
        biblioteca.buscarLivro("Dom");

        // Removendo um livro
        biblioteca.removerLivro("1984");

        // Buscando novamente após a remoção
        System.out.println("\nBuscando livros de 'George Orwell' após a remoção:");
        biblioteca.buscarLivro("George Orwell");
    }
}
