import java.util.ArrayList;

public class Projeto {
    private String nome;
    private String dataInicio;
    private ArrayList<Tarefa> tarefas;
    private ArrayList<Funcionario> funcionarios;

    public Projeto(String nome, String dataInicio) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.tarefas = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void alocarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public String getNome() {
        return nome;
    }
}
