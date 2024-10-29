import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc;

        List<VeiculosEletricos> frota = new ArrayList<>();
        List<Motoristas> motoristasCadastrados = new ArrayList<>();
        List<Eletropostos> eletropostosCadastrados = new ArrayList<>();
        
        VeiculosEletricos veiculos = new VeiculosEletricos(0, null, null, 0, 0.0, 0.0);
        Motoristas motoristas = new Motoristas(null, 0, 0.0, null); 
        Eletropostos eletropostos = new Eletropostos(0, null, 0, 0.0); 
        CarregamentoBaterias carregamento = new CarregamentoBaterias();
        Viagens viagem = new Viagens(0.0, null, eletropostosCadastrados,frota);

        do {
            System.out.println(">>> MENU <<<");
            System.out.println("1 - Cadastrar carro.");
            System.out.println("2 - Remover carro.");
            System.out.println("3 - Listar carros.");
            System.out.println("4 - Cadastrar motorista.");
            System.out.println("5 - Listar motoristas.");
            System.out.println("6 - Cadastrar eletroposto.");
            System.out.println("7 - Listar eletropostos.");
            System.out.println("8 - Registrar viagem.");
            System.out.println("9 - Registrar recarga.");
            System.out.println("10 - Histórico de recargas.");
            System.out.println("0 - Sair.");
            System.out.print("O que você gostaria de fazer: ");
            opc = scanner.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.print("Digite a autonomia máxima: ");
                    double autonomia = scanner.nextDouble();
                    System.out.print("Digite o tempo médio de carregamento: ");
                    int tempoCarga = scanner.nextInt();

                    VeiculosEletricos novoVeiculo = null;

                    if (autonomia <= 200 && tempoCarga == 4) {
                        novoVeiculo = new CarroCompacto(0, "", "", 0, 0.0, autonomia);
                        System.out.println("Você está adicionando um carro compacto à frota.");
                    } else if (autonomia <= 400 && tempoCarga == 6) {
                        novoVeiculo = new CarroSedan(0, "", "", 0, 0.0, autonomia);
                        System.out.println("Você está adicionando um carro sedan à frota.");
                    } else if (autonomia > 400 && tempoCarga == 8) {
                        novoVeiculo = new SUVEletrico(0, "", "", 0, 0.0, autonomia);
                        System.out.println("Você está adicionando um SUV elétrico à frota.");
                    } else {
                        System.out.println("Os parâmetros fornecidos não correspondem a nenhum tipo de carro elétrico.");
                        break;
                    }

                    novoVeiculo.addCarro(frota); // Adiciona o novo veículo à frota
                    break;
                case 2:
                    veiculos.removeCarro(frota); 
                    break;
                case 3:
                    veiculos.listarCarros(frota); 
                    break;
                case 4:
                    motoristas.cadMotorista(motoristasCadastrados);
                    break;
                case 5:
                    motoristas.exibirMotoristas(motoristasCadastrados); 
                    break;
                case 6:
                    eletropostos.cadastrar(eletropostosCadastrados); 
                    break;
                case 7:
                    eletropostos.exibirPosto(eletropostosCadastrados); 
                    break;
                case 8:
                    viagem.comecarViagem();
                case 9:
                    carregamento.selecionarVeiculo(frota); 
                    break;
                case 10:
                    carregamento.consultarHistoricoRecargas(); 
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
