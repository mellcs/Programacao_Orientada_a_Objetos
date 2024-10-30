public class Recarga {
    private Eletropostos eletropostos;
    private double quantidadeRecarga;
    private String dataHora;

    public Recarga(Eletropostos eletropostos, double quantidadeRecarga, String dataHora) {
        this.eletropostos = eletropostos;
        this.quantidadeRecarga = quantidadeRecarga;
        this.dataHora = dataHora;
    }

    public Eletropostos getEletropostos() {
        return eletropostos;
    }

    public double getQuantidadeRecarga() {
        return quantidadeRecarga;
    }

    public String getDataHora() {
        return dataHora;
    }
}
