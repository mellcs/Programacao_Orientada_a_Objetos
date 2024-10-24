import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CarregamentoBaterias {
    private static List<String> historicoRecargas = new ArrayList<>();
    private VeiculosEletricos veiculo;

    public CarregamentoBaterias(VeiculosEletricos veiculo) {
        this.veiculo = veiculo;
    }

    public static void selecionarVeiculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione um veículo da lista:");
        VeiculosEletricos.listarCarros(); 

        System.out.print("Digite o ID do veículo escolhido: ");
        int idEscolhido = scanner.nextInt();

        for (VeiculosEletricos veiculo : VeiculosEletricos.frota) {
            if (veiculo.getId_Num() == idEscolhido) {
                CarregamentoBaterias carregamento = new CarregamentoBaterias(veiculo);
                carregamento.registrarRecarga();
                return;
            }
        }

        System.out.println("Veículo não encontrado.");
    }

    public void registrarRecarga() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de recarga em kWh: ");
        double quantidadeRecarga = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.println("Digite o nome do eletroposto utilizado: ");
        String eletropostoUtilizado = scanner.nextLine();

        if (veiculo.aut_max + quantidadeRecarga > veiculo.cap_total_bat) {
            veiculo.aut_max = veiculo.cap_total_bat;
        } else {
            veiculo.aut_max += quantidadeRecarga;
        }

        Date dataRecarga = new Date();
        String registro = "Data: " + dataRecarga.toString() + ", Eletroposto: " + eletropostoUtilizado + ", Quantidade Recarga: " + quantidadeRecarga + " kWh, Autonomia Atualizada: " + veiculo.aut_max + " km";
        historicoRecargas.add(registro);

        System.out.println("Recarga registrada com sucesso!");
    }

    public void consultarHistoricoRecargas() {
        if (historicoRecargas.isEmpty()) {
            System.out.println("Nenhuma recarga registrada.");
        } else {
            System.out.println("Histórico de Recargas:");
            for (String recarga : historicoRecargas) {
                System.out.println(recarga);
            }
        }
    }
}
