import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc;

        do {
            System.out.println(">>> MENU <<<");
            System.out.println("1 - Cadastrar carro.");
            System.out.println("2 - Remover carro.");
            System.out.println("3 - Listar carros.");
            System.out.println("4 - Cadastrar motorista.");
            System.out.println("5 - Listar motoristas.");
            System.out.println("6 - Cadastrar eletroposto.");
            System.out.println("7 - Listar eletropostos.");
            System.out.println("0 - Sair.");
            System.out.print("O que você gostaria de fazer: ");
            opc = scanner.nextInt();
            
            switch (opc) {
                case 1:
                    Verificador.separador();
                    break;
                case 2:
                    veiculosEletricos.removeCarro(); 
                    break;
                case 3:
                    veiculosEletricos.listarCarros(); 
                    break;
                case 4:
                    Motoristas.cadMotorista(); 
                    break;
                case 5:
                    Motoristas.exibirMotoristas(); 
                    break;
                case 6:
                    Eletropostos.cadastrar(); 
                    break;
                case 7:
                    Eletropostos.exibirPosto(); 
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
