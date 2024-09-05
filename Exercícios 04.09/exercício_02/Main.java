public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("João Silva", "123456", 500.00);

        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Número da Conta: " + conta1.getNumeroConta());
        System.out.println("Saldo: " + conta1.getSaldo());

        conta1.depositar(200.00);
        System.out.println("Saldo após depósito: " + conta1.getSaldo());

        conta1.sacar(800.00); 

        conta1.sacar(300.00);
        System.out.println("Saldo após saque: " + conta1.getSaldo());
    }
}
