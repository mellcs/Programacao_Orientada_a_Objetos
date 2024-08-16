import java.util.Scanner;

public class Inteiros {

    public static int somador(int numero) {
        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            soma += i;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o número: ");
        int numero = scanner.nextInt();
        
        int resultado = somador(numero);
        System.out.println("A soma dos " + numero + " primeiros números inteiros positivos é " + resultado);
        
        scanner.close();
    }
}
