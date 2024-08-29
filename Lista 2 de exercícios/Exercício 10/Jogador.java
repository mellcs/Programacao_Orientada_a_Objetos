public class Jogador {
    String nome;
    int nivel;
    int pontuacao;

    // Construtor para inicializar os atributos do jogador
    public Jogador(String nome, int nivel, int pontuacao) {
        this.nome = nome;
        this.nivel = nivel;
        this.pontuacao = pontuacao;
    }

    // Método para promover o jogador (aumentar nível)
    public void promover() {
        nivel++;
    }
}
