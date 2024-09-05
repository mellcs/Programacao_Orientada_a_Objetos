public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Funcionario
        Funcionario funcionario1 = new Funcionario("Carlos Souza", 3000.00, "Assistente");

        // Exibindo os dados iniciais do funcionário
        funcionario1.mostrarDados();

        // Tentando aumentar o salário em 25% (inválido)
        funcionario1.aumentarSalario(25);  // Vai exibir mensagem de erro

        // Aumentando o salário em 15% (válido)
        funcionario1.aumentarSalario(15);
        System.out.println("Salário após aumento: " + funcionario1.getSalario());

        // Tentando promover para um cargo não compatível
        funcionario1.promover("Diretor");  // Vai exibir mensagem de erro

        // Promovendo para um cargo compatível
        funcionario1.promover("Gerente de Projetos");
        System.out.println("Cargo após promoção: " + funcionario1.getCargo());

        // Exibindo os dados atualizados
        funcionario1.mostrarDados();
    }
}
