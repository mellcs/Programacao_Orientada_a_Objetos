public class Viagem {
    public Veiculo veiculo;
    public Motorista motorista;
    public String origem;
    public String destino;
    public double distancia;

    public Viagem(Veiculo veiculo, Motorista motorista, String origem, String destino, double distancia) {
        this.veiculo = veiculo;
        this.motorista = motorista;
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }
}
