public class T {
    private String n;
    private String d;
    private int dur;
    private String e; // "n" (novo), "a" (em andamento), "c" (concluído)

    public T(String n, String d, int dur, String e) {
        this.n = n;
        this.d = d;
        this.dur = dur;
        this.e = e;
    }

    public String getN() {
        return n;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getDetails() {
        return n + " (" + dur + " dias) - " + e;
    }
}
