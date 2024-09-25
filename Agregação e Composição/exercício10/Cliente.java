import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<Pedido> pedidos;

    // Construtor
    public Cliente(String nome) {
        this.nome = nome;
        this.pedidos = new ArrayList<>();
    }

    // Método para adicionar pedido ao cliente
    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido de " + pedido.getQuantidade() + " unidade(s) de " + pedido.getProduto() + " adicionado ao cliente " + nome + ".");
    }

    // Método para listar todos os pedidos do cliente
    public void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido encontrado para o cliente " + nome + ".");
        } else {
            System.out.println("Pedidos do cliente " + nome + ":");
            for (Pedido pedido : pedidos) {
                pedido.exibirInformacoes();
            }
        }
    }

    // Método main para testar a classe Cliente
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente("Ana Pereira");

        // Criando pedidos
        Pedido pedido1 = new Pedido("Laptop", 1);
        Pedido pedido2 = new Pedido("Mouse", 2);
        Pedido pedido3 = new Pedido("Teclado", 1);

        // Adicionando pedidos ao cliente
        cliente.adicionarPedido(pedido1);
        cliente.adicionarPedido(pedido2);
        cliente.adicionarPedido(pedido3);

        // Listando pedidos do cliente
        cliente.listarPedidos();

        // A existência dos pedidos é independente do cliente
        System.out.println("Processo de pedidos finalizado.");
    }
}
