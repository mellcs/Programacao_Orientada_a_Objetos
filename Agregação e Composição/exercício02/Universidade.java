import java.util.ArrayList;

public class Universidade {
    private String nome;
    private ArrayList<Professor> professores;

    // Construtor
    public Universidade(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    // Método para adicionar professor
    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    // Método para listar todos os professores
    public void listarProfessores() {
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");
        } else {
            System.out.println("Professores da Universidade " + nome + ":");
            for (Professor professor : professores) {
                professor.exibirInformacoes();
            }
        }
    }

    // Método main dentro da classe Universidade
    public static void main(String[] args) {
        // Criação de professores
        Professor professor1 = new Professor("Carlos Silva", "Matemática");
        Professor professor2 = new Professor("Ana Pereira", "História");

        // Criação da universidade
        Universidade universidade = new Universidade("Universidade XYZ");

        // Adicionando professores à universidade
        universidade.adicionarProfessor(professor1);
        universidade.adicionarProfessor(professor2);

        // Listando os professores da universidade
        universidade.listarProfessores();
    }
}
