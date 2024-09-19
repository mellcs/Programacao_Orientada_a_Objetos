public class Main {
    public static void main(String[] args) {
        LojaVirtual loja = new LojaVirtual();

        Produto p1 = new Produto("Camiseta", 50, 20);
        Produto p2 = new Produto("Calça", 120, 5);
        loja.addProd(p1);
        loja.addProd(p2);

        Cliente cli = new Cliente("Lucas", "Rua A", "lucas@mail.com");

        CarrinhoDeCompras carr = new CarrinhoDeCompras(cli);
        carr.addProd(p1, 2);
        carr.addProd(p2, 1);

        Pedido ped = new Pedido(carr);
        loja.procPedido(ped);
        loja.gerarRelatorioVendas();

        System.out.println("Produtos com estoque baixo: " + loja.getEstoqueBaixo().size());
    }
}
