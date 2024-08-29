import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Jogo {
    String nome;
    String dataLancamento;
    ArrayList<Jogador> jogadores;

    // Construtor para inicializar os atributos do jogo
    public Jogo(String nome, String dataLancamento) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.jogadores = new ArrayList<>();
    }

    // Método para adicionar um jogador ao jogo
    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    // Método para exibir o ranking dos jogadores baseado na pontuação
    public void exibirRanking() {
        // Ordenando a lista de jogadores por pontuação (maior para menor)
        Collections.sort(jogadores, new Comparator<Jogador>() {
            public int compare(Jogador j1, Jogador j2) {
                return j2.pontuacao - j1.pontuacao;
            }
        });

        // Exibindo o ranking
        System.out.println("Ranking de jogadores:");
        for (Jogador jogador : jogadores) {
            System.out.println("Nome: " + jogador.nome + ", Pontuação: " + jogador.pontuacao + ", Nível: " + jogador.nivel);
        }
    }

    // Método para promover jogadores com base em desempenho
    public void promoverJogadores(int pontuacaoMinima) {
        for (Jogador jogador : jogadores) {
            if (jogador.pontuacao >= pontuacaoMinima) {
                jogador.promover();
                System.out.println(jogador.nome + " foi promovido ao nível " + jogador.nivel);
            }
        }
    }

    public static void main(String[] args) {
        // Criando o jogo
        Jogo jogo = new Jogo("Aventura Espacial", "27/08/2024");

        // Adicionando jogadores ao jogo
        jogo.adicionarJogador(new Jogador("Alice", 1, 1500));
        jogo.adicionarJogador(new Jogador("Bob", 2, 1200));
        jogo.adicionarJogador(new Jogador("Carlos", 3, 1800));

        // Exibindo o ranking dos jogadores
        jogo.exibirRanking();

        // Promovendo jogadores com pontuação mínima de 1300
        jogo.promoverJogadores(1300);

        // Exibindo o ranking atualizado
        jogo.exibirRanking();
    }
}
