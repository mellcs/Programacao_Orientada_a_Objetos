public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        // Criando um novo projeto
        empresa.criarProjeto("Desenvolvimento de App", "01/09/2024");

        // Adicionando funcionários ao projeto
        Funcionario dev = new Funcionario("Maria", "Desenvolvedora");
        empresa.alocarFuncionarioAoProjeto("Desenvolvimento de App", dev);

        // Adicionando tarefas ao projeto
        Tarefa tarefa1 = new Tarefa("Design da interface", "Criar o design da interface do app", 10, "novo");
        empresa.adicionarTarefaAoProjeto("Desenvolvimento de App", tarefa1);

        // Gerando relatórios
        empresa.gerarRelatorioDeProgresso("Desenvolvimento de App");
        empresa.gerarRelatorioDeAlocacao("Desenvolvimento de App");
    }
}
