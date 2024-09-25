public class Pedido {
    private String produto; // nome do produto
    private int quantidade; // quantidade do produto

    // Construtor
    public Pedido(String produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    // Getters
    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Método para exibir informações do pedido
    public void exibirInformacoes() {
        System.out.println("Produto: " + produto + ", Quantidade: " + quantidade);
    }
}
