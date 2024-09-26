public class Pessoa{
    protected String nome;
    protected int idade;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void atribuir(){
        nome = "Joana";
        idade = 24;
    }
    
    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
    
}
