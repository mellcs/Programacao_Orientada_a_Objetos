import java.util.Date;

public class Pedido {
    private CarrinhoDeCompras carrinho;
    private String status; // processando, enviado, entregue
    private Date data;

    public Pedido(CarrinhoDeCompras carrinho) {
        this.carrinho = carrinho;
        this.status = "processando";
        this.data = new Date();
    }

    public CarrinhoDeCompras getCarrinho() {
        return carrinho;
    }

    public String getStatus() {
        return status;
    }

    public void mudarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public Date getData() {
        return data;
    }
}
