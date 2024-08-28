// Classe derivada Gerente
class Gerente extends Funcionario {
    double bonusFixo;

    public Gerente(String nome, double salario, double bonusFixo) {
        super(nome, salario, "Gerente");
        this.bonusFixo = bonusFixo;
    }

    @Override
    public double calcularBonus() {
        return bonusFixo;
    }
}

// Classe derivada Vendedor
class Vendedor extends Funcionario {
    double totalVendas;

    public Vendedor(String nome, double salario, double totalVendas) {
        super(nome, salario, "Vendedor");
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularBonus() {
        return totalVendas * 0.05; // Exemplo: bônus de 5% sobre o total de vendas
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um gerente com um bônus fixo
        Gerente gerente = new Gerente("Ana", 10000.0, 2000.0);
        System.out.println("Gerente: " + gerente.nome + ", Bônus: R$" + gerente.calcularBonus());

        // Criando um vendedor com um total de vendas
        Vendedor vendedor = new Vendedor("Carlos", 3000.0, 50000.0);
        System.out.println("Vendedor: " + vendedor.nome + ", Bônus: R$" + vendedor.calcularBonus());
    }
}
