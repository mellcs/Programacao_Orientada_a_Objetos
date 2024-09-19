public class Main {
    public static void main(String[] args) {
        Hotel h = new Hotel();

        h.addQ(new Quarto(201, "simples"));
        h.addQ(new Quarto(202, "duplo"));

        Cliente cli = new Cliente("Ana", "123456", "ana@exemplo.com");

        h.reservar(201, cli, "01/10/2024", "05/10/2024");
        h.listarDisp("simples");
        h.gerarRelatorio();
        h.cancelarRes(201);
    }
}
