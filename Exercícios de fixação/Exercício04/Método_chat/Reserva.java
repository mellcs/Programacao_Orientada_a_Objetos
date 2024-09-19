public class Reserva {
    private Quarto q;
    private Cliente c;
    private String in;
    private String out;

    public Reserva(Quarto q, Cliente c, String in, String out) {
        this.q = q;
        this.c = c;
        this.in = in;
        this.out = out;
        this.q.setDisp(false);
    }

    public Quarto getQ() {
        return q;
    }

    public Cliente getC() {
        return c;
    }

    public String getIn() {
        return in;
    }

    public String getOut() {
        return out;
    }

    public void cancel() {
        this.q.setDisp(true);
    }
}
