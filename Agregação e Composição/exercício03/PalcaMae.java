public class PlacaMae {
    private String modelo;

    // Construtor
    public PlacaMae(String modelo) {
        this.modelo = modelo;
    }

    // Exibir informações da placa mãe
    public void exibirInformacoes() {
        System.out.println("Placa Mãe: " + modelo);
    }
}
