public class Tarefa {
    private String nome;
    private String descricao;
    private int duracaoEstimada;
    private String estado; // "novo", "em andamento", "concluido"

    public Tarefa(String nome, String descricao, int duracaoEstimada, String estado) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracaoEstimada = duracaoEstimada;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDuracaoEstimada() {
        return duracaoEstimada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
