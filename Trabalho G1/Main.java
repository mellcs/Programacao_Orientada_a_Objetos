import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc;

        List<VeiculosEletricos> frota = new ArrayList<>();
        List<Viagem> viagens = new ArrayList<>(); 

        Motoristas motoristas = new Motoristas(null, 0, 0.0, null);
        Eletropostos eletropostos = new Eletropostos(0, null, 0, 0.0);
        CarregamentoBaterias carregamento = new CarregamentoBaterias();
        VeiculosEletricos veiculosEletricos = new VeiculosEletricos(0, "", "", 0, 0.0, 0.0);
        Relatorio relatorio = new Relatorio();

        do {
            System.out.println(">>> MENU <<<");
            System.out.println("1 - Cadastrar carro.");
            System.out.println("2 - Remover carro.");
            System.out.println("3 - Listar carros.");
            System.out.println("4 - Cadastrar motorista.");
            System.out.println("5 - Listar motoristas.");
            System.out.println("6 - Cadastrar eletroposto.");
            System.out.println("7 - Listar eletropostos.");
            System.out.println("8 - Registrar recarga.");
            System.out.println("9 - Histórico de recargas.");
            System.out.println("10 - Relatório de autonomia dos carros.");
            System.out.println("11 - Relatório de viagens por motorista.");
            System.out.println("12 - Histórico de recargas de um veículo.");
            System.out.println("13 - Relatório de carros que precisam de manutenção.");
            System.out.println("0 - Sair.");
            System.out.print("O que você gostaria de fazer: ");
            opc = scanner.nextInt();
            
            switch (opc) {
                case 1:
                    veiculosEletricos.addCarro(frota);
                    break;
                case 2:
                    veiculosEletricos.removeCarro(frota);
                    break;
                case 3:
                    veiculosEletricos.listarCarros(frota);
                    break;
                case 4:
                    motoristas.cadMotorista();
                    break;
                case 5:
                    motoristas.exibirMotoristas();
                    break;
                case 6:
                    eletropostos.cadastrar();
                    break;
                case 7:
                    eletropostos.exibirPosto();
                    break;
                case 8:
                    carregamento.selecionarVeiculo(frota);
                    break;
                case 9:
                    carregamento.consultarHistoricoRecargas();
                    break;
                case 10: 
                    relatorio.autonomiaCarros(frota);
                    break;
                case 11: 
                    System.out.print("Digite o nome do motorista para o relatório: ");
                    scanner.nextLine(); 
                    String nomeMotorista = scanner.nextLine();
                    Motoristas motorista = motoristas.buscarPorNome(nomeMotorista); 
                    if (motorista != null) {
                        relatorio.relatorioMotorista(motorista, viagens);
                    } else {
                        System.out.println("Motorista não encontrado.");
                    }
                    break;
                case 12: 
                    System.out.print("Digite a placa do veículo para o histórico: ");
                    scanner.nextLine(); 
                    String placaVeiculo = scanner.nextLine();
                    VeiculosEletricos veiculo = veiculosEletricos.buscarPorPlaca(frota, placaVeiculo); 
                    if (veiculo != null) {
                        relatorio.historicoRecarga(veiculo, viagens);
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;
                case 13: // Relatório de carros que precisam de manutenção
                    relatorio.carrosManutencao(frota, 5000.0, 20.0); // Ex: de quilometragem e bateria
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            System.out.println();
        } while (opc != 0);

        scanner.close();
    }
}

