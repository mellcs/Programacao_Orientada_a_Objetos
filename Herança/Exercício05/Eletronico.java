//Crie uma classe Produto com um método que exiba o nome e o preço do produto. 
//Crie uma subclasse Eletronico que adicione o atributo garantia. 
//Crie um objeto da subclasse e exiba os dados de um produto eletrônico com seu nome, 
//preço e garantia.

public class Eletronico extends Produto {
    protected String garantia;
    
    public Eletronico (String nomeProduto, double precoProduto, String garantia){
        super(nomeProduto, precoProduto);
        this.garantia = garantia;
    }
    
    public void exibeer() {
        exibir();
        System.out.println("Tempo de garantia: " + garantia);
    }
    
    public static void main(String[] args){
        Eletronico eletronico = new Eletronico("Fone de ouvido ", 29.25, "Um ano");
        
        eletronico.exibeer();
    }
    
}
