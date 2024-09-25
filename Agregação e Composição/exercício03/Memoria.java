public class Memoria {
    private int capacidadeGB;

    // Construtor
    public Memoria(int capacidadeGB) {
        this.capacidadeGB = capacidadeGB;
    }

    // Exibir informações da memória
    public void exibirInformacoes() {
        System.out.println("Memória: " + capacidadeGB + " GB");
    }
}
