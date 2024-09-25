public class Livro {
    private String titulo;
    private String autor;

    // Construtor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    // Método para exibir informações do livro
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo + ", Autor: " + autor);
    }
}
