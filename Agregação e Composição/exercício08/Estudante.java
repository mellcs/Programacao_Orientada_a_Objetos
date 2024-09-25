public class Estudante {
    private String nome;
    private String matricula;

    // Construtor
    public Estudante(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    // Método para exibir informações do estudante
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Matrícula: " + matricula);
    }
}
