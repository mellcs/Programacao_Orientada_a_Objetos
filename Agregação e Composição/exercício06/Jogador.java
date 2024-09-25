public class Jogador {
    private String nome;
    private String posicao;

    // Construtor
    public Jogador(String nome, String posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    // Método para exibir informações do jogador
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Posição: " + posicao);
    }
}
