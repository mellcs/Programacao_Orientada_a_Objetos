public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(String nomeCliente, String cpfCliente, String enderecoCliente) {
        nome = nomeCliente;
        cpf = cpfCliente;
        endereco = enderecoCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }
}

