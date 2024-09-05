public class Funcionario {
    // Atributos privados
    private String nome;
    private double salario;
    private String cargo;

    // Construtor
    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    // Métodos get para acessar os atributos

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    // Método para aumentar o salário com validação
    public void aumentarSalario(double percentual) {
        if (percentual > 0 && percentual <= 20) {
            salario += salario * (percentual / 100);
        } else {
            System.out.println("Aumento inválido. O percentual deve ser entre 0% e 20%.");
        }
    }

    // Método para promover com validação básica
    public void promover(String novoCargo) {
        // Validação básica: Apenas permite a promoção para cargos que contenham "Gerente"
        if (cargo.equals("Assistente") && novoCargo.contains("Gerente")) {
            this.cargo = novoCargo;
        } else if (cargo.equals("Analista") && novoCargo.contains("Gerente")) {
            this.cargo = novoCargo;
        } else if (cargo.equals("Gerente") && novoCargo.contains("Diretor")) {
            this.cargo = novoCargo;
        } else {
            System.out.println("Promoção inválida. O novo cargo não é compatível.");
        }
    }

    // Método para exibir os dados completos do funcionário
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Cargo: " + cargo);
    }
}
