import java.util.Date;

public class Emprestimo {
    private Livro livroEmprestado;
    private Usuario usuario;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo(Livro livroEmprestado, Usuario usuario, Date dataEmprestimo, Date dataDevolucao) {
        this.livroEmprestado = livroEmprestado;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivroEmprestado() {
        return livroEmprestado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }
}
