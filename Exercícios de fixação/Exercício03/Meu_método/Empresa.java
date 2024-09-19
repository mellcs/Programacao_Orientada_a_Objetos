import java.util.ArrayList;

public class Empresa {
    private ArrayList<Projeto> projetos;

    public Empresa() {
        projetos = new ArrayList<>();
    }

    public void criarProjeto(String nome, String dataInicio) {
        Projeto novoProjeto = new Projeto(nome, dataInicio);
        projetos.add(novoProjeto);
    }

    public void alocarFuncionarioAoProjeto(String nomeProjeto, Funcionario funcionario) {
        for (Projeto projeto : projetos) {
            if (projeto.getNome().equals(nomeProjeto)) {
                projeto.alocarFuncionario(funcionario);
                return;
            }
        }
    }

    public void adicionarTarefaAoProjeto(String nomeProjeto, Tarefa tarefa) {
        for (Projeto projeto : projetos) {
            if (projeto.getNome().equals(nomeProjeto)) {
                projeto.adicionarTarefa(tarefa);
                return;
            }
        }
    }

    public void gerarRelatorioDeProgresso(String nomeProjeto) {
        for (Projeto projeto : projetos) {
            if (projeto.getNome().equals(nomeProjeto)) {
                System.out.println("Relatório de Progresso do Projeto: " + nomeProjeto);
                for (Tarefa tarefa : projeto.getTarefas()) {
                    System.out.println("Tarefa: " + tarefa.getNome() + " - Estado: " + tarefa.getEstado());
                }
                return;
            }
        }
    }

    public void gerarRelatorioDeAlocacao(String nomeProjeto) {
        for (Projeto projeto : projetos) {
            if (projeto.getNome().equals(nomeProjeto)) {
                System.out.println("Relatório de Alocação de Funcionários no Projeto: " + nomeProjeto);
                for (Funcionario funcionario : projeto.getFuncionarios()) {
                    System.out.println("Funcionário: " + funcionario.getNome() + " - Cargo: " + funcionario.getCargo());
                }
                return;
            }
        }
    }
}
