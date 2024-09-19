import java.util.ArrayList;

public class Frota {
    public ArrayList<Veiculo> veiculos;
    public ArrayList<Viagem> viagens;

    public Frota() {
        veiculos = new ArrayList<>();
        viagens = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void registrarViagem(Veiculo veiculo, Motorista motorista, String origem, String destino, double distancia) {
        Viagem novaViagem = new Viagem(veiculo, motorista, origem, destino, distancia);
        viagens.add(novaViagem);
    }

    public void listarViagensPorVeiculo(String placa) {
        for (Viagem viagem : viagens) {
            if (viagem.veiculo.placa.equals(placa)) {
                System.out.println("Viagem de " + viagem.origem + " para " + viagem.destino + ", Distância: " + viagem.distancia);
            }
        }
    }

    public double calcularQuilometragemTotal() {
        double total = 0;
        for (Viagem viagem : viagens) {
            total += viagem.distancia;
        }
        return total;
    }
}
