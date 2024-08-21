public class NumerosPiramidais {

    // Função que verifica se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        if (numero == 2 || numero == 3) return true;
        if (numero % 2 == 0 || numero % 3 == 0) return false;
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) return false;
        }
        return true;
    }

    // Função principal para encontrar e exibir os primeiros 100 números piramidais
    public static void main(String[] args) {
        int contagemPiramidais = 0;
        int numero = 2;
        int[] primos = new int[3]; // Para armazenar os três últimos números primos encontrados
        int indicePrimo = 0;

        System.out.println("Os primeiros 100 números piramidais são:");

        // Continuar até encontrar 100 números piramidais
        while (contagemPiramidais < 100) {
            if (ehPrimo(numero)) {
                primos[indicePrimo % 3] = numero; // Armazena o primo atual em ordem circular
                indicePrimo++;

                // Verifica se já temos três primos para somar
                if (indicePrimo >= 3) {
                    int piramidal = primos[0] + primos[1] + primos[2];
                    System.out.println(piramidal);
                    contagemPiramidais++;
                }
            }
            numero++;
        }
    }
}
