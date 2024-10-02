//Crie uma classe Produto com um método que exiba o nome e o preço do produto. 
//Crie uma subclasse Eletronico que adicione o atributo garantia. 
//Crie um objeto da subclasse e exiba os dados de um produto eletrônico com seu nome, 
//preço e garantia.

public class Produto {
	protected String nomeProduto;
	protected double precoProduto;
	
	public Produto (String nomeProduto, double precoProduto){
	    this.nomeProduto = nomeProduto;
	    this.precoProduto = precoProduto;
	}
	
	public void exibir(){
	    System.out.println("Produto: " + nomeProduto);
	    System.out.println("Preço: " + precoProduto);
	}
}
