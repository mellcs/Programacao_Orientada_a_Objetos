public class Produto {
    // Atributos privados
    private String nome;
    private int quantidadeEstoque;
    private double preco;

    // Construtor
    public Produto(String nome, int quantidadeEstoque, double preco) {
        this.nome = nome;
        setPreco(preco);  // Validação aplicada no setPreco
        this.quantidadeEstoque = Math.max(quantidadeEstoque, 0);  // Garante que a quantidade inicial não seja negativa
    }

    // Métodos get e set para nome e preco

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        // Validação: O preço não pode ser zero ou negativo
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço deve ser maior que zero.");
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    // Método para adicionar estoque
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
        } else {
            System.out.println("A quantidade a ser adicionada deve ser positiva.");
        }
    }

    // Método para vender (remover do estoque)
    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Quantidade de venda inválida ou insuficiente em estoque.");
        }
    }
}
