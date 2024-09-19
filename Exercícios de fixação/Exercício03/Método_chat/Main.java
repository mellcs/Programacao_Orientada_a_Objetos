public class Main {
    public static void main(String[] args) {
        E e = new E();

        e.createP("ProjX", "01/09/2024");

        F f1 = new F("Ana", "Dev");
        e.addFToP("ProjX", f1);

        T t1 = new T("UX/UI", "Desenvolvimento", 12, "n");
        e.addTToP("ProjX", t1);

        e.genRelProg("ProjX");
        e.genRelAloc("ProjX");
    }
}
