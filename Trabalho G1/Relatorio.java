import java.util.List;

public class Relatorio {

    public void autonomiaCarros(List<VeiculosEletricos> veiculos) {
        System.out.println("Carros com média inferior a 20% de autonomia:");
        for (VeiculosEletricos veiculo : veiculos) {
            if (veiculo.getAut_Max() < 20) {
                System.out.println("Placa: " + veiculo.getId_Num() + "| Autonomia do Carro: " + veiculo.getAut_Max() + "%");
            }
        }
    }

    public void listarViagensPorMotorista(List<Viagens> viagens, List<Motoristas> motoristasCadastrados, int numId) {
        Motoristas motorista = motoristasCadastrados.stream()
                .filter(m -> m.getNumId() == numId)
                .findFirst()
                .orElse(null);
    
        if (motorista == null) {
            System.out.println("Motorista não encontrado.");
            return;
        }
    
        System.out.println("Viagens realizadas pelo motorista " + motorista.getNome() + ":");
        for (Viagens viagem : viagens) {
            if (viagem.getMotorista().getNumId() == numId) { 
                String veiculoModelo = viagem.getVeiculoUsado() != null ? viagem.getVeiculoUsado().getModelo() : "Desconhecido";
                String eletropostoInfo = (viagem.getRecarga() != null && !viagem.getRecarga().isEmpty()) ? 
                    String.valueOf(viagem.getRecarga().get(0).getEletropostos().getId()) : "Passou por aqui"; 
                System.out.println("Distância: " + viagem.getDistancia() +
                        ", Veículo: " + veiculoModelo +
                        ", Eletroposto: " + eletropostoInfo +
                        ", Data: " + viagem.getDataHora());
            }
        }
    }
    
    public void consultarHistoricoRecargas(List<Recarga> recargas, int id_num) {
        System.out.println("Histórico de recargas para o veículo ID: " + id_num);
        for (Recarga recarga : recargas) {
            if (recarga.getId_Num() == id_num) {
                System.out.println("Eletroposto: " + recarga.getEletropostos().getId() +
                        ", Quantidade: " + recarga.getQuantidadeRecarga() +
                        ", Data e Hora: " + recarga.getDataHora());
            }
        }
    }
        
    public void carrosManutencao(List<VeiculosEletricos> veiculos, double limiteQuilometros, double bateriaDuracao) {
        System.out.println("Carros que precisam de manutenção: ");
        for (VeiculosEletricos veiculo : veiculos) {
            if (veiculo.getQuilometragem() > limiteQuilometros || veiculo.getAut_Max() < bateriaDuracao) {
                System.out.println("Placa: " + veiculo.getId_Num() + "| Quilometragem: " + veiculo.getQuilometragem() + "| Autonomia da bateria: " + veiculo.getAut_Max() + "%");
            }
        }
    }

    
    public void gerarRelatorio(List<VeiculosEletricos> frota, List<Motoristas> motoristasCadastrados, List<Viagens> viagens, List<Recarga> recargas, int numId, int id_num, double limiteQuilometros, double bateriaDuracao) {
        System.out.println(">>> RELATÓRIO GERAL <<<");
        autonomiaCarros(frota);
        listarViagensPorMotorista(viagens, motoristasCadastrados, numId); 
        consultarHistoricoRecargas(recargas, id_num); 
        carrosManutencao(frota, limiteQuilometros, bateriaDuracao); 
    }
}
