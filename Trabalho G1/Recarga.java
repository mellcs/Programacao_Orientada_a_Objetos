public class Recarga {
    private Eletroposto eletroposto;
    private double quantidadeRecarga;
    private String dataHora;

    public Recarga(Eletroposto eletroposto, double quantidadeRecarga, String dataHora) {
        this.eletroposto = eletroposto;
        this.quantidadeRecarga = quantidadeRecarga;
        this.dataHora = dataHora;
    }

    public Eletroposto getEletroposto() {
        return eletroposto;
    }

    public double getQuantidadeRecarga() {
        return quantidadeRecarga;
    }

    public String getDataHora() {
        return dataHora;
    }
}
