public class Recarga {
    private Eletropostos eletropostos;
    private double quantidadeRecarga;
    private String dataHora;
    private int id_Num;

    public Recarga(Eletropostos eletropostos, double quantidadeRecarga, String dataHora, int id_Num) {
        this.eletropostos = eletropostos;
        this.quantidadeRecarga = quantidadeRecarga;
        this.dataHora = dataHora;
        this.id_Num = id_Num;
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
    
    public int getId_Num() {
        return id_Num;
    }
}
