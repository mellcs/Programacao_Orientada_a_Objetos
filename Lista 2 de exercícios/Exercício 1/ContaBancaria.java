public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;
    private Cliente cliente;

    public ContaBancaria(int numeroConta, Cliente clienteConta) {
        numeroDaConta = numeroConta;
        cliente = clienteConta;
        saldo = 0.0; // Saldo inicial é 0
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            saldo += valorDeposito;
            System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valorSaque) {
        if (valorSaque > 0 && valorSaque <= saldo) {
            saldo -= valorSaque;
            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valorTransferencia) {
        if (valorTransferencia > 0 && valorTransferencia <= saldo) {
            saldo -= valorTransferencia;
            contaDestino.depositar(valorTransferencia);
            System.out.println("Transferência de R$" + valorTransferencia + " realizada com sucesso para a conta " + contaDestino.getNumeroDaConta() + ".");
        } else {
            System.out.println("Saldo insuficiente ou valor de transferência inválido.");
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
}
