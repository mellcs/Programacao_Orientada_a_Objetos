public class Funcionario {
    private String nome;
    private String cargo;

    // Construtor
    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    // Método para exibir informações do funcionário
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Cargo: " + cargo);
    }
}
