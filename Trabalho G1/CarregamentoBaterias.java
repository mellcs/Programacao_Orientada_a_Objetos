import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CarregamentoBaterias {
    private List<String> historicoRecargas; 
    private VeiculosEletricos veiculo; 

    public CarregamentoBaterias() {
        this.historicoRecargas = new ArrayList<>(); 
    }

    public void selecionarVeiculo(List<VeiculosEletricos> frota) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione um veículo da lista:");

        listarVeiculos(frota);

        System.out.print("Digite o ID do veículo escolhido: ");
        int idEscolhido = scanner.nextInt();

        for (VeiculosEletricos veiculo : frota) {
            if (veiculo.getId_Num() == idEscolhido) { 
                this.veiculo = veiculo;
                registrarRecarga(); 
                return;
            }
        }

        System.out.println("Veículo não encontrado.");
    }

    private void listarVeiculos(List<VeiculosEletricos> frota) {
        if (frota.isEmpty()) {
            System.out.println("Nenhum veículo na frota.");
        } else {
            System.out.println("Veículos da frota:");
            for (VeiculosEletricos veiculos : frota) {
                System.out.println("ID: " + veiculos.getId_Num() + "| Marca: " + veiculos.getMarca() + 
                                   "| Modelo: " + veiculos.getModelo() + "| Ano de fabricação: " + 
                                   veiculos.getAno_Fab() + "| Autonomia máxima: " + veiculos.getAut_Max());
            }
        }
    }

    public void registrarRecarga() {
        if (veiculo == null) {
            System.out.println("Nenhum veículo selecionado.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de recarga em kWh: ");
        double quantidadeRecarga = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("Digite o nome do eletroposto utilizado: ");
        String eletropostoUtilizado = scanner.nextLine();

        if (veiculo.getAut_Max() + quantidadeRecarga > veiculo.getCap_Total_Bat()) {
            veiculo.setAut_Max(veiculo.getCap_Total_Bat()); 
        } else {
            veiculo.setAut_Max(veiculo.getAut_Max() + quantidadeRecarga); 
        }

        Date dataRecarga = new Date();
        String registro = "Data: " + dataRecarga.toString() + "| Eletroposto: " + eletropostoUtilizado + 
                         "| Quantidade Recarga: " + quantidadeRecarga + " kWh " + 
                         "| Autonomia Atualizada: " + veiculo.getAut_Max() + " km";
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
