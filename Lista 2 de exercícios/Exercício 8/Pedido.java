import java.util.ArrayList;

public class Pedido {
    int numero;
    String data;
    ArrayList<ItemPedido> itens;

    // Construtor para inicializar o pedido
    public Pedido(int numero, String data) {
        this.numero = numero;
        this.data = data;
        this.itens = new ArrayList<>();
    }

    // Método para adicionar um item ao pedido
    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    // Método para remover um item do pedido pelo nome do produto
    public void removerItem(String produto) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).produto.equals(produto)) {
                itens.remove(i);
                break;
            }
        }
    }

    // Método para calcular o valor total do pedido
    public double calcularValorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularValor();
        }
        return total;
    }

    public static void main(String[] args) {
        // Criando um pedido
        Pedido pedido = new Pedido(1, "27/08/2024");

        // Adicionando itens ao pedido
        pedido.adicionarItem(new ItemPedido("Notebook", 1, 3000.0));
        pedido.adicionarItem(new ItemPedido("Mouse", 2, 50.0));

        // Calculando o valor total do pedido
        System.out.println("Valor total do pedido: R$" + pedido.calcularValorTotal());

        // Removendo um item do pedido
        pedido.removerItem("Mouse");

        // Calculando o valor total do pedido após a remoção
        System.out.println("Valor total do pedido após remoção: R$" + pedido.calcularValorTotal());
    }
}
