public class Aluno {
    String nome;
    String matricula;
    Disciplina[] disciplinas;
    int indice;

    public Aluno(String nome, String matricula, int maxDisciplinas) {
        nome = nome;
        matricula = matricula;
        disciplinas = new Disciplina[maxDisciplinas];
        indice = 0;
    }

    public void matricularEmDisciplina(Disciplina disciplina) {
        disciplinas[indice] = disciplina;
        indice++;
    }

    public double calcularMedia() {
        double soma = 0.0;
        for (int i = 0; i < indice; i++) {
            soma += disciplinas[i].nota;
        }
        return soma / indice;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carlos Silva", "20210001", 3);

        Disciplina matematica = new Disciplina("Matemática", 8.5);
        Disciplina portugues = new Disciplina("Português", 7.0);
        Disciplina historia = new Disciplina("História", 9.0);

        aluno.matricularEmDisciplina(matematica);
        aluno.matricularEmDisciplina(portugues);
        aluno.matricularEmDisciplina(historia);

        double media = aluno.calcularMedia();
        System.out.println("Média das notas: " + media);
    }
}
