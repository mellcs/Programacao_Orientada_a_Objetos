import java.util.ArrayList;

public class Empresa {
    ArrayList<Funcionario> funcionarios;

    // Construtor para inicializar a lista de funcionários
    public Empresa() {
        funcionarios = new ArrayList<>();
    }

    // Método para contratar um novo funcionário
    public void contratarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    // Método para demitir um funcionário pelo nome
    public void demitirFuncionario(String nome) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).nome.equals(nome)) {
                funcionarios.remove(i);
                break;
            }
        }
    }

    // Método para calcular a folha de pagamento total da empresa
    public double calcularFolhaDePagamento() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.salario;
        }
        return total;
    }

    public static void main(String[] args) {
        // Criando a empresa
        Empresa empresa = new Empresa();

        // Contratando funcionários
        empresa.contratarFuncionario(new Funcionario("Ana", 5000.0));
        empresa.contratarFuncionario(new Funcionario("Carlos", 3000.0));
        empresa.contratarFuncionario(new Funcionario("Maria", 4000.0));

        // Calculando a folha de pagamento
        System.out.println("Folha de pagamento total: R$" + empresa.calcularFolhaDePagamento());

        // Demitindo um funcionário
        empresa.demitirFuncionario("Carlos");

        // Calculando a folha de pagamento após a demissão
        System.out.println("Folha de pagamento após demissão: R$" + empresa.calcularFolhaDePagamento());
    }
}
