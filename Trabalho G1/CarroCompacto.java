import java.util.Scanner;

public class CarroCompacto extends VeiculosEletricos {

    public CarroCompacto(int id_num, String marca, String modelo, int ano_fab, double cap_total_bat, double aut_max) {
        super(id_num, marca, modelo, ano_fab, cap_total_bat, aut_max);
    }

    public static void cadastrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Carro Compacto:");
        VeiculosEletricos.addCarro();  // Utiliza o método da classe mãe
    }
}
