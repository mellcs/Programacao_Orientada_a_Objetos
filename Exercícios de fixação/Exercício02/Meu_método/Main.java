public class Main {
    public static void main(String[] args) {
        Frota frota = new Frota();

        Veiculo veiculo1 = new Veiculo("Caminhão", "ABC-1234", 1000);
        Motorista motorista1 = new Motorista("João Silva", "CNH123456");

        frota.adicionarVeiculo(veiculo1);
        frota.registrarViagem(veiculo1, motorista1, "São Paulo", "Rio de Janeiro", 430.0);

        frota.listarViagensPorVeiculo("ABC-1234");
        System.out.println("Quilometragem total: " + frota.calcularQuilometragemTotal());
    }
}
