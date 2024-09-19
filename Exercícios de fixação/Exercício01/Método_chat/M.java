import java.util.Date;

public class M {
    public static void main(String[] args) {
        B b = new B();

        L l1 = new L("O Senhor dos Anéis", "J.R.R. Tolkien", 5);
        U u1 = new U("Maria Silva", "123.456.789-00");

        b.addL(l1);
        E e1 = new E(l1, u1, new Date(), null);

        b.regE(l1, u1, e1);
        b.lst();
    }
}
