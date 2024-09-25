public class Comodo {
    private String tipo; // tipo do cômodo (quarto, sala, banheiro)
    private double tamanho; // tamanho do cômodo em metros quadrados

    // Construtor
    public Comodo(String tipo, double tamanho) {
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public double getTamanho() {
        return tamanho;
    }

    // Método para exibir informações do cômodo
    public void exibirInformacoes() {
        System.out.println("Tipo: " + tipo + ", Tamanho: " + tamanho + " m²");
    }
}
