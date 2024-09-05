public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Produto
        Produto produto1 = new Produto("Notebook", 10, 2500.00);

        // Exibindo as informações iniciais do produto
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Quantidade em Estoque: " + produto1.getQuantidadeEstoque());
        System.out.println("Preço: " + produto1.getPreco());

        // Adicionando estoque
        produto1.adicionarEstoque(5);
        System.out.println("Quantidade em Estoque após adicionar: " + produto1.getQuantidadeEstoque());

        // Tentando vender mais do que o disponível no estoque
        produto1.vender(20);  // Vai exibir mensagem de erro

        // Vendendo uma quantidade válida
        produto1.vender(8);
        System.out.println("Quantidade em Estoque após venda: " + produto1.getQuantidadeEstoque());

        // Tentando definir um preço inválido
        produto1.setPreco(-100.00);  // Vai exibir mensagem de erro
    }
}
