public class Periferico {
    private String nome; // nome do periférico
    private String tipo; // tipo do periférico (mouse, teclado, monitor)

    // Construtor
    public Periferico(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    // Método para exibir informações do periférico
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Tipo: " + tipo);
    }
}
