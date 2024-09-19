public class Quarto implements Entidade {
    private int num;
    private String tp; // "simples", "duplo", "suite"
    private boolean disp;

    public Quarto(int num, String tp) {
        this.num = num;
        this.tp = tp;
        this.disp = true;
    }

    public int getNum() {
        return num;
    }

    public String getTp() {
        return tp;
    }

    public boolean isDisp() {
        return disp;
    }

    public void setDisp(boolean disp) {
        this.disp = disp;
    }

    @Override
    public String getInfo() {
        return "Quarto " + num + " (" + tp + ")";
    }
}
