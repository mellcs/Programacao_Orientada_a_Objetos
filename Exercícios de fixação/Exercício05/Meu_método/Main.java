public class Main {
    public static void main(String[] args) {
        LojaVirtual loja = new LojaVirtual();

        // Adicionar produtos
        Produto produto1 = new Produto("Camiseta", 50.0, 100);
        Produto produto2 = new Produto("Calça", 120.0, 50);
        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);

        // Criar cliente
        Cliente cliente = new Cliente("Lucas", "Rua A", "lucas@example.com");

        // Criar carrinho e adicionar produtos
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(cliente);
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);

        // Criar pedido
        Pedido pedido = new Pedido(carrinho);
        loja.processarPedido(pedido);

        // Gerar relatório de vendas
        loja.gerarRelatorioVendas();
    }
}
