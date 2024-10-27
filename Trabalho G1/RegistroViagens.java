import java.util.Scanner;

public class RegistroViagens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        veiculoEletrico carroA = new veiculoEletrico("ABC1234", 100, 100);

        System.out.print("Digite a distância da viagem em km: ");
        double distancia = scanner.nextDouble();
        scanner.nextLine();  
        System.out.print("Digite o destino da viagem: ");
        String destino = scanner.nextLine();

        Viagem viagemA = new Viagem(carroA, distancia, destino);
        viagemA.iniciarViagem();

        scanner.close();
    }
}
