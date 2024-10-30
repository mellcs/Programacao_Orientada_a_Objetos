import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Viagens {
    protected double quilometragem; // Quilometragem total da viagem
    protected String destino;
    private VeiculosEletricos veiculo;
    private Motoristas motorista; // Motorista responsável pela viagem
    private List<Eletropostos> eletropostosCadastrados;
    private List<VeiculosEletricos> frota;
    private List<Recarga> recargas;

    public Viagens(double quilometragem, String destino, Motoristas motorista, List<Eletropostos> eletropostosCadastrados, List<VeiculosEletricos> frota) {
        this.quilometragem = quilometragem; // Inicializa com a quilometragem fornecida
        this.destino = destino;
        this.motorista = motorista; // Inicializa o motorista
        this.eletropostosCadastrados = eletropostosCadastrados;
        this.frota = frota;
        this.recargas = new ArrayList<>();
    }

    public void comecarViagem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Com qual carro você vai realizar a viagem? Insira seu id: ");
        VeiculosEletricos veiculosEletricos = new VeiculosEletricos(0, "", "", 0, 0.0, 0.0);
        veiculosEletricos.listarCarros(frota);
        int carroId = scanner.nextInt();
        scanner.nextLine();

        boolean encontrado = false;
        for (VeiculosEletricos v : frota) {
            if (v.getId_Num() == carroId) {
                veiculo = v;
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Insira a quilometragem da viagem: ");
            double quilometragemViagem = scanner.nextDouble();
            scanner.nextLine();

            // Atualiza a quilometragem total da viagem
            this.quilometragem += quilometragemViagem;

            if (quilometragemViagem <= veiculo.getAut_Max()) {
                atualizarAutonomiaVeiculo(quilometragemViagem);
                System.out.println("Viagem concluída! Autonomia atualizada para: " + veiculo.getAut_Max() + " km.");
            } else {
                planejarParadas();
            }
        } else {
            System.out.println("Carro informado não está disponível.");
        }
    }

    public void planejarParadas() {
        double autonomiaRestante = veiculo.getAut_Max();

        if (quilometragem > autonomiaRestante) {
            System.out.println("Autonomia insuficiente para a viagem completa. Planejando paradas...");

            for (Eletropostos posto : eletropostosCadastrados) {
                if (posto.getVagas() > 0) {
                    System.out.println("Parada planejada no eletroposto em " + posto.getLocal() +
                                       ". Vagas disponíveis: " + posto.getVagas() +
                                       ", Tempo de carga: " + posto.getTempoCarga() + " horas");

                    autonomiaRestante += veiculo.getCap_Total_Bat();

                    if (autonomiaRestante >= quilometragem) {
                        System.out.println("Paradas planejadas concluídas. Autonomia suficiente para a viagem.");
                        atualizarAutonomiaVeiculo(quilometragem);
                        return;
                    }
                }
            }
            System.out.println("Nenhum eletroposto disponível com vagas. Recalcule sua rota ou aguarde disponibilidade.");
        } else {
            System.out.println("Autonomia suficiente para a viagem.");
            atualizarAutonomiaVeiculo(quilometragem);
        }
    }

    public void atualizarAutonomiaVeiculo(double quilometragemPercorrida) {
        double novaAutonomia = veiculo.getAut_Max() - quilometragemPercorrida;
        veiculo.setAut_Max(novaAutonomia);
    }

    // Getters e Setters
    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Motoristas getMotorista() {
        return motorista;
    }

    public void setMotorista(Motoristas motorista) {
        this.motorista = motorista;
    }
    
    public VeiculosEletricos getVeiculo() {
        return veiculo; // Método para obter o veículo
    }

    public double getDistancia() {
        return quilometragem; // Método para obter a distância
    }

    public List<Recarga> getRecarga() {
        return recargas;
    }
}
