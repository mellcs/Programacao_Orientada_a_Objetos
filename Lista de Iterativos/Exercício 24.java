import java.util.Scanner;

public class MenorNumeroPerfeito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorNumerosPerfeitos = 0;
        int menorNumeroPerfeito = Integer.MAX_VALUE;

        System.out.println("Digite números inteiros. O programa irá parar após informar dez números perfeitos.");

        while (contadorNumerosPerfeitos < 10) {
            int numero = scanner.nextInt();
            if (ehNumeroPerfeito(numero)) {
                contadorNumerosPerfeitos++;
                if (numero < menorNumeroPerfeito) {
                    menorNumeroPerfeito = numero;
                }
            }
        }

        System.out.println("O menor número perfeito informado foi: " + menorNumeroPerfeito);
        scanner.close();
    }

    public static boolean ehNumeroPerfeito(int numero) {
        int somaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }
        return somaDivisores == numero;
    }
}
