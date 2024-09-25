import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private ArrayList<Livro> livros;

    // Construtor
    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    // Método para adicionar livro à biblioteca
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro '" + livro.getTitulo() + "' adicionado à biblioteca.");
    }

    // Método para listar todos os livros na biblioteca
    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro na biblioteca.");
        } else {
            System.out.println("Livros da biblioteca " + nome + ":");
            for (Livro livro : livros) {
                livro.exibirInformacoes();
            }
        }
    }

    // Método main para testar a classe Biblioteca
    public static void main(String[] args) {
        // Criando a biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal");

        // Criando livros
        Livro livro1 = new Livro("1984", "George Orwell");
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis");

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Listando livros
        biblioteca.listarLivros();

        // A biblioteca e seus livros serão destruídos ao final do programa
        System.out.println("Biblioteca destruída (finalizado o programa).");
    }
}
