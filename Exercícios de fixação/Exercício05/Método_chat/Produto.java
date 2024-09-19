public class Produto {
    private String nm;
    private double pr;
    private int est;

    public Produto(String nm, double pr, int est) {
        this.nm = nm;
        this.pr = pr;
        this.est = est;
    }

    public String getNm() {
        return nm;
    }

    public double getPr() {
        return pr;
    }

    public int getEst() {
        return est;
    }

    public void alterarEstoque(int qtd) {
        est += qtd;
    }
}
