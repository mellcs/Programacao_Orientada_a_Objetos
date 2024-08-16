import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler os valores de entrada
        System.out.print("Digite o valor do lado a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor do lado b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor do ângulo α (em graus): ");
        double alpha = scanner.nextDouble();

        // Converter o ângulo de graus para radianos manualmente
        double pi = 3.141592653589793;
        double alphaRad = alpha * (pi / 180);

        // Calcular a área do triângulo
        double area = (a * b * Math.sin(alphaRad)) / 2;

        // Escrever o resultado
        System.out.printf("A área do triângulo é: %.2f%n", area);
        
        scanner.close();
    }
}
