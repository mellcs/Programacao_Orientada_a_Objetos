import java.util.ArrayList;

public class TimeDeFutebol {
    private String nome;
    private ArrayList<Jogador> jogadores;

    // Construtor
    public TimeDeFutebol(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    // Método para adicionar jogador ao time
    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
        System.out.println("Jogador " + jogador.getNome() + " adicionado ao time " + nome + ".");
    }

    // Método para remover jogador do time
    public void removerJogador(String nomeJogador) {
        Jogador jogadorParaRemover = null;
        for (Jogador j : jogadores) {
            if (j.getNome().equals(nomeJogador)) {
                jogadorParaRemover = j;
                break;
            }
        }
        if (jogadorParaRemover != null) {
            jogadores.remove(jogadorParaRemover);
            System.out.println("Jogador " + nomeJogador + " removido do time " + nome + ".");
        } else {
            System.out.println("Jogador " + nomeJogador + " não encontrado no time " + nome + ".");
        }
    }

    // Método para listar todos os jogadores do time
    public void listarJogadores() {
        if (jogadores.isEmpty()) {
            System.out.println("Nenhum jogador no time " + nome + ".");
        } else {
            System.out.println("Jogadores do time " + nome + ":");
            for (Jogador j : jogadores) {
                j.exibirInformacoes();
            }
        }
    }

    // Método main para testar a classe TimeDeFutebol
    public static void main(String[] args) {
        // Criando um time de futebol
        TimeDeFutebol time = new TimeDeFutebol("Futebol Clube XYZ");

        // Criando jogadores
        Jogador jogador1 = new Jogador("Carlos Silva", "Atacante");
        Jogador jogador2 = new Jogador("Ana Pereira", "Meio-campista");

        // Adicionando jogadores ao time
        time.adicionarJogador(jogador1);
        time.adicionarJogador(jogador2);

        // Listando jogadores do time
        time.listarJogadores();

        // Removendo um jogador
        time.removerJogador("Ana Pereira");

        // Listando jogadores após remoção
        time.listarJogadores();
    }
}
