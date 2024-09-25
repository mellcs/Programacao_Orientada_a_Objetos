public class Processador {
    private String modelo;
    private double velocidadeGHz;

    // Construtor
    public Processador(String modelo, double velocidadeGHz) {
        this.modelo = modelo;
        this.velocidadeGHz = velocidadeGHz;
    }

    // Exibir informações do processador
    public void exibirInformacoes() {
        System.out.println("Processador: " + modelo + " - " + velocidadeGHz + " GHz");
    }
}
