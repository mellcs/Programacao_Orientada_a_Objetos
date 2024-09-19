public class Reserva {
    private Quarto quarto;
    private Cliente cliente;
    private String dataCheckIn;
    private String dataCheckOut;

    public Reserva(Quarto quarto, Cliente cliente, String dataCheckIn, String dataCheckOut) {
        this.quarto = quarto;
        this.cliente = cliente;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.quarto.setDisponibilidade(false);
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getDataCheckIn() {
        return dataCheckIn;
    }

    public String getDataCheckOut() {
        return dataCheckOut;
    }

    public void cancelar() {
        this.quarto.setDisponibilidade(true);
    }
}
