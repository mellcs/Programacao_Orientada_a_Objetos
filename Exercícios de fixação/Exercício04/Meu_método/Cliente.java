public class Cliente {
    private String nome;
    private String documento;
    private String contato;

    public Cliente(String nome, String documento, String contato) {
        this.nome = nome;
        this.documento = documento;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public String getContato() {
        return contato;
    }
}
