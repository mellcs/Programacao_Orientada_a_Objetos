public class Main {
    public static void main(String[] args) {
        Frot f = new Frot();

        V v1 = new V("Caminhão", "ABC-1234", 1000);
        M m1 = new M("João Silva", "CNH123456");

        f.addV(v1);
        f.regVia("ABC-1234", m1, "São Paulo", "Rio de Janeiro", 430.0);

        f.listViasByPl("ABC-1234");
        System.out.println("Distância total: " + f.calcDisTot());
    }
}
