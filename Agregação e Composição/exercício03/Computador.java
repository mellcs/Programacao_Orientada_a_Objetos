public class Computador {
    private Processador processador;
    private Memoria memoria;
    private PlacaMae placaMae;

    // Construtor
    public Computador(Processador processador, Memoria memoria, PlacaMae placaMae) {
        this.processador = processador;
        this.memoria = memoria;
        this.placaMae = placaMae;
    }

    // Método para exibir as informações do computador
    public void exibirInformacoes() {
        System.out.println("Informações do Computador:");
        processador.exibirInformacoes();
        memoria.exibirInformacoes();
        placaMae.exibirInformacoes();
    }

    // Método main dentro da classe Computador
    public static void main(String[] args) {
        // Criação dos componentes
        Processador processador = new Processador("Intel i7", 3.5);
        Memoria memoria = new Memoria(16);
        PlacaMae placaMae = new PlacaMae("ASUS ROG");

        // Criação do computador
        Computador computador = new Computador(processador, memoria, placaMae);

        // Exibindo informações do computador
        computador.exibirInformacoes();

        // Computador e seus componentes serão destruídos ao final
        System.out.println("Computador destruído (finalizado o programa).");
    }
}
