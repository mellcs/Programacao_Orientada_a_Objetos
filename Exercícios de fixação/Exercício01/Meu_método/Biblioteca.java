import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livrosDisponiveis;
    private ArrayList<Emprestimo> emprestimosRealizados;

    public Biblioteca() {
        this.livrosDisponiveis = new ArrayList<>();
        this.emprestimosRealizados = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livrosDisponiveis.add(livro);
    }

    public void registrarEmprestimo(Livro livro, Usuario usuario, Emprestimo emprestimo) {
        livro.emprestarLivro();
        emprestimosRealizados.add(emprestimo);
    }

    public void listarLivrosDisponiveis() {
        for (Livro livro : livrosDisponiveis) {
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + 
                               ", Quantidade disponível: " + livro.getQuantidadeEmEstoque());
        }
    }
}
