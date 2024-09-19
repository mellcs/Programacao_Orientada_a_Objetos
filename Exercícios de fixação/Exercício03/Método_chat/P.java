import java.util.ArrayList;

public class P {
    private String n;
    private String dt;
    private ArrayList<T> ts;
    private ArrayList<F> fs;

    public P(String n, String dt) {
        this.n = n;
        this.dt = dt;
        this.ts = new ArrayList<>();
        this.fs = new ArrayList<>();
    }

    public void addT(T t) {
        ts.add(t);
    }

    public void addF(F f) {
        fs.add(f);
    }

    public ArrayList<T> getTs() {
        return ts;
    }

    public ArrayList<F> getFs() {
        return fs;
    }

    public String getN() {
        return n;
    }
}
