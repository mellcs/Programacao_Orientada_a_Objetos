import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 5);
        Usuario usuario1 = new Usuario("Maria Silva", "123.456.789-00");

        biblioteca.adicionarLivro(livro1);
        Emprestimo emprestimo1 = new Emprestimo(livro1, usuario1, new Date(), null);

        biblioteca.registrarEmprestimo(livro1, usuario1, emprestimo1);
        biblioteca.listarLivrosDisponiveis();
    }
}
