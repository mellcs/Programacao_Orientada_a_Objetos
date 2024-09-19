public class Cliente implements Entidade {
    private String n;
    private String doc;
    private String cont;

    public Cliente(String n, String doc, String cont) {
        this.n = n;
        this.doc = doc;
        this.cont = cont;
    }

    @Override
    public String getInfo() {
        return "Cliente: " + n + " - Documento: " + doc;
    }
}
