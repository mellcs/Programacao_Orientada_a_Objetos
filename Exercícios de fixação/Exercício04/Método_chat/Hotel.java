import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hotel {
    private List<Quarto> qrt;
    private List<Reserva> res;

    public Hotel() {
        qrt = new ArrayList<>();
        res = new ArrayList<>();
    }

    public void addQ(Quarto q) {
        qrt.add(q);
    }

    public void reservar(int num, Cliente c, String in, String out) {
        qrt.stream()
            .filter(q -> q.getNum() == num && q.isDisp())
            .findFirst()
            .ifPresentOrElse(
                q -> res.add(new Reserva(q, c, in, out)),
                () -> System.out.println("Quarto indisponível.")
            );
    }

    public void listarDisp(String tp) {
        qrt.stream()
            .filter(q -> q.getTp().equals(tp) && q.isDisp())
            .map(Quarto::getInfo)
            .forEach(System.out::println);
    }

    public void cancelarRes(int num) {
        res.stream()
            .filter(r -> r.getQ().getNum() == num)
            .findFirst()
            .ifPresentOrElse(
                r -> {
                    r.cancel();
                    res.remove(r);
                    System.out.println("Reserva cancelada.");
                },
                () -> System.out.println("Reserva não encontrada.")
            );
    }

    public void gerarRelatorio() {
        res.forEach(r -> System.out.println(r.getC().getInfo() + " - Quarto: " + r.getQ().getNum()));
    }
}
