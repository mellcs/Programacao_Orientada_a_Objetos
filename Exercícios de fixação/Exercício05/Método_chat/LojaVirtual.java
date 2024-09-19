import java.util.*;
import java.util.stream.Collectors;

public class LojaVirtual {
    private List<Produto> prods;
    private List<Pedido> pedidos;

    public LojaVirtual() {
        this.prods = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void addProd(Produto p) {
        prods.add(p);
    }

    public void procPedido(Pedido ped) {
        ped.getCarrinho().getProds().forEach((p, qtd) -> p.alterarEstoque(-qtd));
        pedidos.add(ped);
    }

    public void gerarRelatorioVendas() {
        pedidos.forEach(p -> {
            System.out.println("Cliente: " + p.getCarrinho().getCli().getN() +
                " - Total: R$" + p.getCarrinho().calcTotal());
        });
    }

    public List<Produto> getEstoqueBaixo() {
        return prods.stream()
            .filter(p -> p.getEst() < 10)
            .collect(Collectors.toList());
    }
}
