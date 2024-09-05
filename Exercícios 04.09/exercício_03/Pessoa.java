public class Pessoa {
    private String nome;
    private int idade;
    private final String cpf; 

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        setIdade(idade); 
        this.cpf = cpf;   
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("A idade deve ser maior que zero.");
        }
    }

    public String getCpf() {
        return cpf;  
    }
  
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
    }
}
