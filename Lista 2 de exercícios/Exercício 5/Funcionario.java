public class Funcionario {
    String nome;
    double salario;
    String cargo;

    // Construtor para inicializar os atributos do funcionário
    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    // Método para calcular o bônus (deve ser sobrescrito nas classes derivadas)
    public double calcularBonus() {
        return 0.0;
    }
}
