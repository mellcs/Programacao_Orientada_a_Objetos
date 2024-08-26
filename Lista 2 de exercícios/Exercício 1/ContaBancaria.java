public class ContaBancaria {
    int numeroDaConta;
    double saldo;
    Cliente cliente;

    public ContaBancaria(int numeroDaConta, Cliente cliente) {
        numeroDaConta = numeroDaConta;
        cliente = cliente;
        saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso para a conta " + contaDestino.getNumeroDaConta() + ".");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // main
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "Rua A, 123");
        Cliente cliente2 = new Cliente("Maria Souza", "987.654.321-00", "Rua B, 456");

        // Criando contas bancárias para os clientes
        ContaBancaria conta1 = new ContaBancaria(1, cliente1);
        ContaBancaria conta2 = new ContaBancaria(2, cliente2);

        // Realizando operações
        conta1.depositar(1000.0);
        conta1.sacar(300.0);
        conta1.transferir(conta2, 200.0);

        // Exibindo os saldos finais
        System.out.println("Saldo final da conta 1: R$" + conta1.getSaldo());
        System.out.println("Saldo final da conta 2: R$" + conta2.getSaldo());
    }
}
