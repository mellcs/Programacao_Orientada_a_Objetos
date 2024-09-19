import java.util.ArrayList;
import java.util.Optional;

public class E {
    private ArrayList<P> ps;

    public E() {
        ps = new ArrayList<>();
    }

    public void createP(String n, String dt) {
        ps.add(new P(n, dt));
    }

    public Optional<P> findP(String n) {
        return ps.stream().filter(p -> p.getN().equals(n)).findFirst();
    }

    public void addFToP(String n, F f) {
        findP(n).ifPresent(p -> p.addF(f));
    }

    public void addTToP(String n, T t) {
        findP(n).ifPresent(p -> p.addT(t));
    }

    public void genRelProg(String n) {
        findP(n).ifPresent(p -> {
            System.out.println("Prog rel: " + n);
            p.getTs().forEach(t -> System.out.println(t.getDetails()));
        });
    }

    public void genRelAloc(String n) {
        findP(n).ifPresent(p -> {
            System.out.println("Aloc rel: " + n);
            p.getFs().forEach(f -> System.out.println(f.getN() + " - " + f.getC()));
        });
    }
}
