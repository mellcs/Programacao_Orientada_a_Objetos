import java.util.ArrayList;

public class Escola {
    private String nome;
    private ArrayList<Estudante> estudantes;

    // Construtor
    public Escola(String nome) {
        this.nome = nome;
        this.estudantes = new ArrayList<>();
    }

    // Método para matricular estudante na escola
    public void matricularEstudante(Estudante estudante) {
        estudantes.add(estudante);
        System.out.println("Estudante " + estudante.getNome() + " matriculado na escola " + nome + ".");
    }

    // Método para listar todos os estudantes da escola
    public void listarEstudantes() {
        if (estudantes.isEmpty()) {
            System.out.println("Nenhum estudante matriculado na escola " + nome + ".");
        } else {
            System.out.println("Estudantes da escola " + nome + ":");
            for (Estudante estudante : estudantes) {
                estudante.exibirInformacoes();
            }
        }
    }

    // Método main para testar a classe Escola
    public static void main(String[] args) {
        // Criando uma escola
        Escola escola = new Escola("Escola Municipal de Educação");

        // Criando estudantes
        Estudante estudante1 = new Estudante("João Silva", "12345");
        Estudante estudante2 = new Estudante("Maria Oliveira", "67890");

        // Matriculando estudantes na escola
        escola.matricularEstudante(estudante1);
        escola.matricularEstudante(estudante2);

        // Listando estudantes da escola
        escola.listarEstudantes();

        // A escola e seus estudantes podem ser considerados independentes
        System.out.println("Processo de matrícula finalizado.");
    }
}
