import java.util.List;

public class Relatorio {

    public void autonomiaCarros(List<VeiculoEletrico> veiculos) {
        System.out.println("Carros com media inferior a 20%:");
        for (VeiculoEletrico veiculo : veiculos) {
            if (veiculo.getAutonomiaMax() < 20) {
                System.out.println("Placa: " + veiculo.getIdNum() + ", Autonomia do Carro: " + veiculo.getAutonomiaMax() + "%");
            }
        }
    }

    public void relatorioMotorista(Motorista motorista) {
        System.out.println("Viagens feitas pelo motorista " + motorista.getNome() + ":");
        for (Viagem viagem : motorista.getViagens()) {
            System.out.println("Veículo: " + viagem.getVeiculo().getIdNum() + ", Distância: " + viagem.getDistancia() + " km");
            if (!viagem.getRecargas().isEmpty()) {
                System.out.println("Total de Recargas:");
                for (Recarga recarga : viagem.getRecargas()) {
                    System.out.println("Eletroposto: " + recarga.getEletroposto() + ", Quantidade: " + recarga.getQuantidadeRecarga() + " kW, Data: " + recarga.getDataHora());
                }
            }
        }
    }

   
    public void historicoRecarga(Veiculo veiculo, List<Viagem> viagens) {
        System.out.println("Recargas do Veículo: " + veiculo.getPlaca());
        for (Viagem viagem : viagens) {
            if (viagem.getVeiculo().equals(veiculo)) {
                for (Recarga recarga : viagem.getRecargas()) {
                    System.out.println("Eletroposto: " + recarga.getEletroposto() + ", Quantidade: " + recarga.getQuantidadeRecarga() + " kW, Data: " + recarga.getDataHora());
                }
            }
        }
    }

   
    public void CarrosManutencao(List<Veiculo> veiculos, Double LimiteQuilometros, Double BateriaDuraçao) {
        System.out.println("Carros que precisam de manutenção:");
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getQuilometragem() > LimiteQuilometros || veiculo.getAutonomia() < BateriaDuraçao) {
                System.out.println("Placa: " + veiculo.getPlaca() + ", Quilometragem: " + veiculo.getQuilometragem() + ", Autonomia da bateria: " + veiculo.getAutonomia() + "%");
            }
        }
    }
}
