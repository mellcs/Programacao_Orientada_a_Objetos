import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o valor aplicado inicialmente
        System.out.print("Digite o valor aplicado inicialmente: ");
        double startValue = scanner.nextDouble();

        // Percentual de juros do banco
        System.out.print("Digite o valor do juros mensal (em %): ");
        double juros = scanner.nextDouble();

        // Quantidade de meses aplicado
        System.out.print("Digite a quantidade de meses que o valor ficou armazenado: ");
        int months = scanner.nextInt();

        // Calcular o saldo final usando Math.pow
        double percJuros = juros / 100; // Convertendo o percentual de juros para um fator decimal
        double finalValue = startValue * Math.pow(1 + percJuros, months);

        // Escrever o saldo final
        System.out.printf("O saldo final da aplicação é: %.2f%n", finalValue);
        
        scanner.close();
    }
}
