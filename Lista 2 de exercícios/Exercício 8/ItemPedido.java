public class ItemPedido {
    String produto;
    int quantidade;
    double preco;

    // Construtor para inicializar os atributos do item do pedido
    public ItemPedido(String produto, int quantidade, double preco) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Método para calcular o valor do item (quantidade * preço)
    public double calcularValor() {
        return quantidade * preco;
    }
}
