import java.util.ArrayList;

public class LojaVirtual {
    private ArrayList<Produto> produtos;
    private ArrayList<Pedido> pedidos;

    public LojaVirtual() {
        this.produtos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void processarPedido(Pedido pedido) {
        for (Produto produto : pedido.getCarrinho().getProdutos()) {
            produto.diminuirEstoque(1);
        }
        pedidos.add(pedido);
        System.out.println("Pedido processado.");
    }

    public void gerarRelatorioVendas() {
        System.out.println("Relatório de Vendas:");
        for (Pedido pedido : pedidos) {
            System.out.println("Cliente: " + pedido.getCarrinho().getCliente().getNome() +
                " - Data: " + pedido.getData() + " - Status: " + pedido.getStatus() +
                " - Valor total: R$" + pedido.getCarrinho().calcularValorTotal());
        }
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}
