public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta;

    public ContaBancaria(String titular, String numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        setSaldo(saldoInicial);  
    }

//get e set

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("O saldo não pode ser negativo.");
        }
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

  
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }
}
