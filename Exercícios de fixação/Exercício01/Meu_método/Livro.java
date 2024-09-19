public class Livro {
    private String titulo;
    private String autor;
    private int quantidadeEmEstoque;

    public Livro(String titulo, String autor, int quantidadeEmEstoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void emprestarLivro() {
        if (quantidadeEmEstoque > 0) {
            quantidadeEmEstoque--;
        } else {
            System.out.println("Livro indisponível para empréstimo.");
        }
    }

    public void devolverLivro() {
        quantidadeEmEstoque++;
    }
}
