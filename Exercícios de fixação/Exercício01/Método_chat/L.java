public class L {
    String t;
    String a;
    int q;

    public L(String t, String a, int q) {
        this.t = t;
        this.a = a;
        this.q = q;
    }

    public String getT() {
        return t;
    }

    public String getA() {
        return a;
    }

    public int getQ() {
        return q;
    }

    public void e() {
        if (q > 0) {
            q--;
        } else {
            System.out.println("Indisponível.");
        }
    }

    public void d() {
        q++;
    }
}
