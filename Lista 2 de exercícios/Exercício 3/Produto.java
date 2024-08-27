public class Produto {
    String nome;
    double preco;
    int quantidadeEmEstoque;

    // Construtor para inicializar os atributos
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        nome = nome;
        preco = preco;
        quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Adiciona uma quantidade ao estoque
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEmEstoque += quantidade;
        }
    }

    // Remove uma quantidade do estoque
    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
        }
    }

    // Ajusta o preço do produto com base em um percentual
    public void ajustarPreco(double percentual) {
        if (percentual != 0) {
            preco += preco * (percentual / 100);
        }
    }

    public static void main(String[] args) {
        // Criando um produto
        Produto produto = new Produto("Camiseta", 50.0, 100);

        // Exibindo os detalhes do produto
        System.out.println("Produto: " + produto.nome);
        System.out.println("Preço: R$" + produto.preco);
        System.out.println("Quantidade em estoque: " + produto.quantidadeEmEstoque);

        // Adicionando e removendo estoque
        produto.adicionarEstoque(20);
        produto.removerEstoque(15);

        // Ajustando o preço com um aumento de 10%
        produto.ajustarPreco(10.0);

        // Exibindo os detalhes atualizados do produto
        System.out.println("Produto: " + produto.nome);
        System.out.println("Preço ajustado: R$" + produto.preco);
        System.out.println("Quantidade em estoque: " + produto.quantidadeEmEstoque);
    }
}
