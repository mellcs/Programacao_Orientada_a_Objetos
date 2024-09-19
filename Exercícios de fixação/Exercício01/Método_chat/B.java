import java.util.ArrayList;

public class B {
    ArrayList<L> ld;
    ArrayList<E> er;

    public B() {
        this.ld = new ArrayList<>();
        this.er = new ArrayList<>();
    }

    public void addL(L l) {
        ld.add(l);
    }

    public void regE(L l, U u, E e) {
        l.e();
        er.add(e);
    }

    public void lst() {
        for (L l : ld) {
            System.out.println("T: " + l.getT() + ", A: " + l.getA() + ", Q: " + l.getQ());
        }
    }
}
