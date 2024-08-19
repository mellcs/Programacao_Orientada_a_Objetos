import java.util.Scanner;

public class VerificadorFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumeros = 0;
        int totalFibonacci = 0;

        System.out.println("Digite números (digite um número negativo para sair):");

        while (true) {
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            totalNumeros++;
            if (ehFibonacci(numero)) {
                totalFibonacci++;
            }
        }

        if (totalNumeros > 0) {
            double percentualFibonacci = ((double) totalFibonacci / totalNumeros) * 100;
            System.out.printf("Percentual de números da sequência de Fibonacci: %.2f%%\n", percentualFibonacci);
        } else {
            System.out.println("Nenhum número foi informado.");
        }

        scanner.close();
    }

    public static boolean ehFibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }
        int termoAnterior = 0, termoAtual = 1, proximoTermo = 1;
        while (proximoTermo < numero) {
            proximoTermo = termoAnterior + termoAtual;
            termoAnterior = termoAtual;
            termoAtual = proximoTermo;
        }
        return proximoTermo == numero;
    }
}
