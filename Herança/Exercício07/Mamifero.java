//draw.io cria desenho de hierarquia ou geração inversa de código

public class Mamifero extends Animal{
    protected String alimentacao;
    
    public void setarValores(){
        alimentacao = "leite";
        habitat = "campo";
        nomeCientifico = "Cachorro";
        idade = 5;
    }
    
    public void exibir(){
        System.out.println("Idade: " + idade);
        System.out.println("Alimentação: " + alimentacao);
        System.out.println("Nome científico: " + nomeCientifico);
        System.out.println("Habitat: " + habitat);
    }
    
    public static void main(String[]args){
        Mamifero m = new Mamifero();
        
        m.setarValores();
        m.exibir();
    }
    
}
