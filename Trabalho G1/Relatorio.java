import java.util.List;

public class Relatorio {

    public void autonomiaCarros(List<VeiculosEletricos> veiculos) {
        System.out.println("Carros com média inferior a 20% de autonomia:");
        for (VeiculosEletricos veiculo : veiculos) {
            if (veiculo.getAut_Max() < 20) {
                System.out.println("Placa: " + veiculo.getId_Num() + ", Autonomia do Carro: " + veiculo.getAut_Max() + "%");
            }
        }
    }

    public void relatorioMotoristas(List<Motoristas> motoristas) {
    for (Motoristas motorista : motoristas) {
        System.out.println("Motorista: " + motorista.getNome() + ", Viagens realizadas:");
        for (Viagens viagem : motorista.getViagens()) {
            System.out.println("  - Veículo: " + viagem.getVeiculo().getId_Num() + ", Destino: " + viagem.getDestino() + ", Distância: " + viagem.getDistancia() + " km");

            if (!viagem.getRecarga().isEmpty()) {
                System.out.println("    Total de Recargas:");
                for (Recarga recarga : viagem.getRecarga()) {
                    System.out.println("      Eletroposto: " + recarga.getEletropostos() + ", Quantidade: " + recarga.getQuantidadeRecarga() + " kW, Data: " + recarga.getDataHora());
                }
            }
        }
    }
}


    public void historicoRecarga(VeiculosEletricos veiculo, List<Viagens> viagens) {
        System.out.println("Recargas do Veículo: " + veiculo.getId_Num());
        for (Viagens viagem : viagens) {
            if (viagem.getVeiculo().equals(veiculo)) {
                for (Recarga recarga : viagem.getRecarga()) {
                    System.out.println("Eletroposto: " + recarga.getEletropostos() + ", Quantidade: " + recarga.getQuantidadeRecarga() + " kW, Data: " + recarga.getDataHora());
                }
            }
        }
    }

    public void carrosManutencao(List<VeiculosEletricos> veiculos, double limiteQuilometros, double bateriaDuracao) {
        System.out.println("Carros que precisam de manutenção:");
        for (VeiculosEletricos veiculo : veiculos) {
            if (veiculo.getQuilometragem() > limiteQuilometros || veiculo.getAut_Max() < bateriaDuracao) {
                System.out.println("Placa: " + veiculo.getId_Num() + ", Quilometragem: " + veiculo.getQuilometragem() + ", Autonomia da bateria: " + veiculo.getAut_Max() + "%");
            }
        }
    }

    
    public void relatorioGeral(List<VeiculosEletricos> veiculos, List<Motoristas> motoristas, List<Viagens> viagens) {
        System.out.println(">>> Relatório Geral <<<");

        autonomiaCarros(veiculos);
        relatorioMotoristas(motoristas);

        for (VeiculosEletricos veiculo : veiculos) {
            historicoRecarga(veiculo, viagens); 
        }

        double limiteQuilometros = 5000; 
        double bateriaDuracao = 20; 
        carrosManutencao(veiculos, limiteQuilometros, bateriaDuracao);
    }
}
