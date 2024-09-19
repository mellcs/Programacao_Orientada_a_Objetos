import java.util.*;

public class CarrinhoDeCompras {
    private Cliente cli;
    private Map<Produto, Integer> prods;

    public CarrinhoDeCompras(Cliente cli) {
        this.cli = cli;
        this.prods = new HashMap<>();
    }

    public void addProd(Produto p, int qtd) {
        prods.merge(p, qtd, Integer::sum);
    }

    public void removeProd(Produto p) {
        prods.remove(p);
    }

    public double calcTotal() {
        return prods.entrySet().stream()
            .mapToDouble(e -> e.getKey().getPr() * e.getValue())
            .sum();
    }

    public Cliente getCli() {
        return cli;
    }

    public Map<Produto, Integer> getProds() {
        return prods;
    }
}
