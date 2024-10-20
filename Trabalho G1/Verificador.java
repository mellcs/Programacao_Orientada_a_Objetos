import java.util.Scanner;

public class Verificador {

    public static void separador() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a autonomia do carro? ");
        double autonomia = scanner.nextDouble();

        System.out.println("Qual o tempo de carga do carro? ");
        double tempoCarga = scanner.nextDouble();

        if (autonomia <= 200 && tempoCarga == 4) {
            CarroCompacto.cadastrar();
        } else if (autonomia <= 400 && tempoCarga == 6) {
            CarroSedan.cadastrar();
        } else if (autonomia > 400 && tempoCarga == 8) {
            SUVEletrico.cadastrar();
        } else {
            System.out.println("Os parâmetros fornecidos não correspondem a nenhum tipo de carro elétrico.");
        }
    }
}
