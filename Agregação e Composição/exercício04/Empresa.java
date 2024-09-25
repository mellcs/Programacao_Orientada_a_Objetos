import java.util.ArrayList;

public class Empresa {
    private String nome;
    private ArrayList<Funcionario> funcionarios;

    // Construtor
    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    // Método para contratar funcionário
    public void contratarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário " + funcionario.getNome() + " contratado.");
    }

    // Método para demitir funcionário
    public void demitirFuncionario(String nomeFuncionario) {
        Funcionario funcionarioParaDemitir = null;
        for (Funcionario f : funcionarios) {
            if (f.getNome().equals(nomeFuncionario)) {
                funcionarioParaDemitir = f;
                break;
            }
        }
        if (funcionarioParaDemitir != null) {
            funcionarios.remove(funcionarioParaDemitir);
            System.out.println("Funcionário " + nomeFuncionario + " demitido.");
        } else {
            System.out.println("Funcionário " + nomeFuncionario + " não encontrado.");
        }
    }

    // Método para listar todos os funcionários
    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário na empresa.");
        } else {
            System.out.println("Funcionários da empresa " + nome + ":");
            for (Funcionario f : funcionarios) {
                f.exibirInformacoes();
            }
        }
    }

    // Método main para testar a classe Empresa
    public static void main(String[] args) {
        // Criando uma empresa
        Empresa empresa = new Empresa("Tech Solutions");

        // Criando funcionários
        Funcionario func1 = new Funcionario("Carlos Silva", "Desenvolvedor");
        Funcionario func2 = new Funcionario("Ana Pereira", "Designer");

        // Contratando funcionários
        empresa.contratarFuncionario(func1);
        empresa.contratarFuncionario(func2);

        // Listando funcionários
        empresa.listarFuncionarios();

        // Demitindo um funcionário
        empresa.demitirFuncionario("Ana Pereira");

        // Listando novamente após demissão
        empresa.listarFuncionarios();
    }
}
