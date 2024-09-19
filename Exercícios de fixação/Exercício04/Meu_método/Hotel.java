import java.util.ArrayList;

public class Hotel {
    private ArrayList<Quarto> quartos;
    private ArrayList<Reserva> reservas;

    public Hotel() {
        this.quartos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void reservarQuarto(int numeroQuarto, Cliente cliente, String dataCheckIn, String dataCheckOut) {
        for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numeroQuarto && quarto.isDisponivel()) {
                Reserva reserva = new Reserva(quarto, cliente, dataCheckIn, dataCheckOut);
                reservas.add(reserva);
                System.out.println("Reserva realizada com sucesso!");
                return;
            }
        }
        System.out.println("Quarto não disponível.");
    }

    public void listarQuartosDisponiveisPorTipo(String tipo) {
        for (Quarto quarto : quartos) {
            if (quarto.getTipo().equals(tipo) && quarto.isDisponivel()) {
                System.out.println("Quarto número: " + quarto.getNumero());
            }
        }
    }

    public void cancelarReserva(int numeroQuarto) {
        for (Reserva reserva : reservas) {
            if (reserva.getQuarto().getNumero() == numeroQuarto) {
                reserva.cancelar();
                reservas.remove(reserva);
                System.out.println("Reserva cancelada.");
                return;
            }
        }
        System.out.println("Reserva não encontrada.");
    }

    public void gerarRelatorioReservasFuturas() {
        System.out.println("Relatório de reservas futuras:");
        for (Reserva reserva : reservas) {
            System.out.println("Quarto: " + reserva.getQuarto().getNumero() + " - Cliente: " + reserva.getCliente().getNome() +
                    " - Check-in: " + reserva.getDataCheckIn() + " - Check-out: " + reserva.getDataCheckOut());
        }
    }
}
