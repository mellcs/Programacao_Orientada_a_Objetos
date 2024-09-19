public class Via {
    private V v;
    private M m;
    private String org;
    private String des;
    private double dis;

    public Via(V v, M m, String org, String des, double dis) {
        this.v = v;
        this.m = m;
        this.org = org;
        this.des = des;
        this.dis = dis;
    }

    public V getV() {
        return v;
    }

    public double getDis() {
        return dis;
    }

    public String getDesc() {
        return "Via de " + org + " para " + des + " (" + dis + " km)";
    }
}
