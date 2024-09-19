public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        // Adicionando quartos
        hotel.adicionarQuarto(new Quarto(101, "simples"));
        hotel.adicionarQuarto(new Quarto(102, "duplo"));
        hotel.adicionarQuarto(new Quarto(103, "suite"));

        // Criando cliente
        Cliente cliente = new Cliente("João", "123456789", "joao@example.com");

        // Realizando reserva
        hotel.reservarQuarto(101, cliente, "20/09/2024", "25/09/2024");

        // Listando quartos disponíveis por tipo
        hotel.listarQuartosDisponiveisPorTipo("simples");

        // Gerando relatório de reservas futuras
        hotel.gerarRelatorioReservasFuturas();

        // Cancelando reserva
        hotel.cancelarReserva(101);
    }
}
